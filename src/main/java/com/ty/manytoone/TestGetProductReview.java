package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestGetProductReview {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Review review = entityManager.find(Review.class,1);
		
		if (review != null) {
			Product product = review.getProduct();
			
			System.out.println(review.getRating());
			System.out.println(review.getFeedback());
			
			System.out.println(product.getBrand());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			
			

		} else {
			System.out.println("No review found");

		}
		
		
		
		
		
		
		
	}

}
