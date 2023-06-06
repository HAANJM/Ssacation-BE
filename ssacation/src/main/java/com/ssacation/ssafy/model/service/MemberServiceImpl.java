package com.ssacation.ssafy.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssacation.ssafy.model.dao.JpaMemberDao;
import com.ssacation.ssafy.model.vo.JpaMember;

@Transactional
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private JpaMemberDao jpaMemberDao;
	
	@Override
	public JpaMember save(JpaMember member) {
		return jpaMemberDao.save(member);
	}

	@Override
	public JpaMember findById(String id) {
		return jpaMemberDao.findById(id);
	}

	@Override
	public List<JpaMember> findByName(String name) {
		return jpaMemberDao.findByName(name);
	}

	@Override
	public List<JpaMember> findAll() {
		return jpaMemberDao.findAll();
	}

}
