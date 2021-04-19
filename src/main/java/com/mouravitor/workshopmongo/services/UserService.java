package com.mouravitor.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouravitor.workshopmongo.domain.User;
import com.mouravitor.workshopmongo.repository.UserRepository;
import com.mouravitor.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findOne(id);
		if (user ==null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}

}
