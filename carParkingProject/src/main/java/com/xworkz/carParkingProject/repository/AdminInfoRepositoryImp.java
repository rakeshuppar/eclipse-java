package com.xworkz.carParkingProject.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xworkz.carParkingProject.entity.AdminInfoEntity;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class AdminInfoRepositoryImp implements AdminInfoRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(AdminInfoEntity entity) {
		log.info("Running save method in AdminInfoRepositoryImp");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
			return true;
		} catch (PersistenceException e) {
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public List<AdminInfoEntity> findByLocation(String location) {
		log.info("Running findByLocation in AdminInfoRepositoryImp");

		EntityManager manager = factory.createEntityManager(); // EntityTransaction
		EntityTransaction transaction = manager.getTransaction();
		transaction = manager.getTransaction();

		Query query = manager.createNamedQuery("findByLocation");
		query.setParameter("nm", "%" + location + "%");
		List<AdminInfoEntity> result = query.getResultList();
		log.info("result from repo:" + result);
		manager.close();
		return result;
	}

	@Override
	public AdminInfoEntity findByLocationTypeClassficationDays(String location, String type, String classfication,
			int days) {
		log.info("repo: all parameter values: " + location + ", " + type + ", " + classfication + ", " + days);
		log.info("Running findByLocation in AdminInfoRepositoryImp");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByall");
		query.setParameter("lc", location);
		query.setParameter("tp", type);
		query.setParameter("cls", classfication);
		query.setParameter("day", days);

		try {
			Object obj = query.getSingleResult();
			return (AdminInfoEntity) obj;
		} catch (Exception e) {
			log.info("repo: no entity found");
			return null;
		} finally {
			manager.close();
		}
	}
}
