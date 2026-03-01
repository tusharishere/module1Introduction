package com.codingshuttle.tushar.module1Introduction;

import com.codingshuttle.tushar.module1Introduction.Homework.CakeBaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {


	private final CakeBaker cakeBaker;

    public Module1IntroductionApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

//	final NotificationService notificationServiceobj; // Constructor Injection
//
//	public Module1IntroductionApplication( NotificationService notificationServiceobj) {
//		this.notificationServiceobj = notificationServiceobj; // constructor DI preferred
//	}
//	@Autowired
//	Map<String,NotificationService> notificationServiceMap = new HashMap<>();// if you want notification from both sms and email (use of both beans implementations)

	public static void main(String[] args)
	{
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		notificationServiceobj.send("Hello");

//		for (var notificationService: notificationServiceMap.entrySet()){
//			System.out.println(notificationService.getKey());
//			notificationService.getValue().send("Hello");
//		}

		cakeBaker.bakeCake();

	}
}
