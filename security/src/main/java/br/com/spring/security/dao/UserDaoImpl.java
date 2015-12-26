package br.com.spring.security.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.com.spring.security.model.User;

@Repository("userDAO")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDAO {

	public User findById(int id) {
		return getByKey(id);
	}

	public User findBySSO(String sso) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("ssoId", sso));
        return (User) crit.uniqueResult();
	}

	@Override
	public void save(User user) {
		persist(user);
	}

}
