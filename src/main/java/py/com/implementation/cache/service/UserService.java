package py.com.implementation.cache.service;

import java.util.List;

import py.com.implementation.cache.model.User;

public interface UserService {
	List<User> getUsersByCache(String id);
}
