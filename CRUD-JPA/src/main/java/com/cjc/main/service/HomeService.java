package com.cjc.main.service;

import com.cjc.main.model.User;

public interface HomeService {

	public void savedata(User u);

	public Iterable<User> loginData(String username, String password);

	public Iterable<User> getAllData();

	public void deleteData(User u);

	public User editData(int uid);

}
