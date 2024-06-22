package webdev.login.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import webdev.login.entity.CredentialsEntity;
import webdev.login.service.CredintialService;

@RestController
@CrossOrigin
public class CredentialController {
	
	@Autowired
	private CredintialService credService;
	
	@GetMapping("/alluser")
	public Collection<CredentialsEntity> getAllUsers(){
		return credService.getAllUsers();
	}
	
	@GetMapping("/user/id")
	public CredentialsEntity getOneUser( @PathVariable Integer id) {
		return credService.getOneUser(id);
	}
	
	@PostMapping("/alluser")
	public void postUser( @RequestBody CredentialsEntity user) {
		credService.postUser(user);
	}

}
