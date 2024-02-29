package py.com.implementation.cache;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheExampleApplication.class, args);
	}
	
	@Bean
	public RedisCacheManager cacheManager(RedisConnectionFactory connectionFactory) {
	  RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig() //
	      .prefixCacheNameWith(this.getClass().getPackageName() + ".") //
	      .entryTtl(Duration.ofHours(1)) //
	      .disableCachingNullValues();

	  return RedisCacheManager.builder(connectionFactory) //
	      .cacheDefaults(config) //
	      .build();
	}

}
