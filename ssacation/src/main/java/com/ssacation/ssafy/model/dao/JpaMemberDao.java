package com.ssacation.ssafy.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.ssacation.ssafy.model.vo.JpaMember;



@Repository
public class JpaMemberDao {
	
	private final EntityManager em;

	public JpaMemberDao(EntityManager em) {
		this.em = em;
	}
	
	public JpaMember save(JpaMember member) {
		em.persist(member);
		return member;
	}
	
	public JpaMember findById(String id) {
		return em.find(JpaMember.class, id);
	}
	
	// jpql
	public List<JpaMember> findByName(String name) {
		return em.createQuery("select m from JpaMember m where m.memberName = :name", JpaMember.class)
		.setParameter("name", name)
		.getResultList();
	}
	
	// jpql
	public List<JpaMember> findAll(){
		return em.createQuery("select m from JpaMember m", JpaMember.class)
		.getResultList();
	}

}
