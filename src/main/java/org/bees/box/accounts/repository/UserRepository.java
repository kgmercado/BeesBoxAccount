package org.bees.box.accounts.repository;

import java.util.List;

import org.bees.box.accounts.model.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface UserRepository extends CrudRepository<User, Integer>{
	List<User> findByUsername(final String username);
}
