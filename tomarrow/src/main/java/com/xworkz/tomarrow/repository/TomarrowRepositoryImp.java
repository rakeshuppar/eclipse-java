package com.xworkz.tomarrow.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.tomarrow.entity.TomarrowEntity;

public class TomarrowRepositoryImp implements TomarrowRepository {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction et = manager.getTransaction();

	@Override
	public boolean save(TomarrowEntity repo) {
		System.out.println("Running save method in TomarrowRepositoryImp");

		TomarrowEntity tn = new TomarrowEntity();
		tn.setId(3);
		tn.setName("Tueasday");
		System.out.println(tn);

		et.begin();
		manager.persist(tn);
		et.commit();
		manager.close();
		System.out.println("Saves successfully");
		return true;
	}

	@Override
	public boolean update(TomarrowEntity repo) {
		System.out.println("Running update method in TomarrowRepositoryImp ");

		TomarrowEntity tn = new TomarrowEntity();
		tn.setId(3);
		tn.setName("Tuesday");
		System.out.println(tn);

		et.begin();
		manager.merge(tn);
		et.commit();
		manager.close();
		System.out.println("update successfully");
		return true;
	}

	@Override
	public boolean findbyId(TomarrowEntity repo) {
		System.out.println("Running findById method in TomarrowRepositoryImp");

		et.begin();
		TomarrowEntity fi = manager.find(TomarrowEntity.class, 3);
		System.out.println(fi);
		et.commit();
		manager.close();
		System.out.println("find by id successfully");
		return true;
	}

	@Override
	public boolean remove(TomarrowEntity repo) {
		System.out.println("Running remove method in TomarrowRepositoryImp");

		et.begin();
		TomarrowEntity fi = manager.find(TomarrowEntity.class, 3);
		manager.remove(fi);
		manager.getTransaction();
		et.commit();
		manager.close();
		System.out.println("Remove successfully");
		return true;

	}

}