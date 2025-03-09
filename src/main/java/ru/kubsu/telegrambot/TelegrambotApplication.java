package ru.kubsu.telegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import ru.kubsu.telegrambot.controller.TestController;

@SpringBootApplication
public class TelegrambotApplication {

	public static void main(String[] args) {
//		TestController controller = new TestController();
//		String hello = controller.hello();
//		System.out.println(hello);
		SpringApplication.run(TelegrambotApplication.class, args);
	}

}
