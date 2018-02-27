package org.bees.box.accounts.service;

import org.bees.box.accounts.model.User;
import org.bees.box.accounts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public Iterable<User> getAll() {
		return userRepo.findAll();
	}

	@Override
	public User getUser(Integer userId) {
		return userRepo.findOne(userId);
	}

	@Override
	public User addUser(User newUser) {
		userRepo.save(newUser);
		return newUser;
	}

	@Override
	public User updateUser(User user) {
		userRepo.save(user);
		return user;
	}

	@Override
	public User deleteUser(User user) {
		userRepo.save(user);
		return user;
	}
	
	
}
