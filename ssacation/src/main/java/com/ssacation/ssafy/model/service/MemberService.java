package com.ssacation.ssafy.model.service;

import java.util.List;

import com.ssacation.ssafy.model.vo.JpaMember;

public interface MemberService {
	
	JpaMember save(JpaMember member);
	
	JpaMember findById(String id);
	
	List<JpaMember> findByName(String name);
	
	List<JpaMember> findAll();

}
