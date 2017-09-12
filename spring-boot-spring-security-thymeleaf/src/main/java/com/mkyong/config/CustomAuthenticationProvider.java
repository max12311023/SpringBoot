package com.mkyong.config;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

import org.apache.log4j.Logger;
import org.springframework.ldap.NamingException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	private Logger log = Logger.getLogger(CustomAuthenticationProvider.class);

	@Override
	public Authentication authenticate(Authentication authentication) 
			throws AuthenticationException {

		String username = authentication.getName();
		String password = authentication.getCredentials().toString();

		log.info("username : " + username);
		log.info("password : " + password);

		try {
			if (isLdapRegistred(username, password)) {

				// use the credentials
				// and authenticate against the third-party system
				return new UsernamePasswordAuthenticationToken(
						username, password, new ArrayList<>());
			} else {
				return null;
			}
		} catch (NamingException ex) {
			log.info(ex);
		}
		return null;
	}

	boolean isLdapRegistred(String username, String password) {
		boolean result = false;
		try {
			StringBuffer lstbSecPrincipal=new StringBuffer();

			lstbSecPrincipal.append("cn=");
			lstbSecPrincipal.append(username);
			lstbSecPrincipal.append(",");
			lstbSecPrincipal.append("cn=users,DC=alphanetworks,DC=com");
			Hashtable<String, String> env = new Hashtable<String, String>();
			

			env.put(javax.naming.Context.INITIAL_CONTEXT_FACTORY,
					"com.sun.jndi.ldap.LdapCtxFactory");
			env.put(javax.naming.Context.PROVIDER_URL, "ldap://172.19.10.99/cn=pidoperator,DC=alphanetworks,DC=com");
			env.put(javax.naming.Context.SECURITY_AUTHENTICATION, "Simple");
			env.put(javax.naming.Context.SECURITY_PRINCIPAL,
					lstbSecPrincipal.toString());
			env.put(javax.naming.Context.SECURITY_CREDENTIALS, password);

			// Create the initial context
			DirContext ctx = new InitialDirContext(env);
			result = ctx != null;
			if (ctx != null)
				ctx.close();
			System.out.println(result);
			return result;
		} catch (Exception e) {
			System.out.println("oops");
			return result;
		}

	}


	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(
				UsernamePasswordAuthenticationToken.class);
	}
}