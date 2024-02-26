package py.com.implementation.cache.service;

import java.util.List;

import py.com.implementation.cache.model.User;

public interface UserDaoService {
	List<User> getUsersCore();
}
