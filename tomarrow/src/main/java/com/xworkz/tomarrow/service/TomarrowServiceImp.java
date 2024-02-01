package com.xworkz.tomarrow.service;

import com.xworkz.tomarrow.entity.TomarrowEntity;
import com.xworkz.tomarrow.repository.TomarrowRepository;

public class TomarrowServiceImp implements TomarrowService {

	private TomarrowRepository repo;

	public TomarrowServiceImp(TomarrowRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validThenSave(TomarrowEntity repo) {
		System.out.println("Running validThenSave method in TomarrowServiceImp");
		if (repo != null) {
			System.out.println("entity is not null");
			return this.repo.save(repo);
		}
		return true;
	}

	@Override
	public boolean update(TomarrowEntity repo) {
		System.out.println("Running validThenSave method in TomarrowServiceImp");
		if (repo != null) {
			System.out.println("entity is not null");
			return this.repo.update(repo);
		}
		return true;
	}

	@Override
	public boolean findbyId(TomarrowEntity repo) {
		System.out.println("Running validThenSave method in TomarrowServiceImp");
		if (repo != null) {
			System.out.println("entity is not null");
			return this.repo.findbyId(repo);
		}
		return true;

	}

	@Override
	public boolean remove(TomarrowEntity repo) {
		System.out.println("Running validThenSave method in TomarrowServiceImp");
		if (repo != null) {
			System.out.println("entity is not null");
			return this.repo.remove(repo);
		}
		return true;

	}

}