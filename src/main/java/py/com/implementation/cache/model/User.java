package py.com.implementation.cache.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	
	private String name;
	private Integer id;
	private String email;

}
