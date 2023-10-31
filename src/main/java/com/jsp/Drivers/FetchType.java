package com.jsp.Drivers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jsp.Entities.Students_S;
import com.jsp.Entities.Subjects_S;

public class FetchType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		Students_S st = em.find(Students_S.class, 1);
		List<Subjects_S> list = st.getSubjects();
		Subjects_S sub = list.get(0);

	}

}
