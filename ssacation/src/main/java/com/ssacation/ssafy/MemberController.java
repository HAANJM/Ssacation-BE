package com.ssacation.ssafy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssacation.ssafy.model.service.MemberService;
import com.ssacation.ssafy.model.vo.JpaMember;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin("*")
@RequestMapping("/ssacation/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@ApiOperation(value="회원 가입")
	@PostMapping("")
	public ResponseEntity<?> registMember(JpaMember member){
		
		JpaMember m = memberService.save(member);
		
		return new ResponseEntity<JpaMember>(m, HttpStatus.OK);
		
	}
	
	@ApiOperation(value="전체 회원 조회")
	@GetMapping("")
	public ResponseEntity<?> getAllMember(){
		
		List<JpaMember> list = memberService.findAll();
		
		return new ResponseEntity<List<JpaMember>>(list, HttpStatus.OK);
		
	}
	
	@ApiOperation(value="아이디로 조회")
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getMemberById(@PathVariable String id){
		
		JpaMember m = memberService.findById(id);
		
		return new ResponseEntity<JpaMember>(m, HttpStatus.OK);
		
	}
	
	@ApiOperation(value="이름으로 조회")
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getMemberByName(@PathVariable String name){
		
		List<JpaMember> list = memberService.findByName(name);
		
		return new ResponseEntity<List<JpaMember>>(list, HttpStatus.OK);
		
	}

}
