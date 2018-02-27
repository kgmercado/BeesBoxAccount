package org.bees.box.accounts.service;

import org.bees.box.accounts.model.User;

public interface UserService {
	Iterable<User> getAll();
	User getUser(Integer userId);
	User addUser(User newUser);
	User updateUser(User user);
	User deleteUser(User user);
}
