package py.com.implementation.cache.service.impl;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.implementation.cache.model.ResponseDto;
import py.com.implementation.cache.model.User;
import py.com.implementation.cache.service.UserDaoService;
import py.com.implementation.cache.service.UserService;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserDaoService userDaoService;

    @Override
    @Cacheable("usersCache")
    public ResponseDto getUsersByCache(String id) {
        log.info("Obteniendo lista de clientes {}", id);
        ResponseDto userList = this.getUsers(id);
        log.info("Fin de obtener lista de clientes {}", id);
        return userList;
    }

    
    public ResponseDto getUsers(String clienteId) {
        List<User> userList = userDaoService.getUsersCore();
        ResponseDto dto = ResponseDto.builder().users(userList).build();
        return dto;
    }
}

