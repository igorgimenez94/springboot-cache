package py.com.implementation.cache.model;

import java.io.Serializable;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto implements Serializable{
	List<User> users;
}
