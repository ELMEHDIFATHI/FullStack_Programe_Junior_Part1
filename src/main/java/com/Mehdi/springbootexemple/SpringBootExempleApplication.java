package com.Mehdi.springbootexemple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class SpringBootExempleApplication {





	public static void main(String[] args) {
		//System.out.println(customers);
		SpringApplication.run(SpringBootExempleApplication.class, args);
	}


	/*@GetMapping("/")
	public  greet greet(@RequestParam(value = "name",required = false) String name){
		String greeyMessage=name==null || name.isBlank()? "Hello": "Hello "+name;
		return  new greet(
				greeyMessage,
				List.of("java","Go","php"),
				new Personne("Mehdi",28,3000));
	}

	// record min vs classe max
	record  greet(String request, List<String> favProgramming,Personne persone){}

	record  Personne(String name,int age,double saving){}
	S
	 */


}
