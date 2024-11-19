package dev.jotxee.emailmanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmailManagerApplicationTests {

	private final ApplicationContext applicationContext;

    EmailManagerApplicationTests(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Test
	void contextLoads() {
		assertNotNull(applicationContext);
	}

}
