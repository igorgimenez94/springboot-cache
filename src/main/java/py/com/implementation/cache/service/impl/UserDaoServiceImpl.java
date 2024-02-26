package py.com.implementation.cache.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import py.com.implementation.cache.model.User;
import py.com.implementation.cache.service.UserDaoService;

@Service
@Slf4j
public class UserDaoServiceImpl implements UserDaoService {

	@Override
	public List<User> getUsersCore() {
		log.info("Obteniendo lista de usuarios desde el core");
		
		List<User> list = getListDelay();
		
		try {
			log.info("Simulando un delay en el metodo");
		    Thread.sleep(5 * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
		
		
		return list;
	}

	private List<User> getListDelay() {
		List<User> list = new ArrayList<>();
		
		User user1 = User.builder().id(1).name("Jon Doe").email("jondoe@example.com").build();
		User user2 = User.builder().id(2).name("Huan Perez").email("juanpereze@example.com").build();
		User user3 = User.builder().id(3).name("Kike Jara").email("kikee@example.com").build();
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		return list;
	}

}
