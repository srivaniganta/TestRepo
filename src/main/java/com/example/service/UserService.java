package com.example.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.UserResp;



@Service
public class UserService {
	
	public static final String REQ_URL="https://reqres.in/api/users?page=";
	public UserResp getUser(String id){
		
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		httpHeaders.add("user-agent", "MAC");
		 @SuppressWarnings("unchecked ")
		// @SuppressWarnings("rawtypes")
		HttpEntity entity=new HttpEntity(httpHeaders);
		 RestTemplate restTemp=new RestTemplate();
		 ResponseEntity<UserResp> respEntity=restTemp.exchange(REQ_URL+id, HttpMethod.GET, entity, UserResp.class);
		 UserResp UserResp=respEntity.getBody()!=null ? respEntity.getBody():null;
		  System.out.println("The response object is"+UserResp.page);
		 return UserResp;
		 
		
	}

}
