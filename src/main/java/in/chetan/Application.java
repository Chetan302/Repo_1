package in.chetan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

   private String status= "";
   private static final String REST_URL = "www.lobOne.com/login";
    

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	public static void getAccess(String UName, String uPwd){
   
        //logic to authontication and authorization


	}

}
