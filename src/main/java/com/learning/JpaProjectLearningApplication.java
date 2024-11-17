package com.learning;

 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.learning.repostry.UserRepost;
import com.learning.userEntity.Uentitys;

@SpringBootApplication
public class JpaProjectLearningApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaProjectLearningApplication.class, args);
		
		UserRepost userRepost=context.getBean(UserRepost.class);
			
		Uentitys uentitys= new Uentitys();
		uentitys.setName("Rohan");
		uentitys.setCity("gulbarga");
		uentitys.setStatus("Learning");
		
		 Uentitys uentitys2 = userRepost.save(uentitys);
		 
		 System.out.println(uentitys2);

		 Uentitys uentitys3=new Uentitys();
		 uentitys3.setName("shahid");
		 uentitys3.setStatus("active");
		 uentitys3.setCity("mumbai");
	
		 Uentitys uentitys4 =   userRepost.save(uentitys3);
		 
		 System.out.println(uentitys4);
	}

}
