package com.facebookboot.facebookboot.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.facebookboot.facebookboot.dao.FacebookDAOInterface;
import com.facebookboot.facebookboot.entity.FacebookUser;
@Component
public class FacebookDto implements FacebookDtoInterface{
	@Autowired
	FacebookDAOInterface fd;
	 

	public int createprofiledto(FacebookUser fu) {
		fd.save(fu);
		return 1;
	}
	public void deleteprofiledto(long id) {
		fd.deleteById(id);
	}
	public FacebookUser viewprofiledto(long id) {
		return fd.findById(id).get();
	}
	public Optional<FacebookUser> updatedto( long uid)   
	{  
	 
	return fd.findById(uid);  
	}  

	public List<FacebookUser> viewAllprofiledto(){
		List<FacebookUser>list=new ArrayList<FacebookUser>();
		fd.findAll().forEach(list1->list.add(list1));
		return list;
	}
	 
	@Override
	public List<FacebookUser> searchprofiledto(String name) {

		return fd.findByName(name);
	}


}
