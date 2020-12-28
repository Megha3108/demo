package com.facebookboot.facebookboot.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.facebookboot.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.facebookboot.entity.FacebookUser;
import com.facebookboot.facebookboot.service.FacebookServiceInterface;
 

@RestController
public class facebookcontroller {
	@Autowired
	private  FacebookServiceInterface fs;
	
	@PostMapping("createprofilefacebook")
	public String createprofile(@RequestBody FacebookUser fu) {
		int i=0;
		  i=fs.createprofile(fu);
		  String str="registration  not successful";
		if(i>0) {
			str="registration successful";
		}
		 
		return str;
	}
	
	 
	@DeleteMapping("/FacebookUser/{uid}")
	public void deleteprofile(@PathVariable("uid")Long uid) {
 
	 
		 fs.deleteprofile(uid);
		 
	}
	@PutMapping("/books/{uid}")  
	private ResponseEntity<Object> update(@RequestBody FacebookUser fu,@PathVariable("uid") long uid)   
	{  
		Optional<FacebookUser> list=fs.update(uid);
		if (!list.isPresent())
			return ResponseEntity.notFound().build();
		fu.setUid(uid);
		
        int i=fs.createprofile(fu);
	 
		
		 

		return ResponseEntity. noContent().build();
	}  
	@GetMapping("viewAllprofile")
	public List<FacebookUser> viewallprofile(){
		List<FacebookUser> list=fs.viewAllprofile();
		//FacebookUser fu=new FacebookUser();
		 
		return list;
	}
	@GetMapping("/viewprofile/{uid}")
	 
		private FacebookUser getBooks(@PathVariable("uid") long uid)   
		{  
		return fs.viewprofile(uid);  
		}  
		 
		
	
	@GetMapping("searchprofile")
	public  List<FacebookUser> searchprofile(@PathParam(value="name")String name) {
		//int i=fd.searchProfileDAO(id);
		  List<FacebookUser> list=fs.searchprofile(name);
		//FacebookUser fu=new FacebookUser();
		//System.out.println(fu.getEmail());
		 
		return  list;
	} 
	

}
