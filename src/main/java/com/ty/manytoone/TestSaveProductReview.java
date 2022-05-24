package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Product product = new Product();
		product.setName("laptop");
		product.setBrand("HP");
		product.setPrice(143);
		
		Review review1 = new Review();
		review1.setRating(5);
		review1.setFeedback("good for gaming");
		
		Review review2 = new Review();
		review2.setRating(4);
		review2.setFeedback("awesome for programming");
		
		review1.setProduct(product);
		review2.setProduct(product);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityTransaction.commit();
	}

}
