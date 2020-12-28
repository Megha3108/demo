package com.facebookboot.facebookboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.facebookboot.facebookboot.dto.FacebookDtoInterface;
import com.facebookboot.facebookboot.entity.FacebookUser;
@Service
public class Facebookservice implements FacebookServiceInterface{
	@Autowired
	FacebookDtoInterface ftd;
	 

	public int createprofile(FacebookUser fu) {
		ftd.createprofiledto(fu);
		return 1;
	}
	public void deleteprofile(long id) {
		ftd.deleteprofiledto(id);
	}
	public FacebookUser viewprofile(long id) {
		return ftd.viewprofiledto(id);
	}
	public Optional<FacebookUser> update( long uid)   
	{  
	 
	return ftd.updatedto(uid);
	}  

	public List<FacebookUser> viewAllprofile(){
		List<FacebookUser>list=ftd.viewAllprofiledto();
		 
		return list;
	}
	 
	@Override
	public List<FacebookUser> searchprofile(String name) {

		return ftd.searchprofiledto(name);
	}


}
