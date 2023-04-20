package com.xworkz.application.repository;

import com.xworkz.application.dto.SoftwareDTO;

public class SoftwareRepoImp implements SoftwareRepository {

	private SoftwareDTO[] softwareDTOs = new SoftwareDTO[3];
	private int index = 0;

	@Override
	public boolean save(SoftwareDTO repo) {
		if (this.index < this.softwareDTOs.length) {
			this.softwareDTOs[index] = repo;
			this.index++;
			System.out.println("saving software in index");
		} else {
			System.out.println("memory is full, element is not saved..");
		}
		return false;
	}

	@Override
	public boolean isExist(SoftwareDTO repo) {

		if (index == 0) {
			System.out.println("first element is added no need to check");
			return false;
		} else {
			System.out.println("first element is allready exists..");
			for (int index = 0; index < softwareDTOs.length; index++) {
				SoftwareDTO ref = this.softwareDTOs[index];

				if (ref.equals(repo)) {

					System.out.println("dto is exist");
				} else {
					System.out.println("dto is not exist");
				}
			}
		}

		return false;
	}

	@Override
	public int totalSaved() {

		return 0;
	}

	@Override
	public SoftwareDTO findById(int id) {

		for (int i = 0; i < softwareDTOs.length; i++)

			return SoftwareRepository.super.findById(id);
		return null;
	}

}
