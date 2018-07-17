package com.solution.jpa.entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class GenericDao {

	private static GenericDao instance = null;
	@PersistenceContext
	private EntityManagerFactory em;

	private GenericDao() {
		em = Persistence.createEntityManagerFactory("StockServices");
	}

	public static GenericDao getInstance() {

		synchronized (GenericDao.class) {
			if (instance == null) {
				instance = new GenericDao();
			}
		}

		return instance;
	}

	public EntityManagerFactory getEm() {
		return em;
	}

	public void setEm(EntityManagerFactory em) {
		this.em = em;
	}

}
