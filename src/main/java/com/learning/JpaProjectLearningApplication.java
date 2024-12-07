package com.learning;

 
import java.util.List;
import java.util.Optional;

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
			
//		Uentitys uentitys= new Uentitys();
//		uentitys.setName("Rohan");
//		uentitys.setCity("gulbarga");
//		uentitys.setStatus("Learning");
		
		//to store single data
//		 Uentitys uentitys2 = userRepost.save(uentitys);
		 
//		 System.out.println(uentitys2);

//		 Uentitys uentitys3=new Uentitys();
//		 uentitys3.setName("shahid");
//		 uentitys3.setStatus("active");
//		 uentitys3.setCity("mumbai");
//	
//		 Uentitys uentitys4 =   userRepost.saveAll(uentitys, uentitys3);
		 
//		 System.out.println(uentitys4);
		 
		 //to store multiple data
//		 List<Uentitys> user=List.of(uentitys3,uentitys);
//		 Iterable<Uentitys> result=userRepost.saveAll(user);
//		 
//		 result.forEach(users->{
//			 System.out.println(users);
//		 });
//		 System.out.println("done");
		 
		 //update
//		 Optional<Uentitys>update=userRepost.findById(202);
//		 	Uentitys update1=update.get();
//		 	update1.setName("irfan");
//		 	
//		 Uentitys data=userRepost.save(update1);
//		 
//		 System.out.println("data updated successfully ----> "+ data);
//		 
		 //Delete By ID
		 
		 Optional<Uentitys> UpdateName=userRepost.findById(202);
		 Uentitys updateByName=UpdateName.get();
		 updateByName.setStatus("turn off");
		 Uentitys uentitys=userRepost.save(updateByName);
		 
		 System.out.println("status updated "+ uentitys);
	}

}
