package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteProductReview {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Review review = entityManager.find(Review.class, 2);

		if (review != null) {

			Product product = review.getProduct();
			entityTransaction.begin();
			entityManager.remove(product);
			entityManager.remove(review);
			entityTransaction.commit();

		} else {

			System.out.println("No reviews found");

		}

	}

}
