package py.com.implementation.cache.service.impl;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.implementation.cache.model.User;
import py.com.implementation.cache.service.UserDaoService;
import py.com.implementation.cache.service.UserService;

@Service
@AllArgsConstructor
@Slf4j
@CacheConfig(cacheNames = "apiCache")
public class UserServiceImpl implements UserService {

	private final UserDaoService userDaoService;

	@Override
	public List<User> getUsersByCache(String id) {
		log.info("Obteniendo lista de clientes {}", id);
		List<User> userList = llamarApiExt1(id);
		log.info("Fin de obtener lista de clientes {}", id);
		return userList;
	}

	@Cacheable(value = "apiCache", key = "#clienteId") // expire en segundos
	public List<User> llamarApiExt1(String clienteId) {

		List<User> userList = userDaoService.getUsersCore();

		return userList;
	}
}
