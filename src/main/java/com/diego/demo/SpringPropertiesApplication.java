package com.diego.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class SpringPropertiesApplication implements ApplicationListener<ContextRefreshedEvent>{
	
	@Value("${geral.projeto.nome}")
	private  String nome;

	public static void main(String[] args) {
		SpringApplication.run(SpringPropertiesApplication.class, args);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(nome);
	}
	//https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

}
