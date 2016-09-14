package com.example.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	public void findsFirstPageOfCities() {

		Page<User> cities = userDao.findAll(new PageRequest(0, 10));
		assertThat(cities.getTotalElements()).isGreaterThan(20L);
	}
}