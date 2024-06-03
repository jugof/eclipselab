package example.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityTestApplication.class, args);
	}
	
	@Bean
	public UserDetailsService getUserDetailsService() {
		
		UserDetails adminUser = User.withUsername("admin").password("{noop}admin").roles("ADMIN").build();
		
		UserDetails userUser = User.withUsername("user").password("{noop}user").roles("USER").build();
		
		InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(adminUser, userUser);
		
		return userDetailsManager;
	}
	
	@Bean
	public SecurityFilterChain getSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				auth -> {
					auth.requestMatchers("/do-greet").permitAll();
					auth.requestMatchers("/user-work").hasAnyRole("ADMIN", "USER").
					requestMatchers("/admin-work").hasAnyRole("ADMIN").anyRequest().authenticated();
				}
		);
		http.formLogin(Customizer.withDefaults());
		http.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}
	
}
