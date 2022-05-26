package springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	   @Bean
	   public Student s1() {
	      return new Student(id());
	   }
	   @Bean
	   public ID id() {
	      return new ID();
	   }
	}