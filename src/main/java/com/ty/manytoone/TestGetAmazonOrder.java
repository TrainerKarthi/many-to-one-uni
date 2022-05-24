package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAmazonOrder {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Item item = entityManager.find(Item.class,2);
		
		if (item != null) {
			AmazonOrder amazonOrder = item.getAmazonOrder();
			System.out.println(item.getName());
			System.out.println(item.getPrice());
			System.out.println(item.getQuantity());
			System.out.println("===============================");
			System.out.println(amazonOrder.getName());
			System.out.println(amazonOrder.getAddress());
			System.out.println(amazonOrder.getStatus());
		} else {
			System.out.println("Not found");

		}
	}
}
