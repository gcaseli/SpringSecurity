package br.com.spring.security.dao;

import br.com.spring.security.model.User;

public interface UserDAO {

	User findById(int id);
    
	User findBySSO(String sso);
	
	void save (User user);
}
