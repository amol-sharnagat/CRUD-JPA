package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.cjc.main.model.User;

@Repository
public interface HomeRepository extends CrudRepository<User, Integer> {
	@Query("from User where username=:username AND password=:password")
	public Iterable<User> findAllByUsernameAndPassword(String username, String password);
	
	public User findByUid(int uid);

	

}
