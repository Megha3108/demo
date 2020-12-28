package com.facebookboot.facebookboot.dto;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.facebookboot.facebookboot.entity.FacebookUser;

public interface FacebookDtoInterface {
	public int createprofiledto(FacebookUser fu);
	public void deleteprofiledto(long id);
	public FacebookUser viewprofiledto(long id);
	public Optional<FacebookUser> updatedto( long uid);
	public List<FacebookUser> viewAllprofiledto();
	public List<FacebookUser> searchprofiledto(String name);

}
