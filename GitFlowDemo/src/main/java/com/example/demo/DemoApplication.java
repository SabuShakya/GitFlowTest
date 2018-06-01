package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	public  void login(){
		System.out.println("Login code here");
	}

	public void signup(){
        System.out.println("Sign up here ");
    }
}
