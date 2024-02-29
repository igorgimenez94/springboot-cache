package py.com.implementation.cache.service;

import py.com.implementation.cache.model.ResponseDto;

public interface UserService {
	ResponseDto getUsersByCache(String id);
}
