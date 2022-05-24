package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Hospital");
		hospital.setWeb("www.hospital.com");
		
		Branch branch1 = new Branch();
		branch1.setName("cmc");
		branch1.setCountry("India");
		branch1.setState("Andhra Pradesh");
		branch1.setPhone(9876567890l);
		
		Branch branch2 = new Branch();
		branch2.setName("kims");
		branch2.setCountry("India");
		branch2.setState("TamilNadu");
		branch2.setPhone(98765670l);
		
		branch1.setHospital(hospital);
		branch2.setHospital(hospital);
		
		
	}
}
