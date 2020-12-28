package com.facebookboot.facebookboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facebookboot.facebookboot.entity.FacebookUser;
@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser, Long>  {

	List<FacebookUser> findByName(String name);
	/*public int createProfile(FacebookUser fu);
	public int deleteprofile(long uid);
	public int editprofile(String n,long uid);
	public List<FacebookUser> viewprofile(long uid);
	public List<FacebookUser> viewAllprofile();
	public List<FacebookUser> searchprofile(String name);*/
}
