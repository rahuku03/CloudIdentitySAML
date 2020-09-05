package com.cloudIdentity;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class CloudIdentitySamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudIdentitySamlApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
	
   TestUserDetails t=new TestUserDetails();
   System.out.println(t.email);
		
		return "index";
	}
	
	
	@GetMapping("/saml")
    public String myindex() {
        return "index";
    }
	
	
	@GetMapping("/logout")
    public String logout() {
		
		System.out.println("CHECKING");
		SecurityContextLogoutHandler securityContextLogoutHandler=
				new SecurityContextLogoutHandler();
		
		securityContextLogoutHandler.setClearAuthentication(true);
		securityContextLogoutHandler.setInvalidateHttpSession(true);
		
		System.out.println("CHECKING");
		
        return "logout";
    }
}
