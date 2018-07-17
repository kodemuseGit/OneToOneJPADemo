package com.solution.spring.JPADemo;

import javax.persistence.EntityManagerFactory;

import org.junit.Test;

import com.solution.jpa.entity.GenericDao;

public class GenericDaoTest {

	@Test
	public void createEntityManager() {
		EntityManagerFactory entityManagerFactory = GenericDao.getInstance().getEm();
		System.out.println("entityManagerFactory >>>> " + entityManagerFactory);
	}
}
