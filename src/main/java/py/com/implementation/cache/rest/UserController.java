package py.com.implementation.cache.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import py.com.implementation.cache.model.User;
import py.com.implementation.cache.service.UserService;

@RestController
@RequestMapping("/api/ejemplo")
@Slf4j
@AllArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/users")
    public ResponseEntity<List<User>> getUser(@RequestBody String cuerpoDeSolicitud) {
        // Puedes hacer lo que quieras con el cuerpoDeSolicitud, por ejemplo, imprimirlo.
        log.info("Cuerpo de Solicitud: " + cuerpoDeSolicitud);

        List<User> response = userService.getUsersByCache(cuerpoDeSolicitud);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
