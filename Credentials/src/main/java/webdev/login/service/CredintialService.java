package webdev.login.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webdev.login.entity.CredentialsEntity;
import webdev.login.repository.CredentialsRepository;

@Service
public class CredintialService {
	
	@Autowired
	private CredentialsRepository credRepo;
	
	public Collection<CredentialsEntity> getAllUsers() {
		Collection<CredentialsEntity> allUser = credRepo.findAll();
		return allUser;
	}
	
	public CredentialsEntity getOneUser(Integer id) {
		CredentialsEntity user = null;
		Optional<CredentialsEntity> one =  credRepo.findById(id);
		if(one.isPresent()) {
			user = one.get();
		}
		return user;
	}
	
	public void postUser(CredentialsEntity user) {
		credRepo.save(user);
	}
}
