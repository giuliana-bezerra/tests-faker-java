package br.com.giulianabezerra.testsfakerspringboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestsFakerSpringbootApplicationTests {
	@Autowired
	private UserService userService;

	@Test
	void testCreateUser() {
		var user = Factories.createUser();
		System.out.println(user);

		userService.create(user);
		var response = userService.getUser(user.username());
		assertEquals(user, response);
	}

}
