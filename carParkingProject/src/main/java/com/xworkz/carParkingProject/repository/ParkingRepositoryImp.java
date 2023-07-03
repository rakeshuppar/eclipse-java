package com.xworkz.carParkingProject.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.carParkingProject.entity.ParkingEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class ParkingRepositoryImp implements ParkingRepository {
	@Autowired
	private EntityManagerFactory factory;

	public ParkingRepositoryImp() {
		log.info("Running no arg constructor in ParkingRepositoryImp");
	}

	@Override
	public ParkingEntity findByEmail(String email) {
		log.info("Running findByEmail in  ParkingRepositoryImp");
		EntityManager manager = this.factory.createEntityManager();

		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("emm", email);
		Object object = query.getSingleResult();
		ParkingEntity entity = (ParkingEntity) object;
		return entity;
	}

	@Override
	public boolean updateLoginTime(ParkingEntity entity) {
		log.info("exexute updateLogin time method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		manager.close();
		return false;
	}

}
