package com.cjc.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.User;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	
	@Override
	public void savedata(User u) {
		hr.save(u);
		
	}

	@Override
	public Iterable<User> loginData(String username, String password) {
	
		return hr.findAllByUsernameAndPassword(username, password);
	}

	@Override
	public Iterable<User> getAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteData(User u) {
	
		hr.delete(u);
		
	}

	@Override
	public User editData(int uid) {
		
		return hr.findByUid(uid);
	}

	
}
