package dev.deepakpenaganti.ssp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.deepakpenaganti.ssp.documents.User;
import dev.deepakpenaganti.ssp.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		return userRepository.findAll();
	}
}
