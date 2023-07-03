package com.xworkz.carParkingProject.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.carParkingProject.entity.UserEntity;
import com.xworkz.carParkingProject.entity.UserInfoEntity;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class UserRepositoryImp implements UserRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(UserEntity entity) {
		log.info("Runnng save method in UserRepositoryImp");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public UserEntity findByUserEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserEmail");
		query.setParameter("mail", email);
		try {
			Object obj = query.getSingleResult();
			return (UserEntity) obj;
		} catch (Exception e) {
			return null;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean saveUserParkingInfo(UserInfoEntity entity) {
		log.info("Running saveUserParkingInfo method in UserRepositoryImp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			return true;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return false;

	}
}