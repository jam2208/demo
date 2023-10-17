package com.example.demo;

import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.config.BeanConfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		ApplicationContext context =
			new AnnotationConfigApplicationContext(
				BeanConfig.class);

		String s = (String) context.getBean("bean1");
		System.out.println(s);

		String s2 = new String("직접 Bean");
		System.out.println(s2);

		Random r = (Random) context.getBean("bean2");
		System.out.println(r.nextInt());

		Calendar c = (Calendar) context.getBean("bean3");
		System.out.println(c.getTime());

		ApplicationContext context1 =
			new ClassPathXmlApplicationContext(
"classpath:application.xml");
			int i = (int) context1.getBean("bean22");
			System.out.println(i);

			String k = (String) context1.getBean("bean23");
			System.out.println(k);

		// 	int i2 = new Integer("1234")

		Bean33 bean33 = (Bean33) context.getBean("bean33");
		System.out.println(bean33.run());

		Game game = (Game) context.getBean("game");
		game.play();

	}

}
