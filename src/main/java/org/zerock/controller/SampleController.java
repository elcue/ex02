package org.zerock.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;

/**
 * SpringBoard 
 * 클래스명 : SampleController.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 22.
 * 클래스 소개 : RestController 애노테이션 연습. @RestController는 별도의 뷰를 제공하지 않는 형태로 서비스를 실행한다.
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

	// /sample/hello 경로로 오면 문자열이 출력됨.
	@RequestMapping("/hello")
	public String sayHello(){
		return "This is RestController";
	}
	
	//별도의 처리 없이 JSON 형태로 출력이 가능
	@RequestMapping("/sendVO")
	public SampleVO sendVO(){
		
		SampleVO vo = new SampleVO();
		vo.setFirstName("길동");
		vo.setLastName("홍");
		vo.setMno(123);
		
		return vo;
	}
	//List 타입도 가능.
	@RequestMapping("/sendList")
	public List<SampleVO> sendList(){
		List<SampleVO> list = new ArrayList<>();
		
		for(int i = 0 ; i <10; i++){
			SampleVO vo = new SampleVO();
			vo.setFirstName("제훈");
			vo.setLastName("이");
			vo.setMno(i);
			list.add(vo);
		}
		return list;
	}
	//Map 타입도 가능.
	@RequestMapping("/sendMap")
	public Map<Integer, SampleVO> sendMap(){
		Map<Integer, SampleVO> map = new HashMap<>();
		
		for(int i = 0 ; i < 10; i++){
			SampleVO vo = new SampleVO();
			vo.setFirstName("제훈");
			vo.setLastName("이");
			vo.setMno(i);
			map.put(i, vo);
		}
		return map;
	}
	
	//HTTP 상태코드에 좀 더 세밀한 제어가 필요할 때
	@RequestMapping("/sendErrorAuth")
	public ResponseEntity<Void> sendListAuth(){
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	//전송한 결과는 그대로 보여주면서 상태코드를 전달.
	//주로 호출한 쪽으로 에러의 원인 메시지를 전송할 때 사용하는 방식
	@RequestMapping("/sendErrorNot")
	public ResponseEntity<List<SampleVO>> sendListNot(){
		
		List<SampleVO> list = new ArrayList<>();
		for(int i = 0 ; i < 10; i++){
			SampleVO vo = new SampleVO();
			vo.setFirstName("제훈");
			vo.setLastName("이");
			vo.setMno(i);
			list.add(vo);
		}
		return new ResponseEntity<>(list, HttpStatus.NOT_FOUND);
	}
	
}
