package com.facebookboot.facebookboot.service;

import java.util.List;
import java.util.Optional;

import com.facebookboot.facebookboot.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createprofile(FacebookUser fu);
	public void deleteprofile(long id);
	public FacebookUser viewprofile(long id);
	public List<FacebookUser> searchprofile(String name);
	public List<FacebookUser> viewAllprofile();
	public Optional<FacebookUser> update( long uid)  ;
}
