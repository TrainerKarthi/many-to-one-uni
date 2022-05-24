package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAmazonOrder {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Item item1 = new Item();
		item1.setName("chair");
		item1.setPrice(500);
		item1.setQuantity(1);

		Item item2 = new Item();
		item2.setName("Phone");
		item2.setPrice(11000);
		item2.setQuantity(1);

		Item item3 = new Item();
		item3.setName("Laptop");
		item3.setPrice(40000);
		item3.setQuantity(1);

		AmazonOrder amazonOrder = new AmazonOrder();
		amazonOrder.setAddress("NR Colony");
		amazonOrder.setName("Knowledge tools");
		amazonOrder.setStatus("shipment started");
		item1.setAmazonOrder(amazonOrder);
		item2.setAmazonOrder(amazonOrder);
		item3.setAmazonOrder(amazonOrder);

		entityTransaction.begin();
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityManager.persist(amazonOrder);
		entityTransaction.commit();
	}

}
