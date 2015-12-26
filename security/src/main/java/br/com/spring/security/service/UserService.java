package br.com.spring.security.service;

import br.com.spring.security.model.User;

public interface UserService {

	void save(User user);
	
	User findById(int id);
    
    User findBySso(String sso);
}
