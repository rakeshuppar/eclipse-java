package com.xworkz.application.service;

import com.xworkz.application.dto.DairyDTO;
import com.xworkz.application.exception.InvalidFestivalException;
import com.xworkz.application.repository.DairyRepository;
import com.xworkz.application.util.DairyUtil;

public class DairyServiceImp implements DairyService {

	private DairyRepository repo;

	public DairyServiceImp(DairyRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(DairyDTO dto) throws InvalidFestivalException {
		System.out.println("Running validThen Save in DairyService Imp");

		if (dto != null) {
			System.out.println("dto is not null");

			String name = dto.getName();
			String loc = dto.getLocation();
			double open = dto.getOpen();
			double close = dto.getClose();
			String owner = dto.getOwnerName();

			boolean validName = false;
			boolean validLoc = false;
			boolean validOpen = false;
			boolean validClose = false;
			boolean validOwner = false;

			if (DairyUtil.validString(name)) {
				System.out.println("valid name");
				validName = true;
			} else {
				System.err.println("invalid name");
			}

			if (DairyUtil.validString(loc)) {
				System.out.println("valid Location");
				validLoc = true;
			} else {
				System.err.println("invalid location");
			}

			if (DairyUtil.validnum(open)) {
				System.out.println("valid Opening");
				validOpen = true;
			} else {
				System.err.println("invalid opening");
			}

			if (DairyUtil.validnum(close)) {
				System.out.println("valid close");
				validClose = true;
			} else {
				System.err.println("invalid close");
			}

			if (DairyUtil.validString(owner)) {
				System.out.println("valid Owner");
				validOwner = true;
			} else {
				System.err.println("invalid owner");
			}

			if (DairyUtil.validFlag(validName, validLoc, validOpen, validClose, validOwner)) {
				System.out.println("Valid all the data");
				boolean exist = this.repo.isExist(dto);
				if (!exist) {
					System.out.println("dto is exists");
					boolean saved = this.repo.save(dto);
					return saved;
				} else {
					System.err.println("not valid data");
					throw new InvalidFestivalException(
							"Invalid Exception is by InvalidFestivalException, Data terminate");
				}

			}
			return false;

		}
		return false;

	}

	@Override
	public boolean isExist(DairyDTO dto) throws InvalidFestivalException {
		if (this.validThenSave(dto)) {
			return this.repo.isExist(dto);
		}
		return false;

	}

	@Override
	public boolean find(DairyDTO dto) throws InvalidFestivalException {
		if (this.validThenSave(dto)) {
			return this.repo.find(dto);
		}
		return false;
	}

	@Override
	public DairyDTO findByName(String name) {
		if (DairyUtil.validString(name)) {
			return this.repo.findByName(name);
		}
		return null;
	}

	@Override
	public double openFindByName(String name) {
		if (DairyUtil.validString(name)) {
			return this.repo.openFindByName(name);
		}
		return 0;
	}

	@Override
	public DairyDTO findByNameorOpenorClose(String name, double open, double close) {
		if (DairyUtil.validString(name) || DairyUtil.validnum(open) || DairyUtil.validnum(close)) {
			return this.repo.findByNameorOpenorClose(name, open, close);

		}
		return null;
	}

	@Override
	public double openFindByNameAndClose(String name, double close) {
		if (DairyUtil.validString(name) && DairyUtil.validnum(close)) {
			return this.repo.openFindByNameAndClose(name, close);
		}
		return 0;
	}

	@Override
	public DairyDTO[] findAll() {
		DairyDTO[] owndto = repo.findAll();
		for (int i = 0; i < owndto.length; i++) {
			if (owndto[i] != null) {
				System.out.println("repo:" + i + " " + owndto[i]);
			}
		}

		return owndto;
	}

	@Override
	public int total() {

		return this.repo.total();
	}

}
