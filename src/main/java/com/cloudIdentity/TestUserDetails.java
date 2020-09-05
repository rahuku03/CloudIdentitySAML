package com.cloudIdentity;



import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.security.saml.userdetails.SAMLUserDetailsService;




public class TestUserDetails implements SAMLUserDetailsService {
	
	String email;
	
	
	@Override
	public Object loadUserBySAML(SAMLCredential cred) throws UsernameNotFoundException {
	
		email=cred.getAttributeAsString("email");
		
		System.out.println("EMAIL:::::::"+email);
		
		return cred.getAttributeAsString("email");
		
		
		
	}
}