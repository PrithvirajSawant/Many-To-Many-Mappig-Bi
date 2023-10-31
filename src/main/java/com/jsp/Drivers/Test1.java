package com.jsp.Drivers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Students_S;
import com.jsp.Entities.Subjects_S;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Subjects_S> sub = new ArrayList<Subjects_S>();
		Subjects_S ss = new Subjects_S();
		ss.setName("Core Java");
		ss.setDuration(60);
		ss.setTrinerName("Ravi");
		
		
		Subjects_S ss2 = new Subjects_S();
		ss2.setName("WebTech");
		ss2.setDuration(45);
		ss2.setTrinerName("Ravi");
		
		Subjects_S ss3 = new Subjects_S();
		ss3.setName("SQL");
		ss3.setDuration(25);
		ss3.setTrinerName("Ravi");
		
		sub.add(ss);
		sub.add(ss2);
		sub.add(ss3);
		
		List<Students_S> stu = new ArrayList<Students_S>();
		Students_S s = new Students_S();
		s.setName("Raj");
		s.setAge(22);
		s.setLoc("Bangalore");
		
		Students_S s2 = new Students_S();
		s2.setName("Rahul");
		s2.setAge(21);
		s2.setLoc("Bangalore");
		
		Students_S s3 = new Students_S();
		s3.setName("Arjun");
		s3.setAge(24);
		s3.setLoc("Bangalore");
		
		stu.add(s);
		stu.add(s2);
		stu.add(s3);
		
		
		ss.setStudents(stu);
		ss2.setStudents(stu);
		ss3.setStudents(stu);
		
		s.setSubjects(sub);
		s2.setSubjects(sub);
		s3.setSubjects(sub);
		
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(s);
		em.persist(s2);
		em.persist(s3);
		em.persist(ss);
		em.persist(ss2);
		em.persist(ss3);
		et.commit();

	}

}
