package com.example.control;

import javax.annotation.PostConstruct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages={"com.example"})
@EnableJpaRepositories(basePackages="com.example.DAO")
@EntityScan(basePackages = "com.example。Entity")
@MapperScan(basePackages = "com.example.*",
sqlSessionFactoryRef = "sqlSessionFactory",
sqlSessionTemplateRef = "sqlSessionTemplate",
annotationClass = Repository.class)
@EnableCaching
public class CompareApplication {
	
	@Autowired
	private RedisTemplate redisTemplate = null;
	
	@PostConstruct
	public void init() {
		initRedisTemplate();
	}
	
	private void initRedisTemplate() {
		// TODO Auto-generated method stub
		RedisSerializer stringSerializer = redisTemplate.getStringSerializer();
		redisTemplate.setKeySerializer(stringSerializer);
		redisTemplate.setHashKeySerializer(stringSerializer);
	}

	public static void main(String[] args) {		
		SpringApplication.run(CompareApplication.class, args);
	}

}
