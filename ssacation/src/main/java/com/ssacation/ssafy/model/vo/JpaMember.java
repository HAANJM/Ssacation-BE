package com.ssacation.ssafy.model.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JpaMember {
	
	@Id // PK 
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String memberId;
	private String memberName;
	
	public JpaMember() {
		super();
	}

	public JpaMember(String memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
