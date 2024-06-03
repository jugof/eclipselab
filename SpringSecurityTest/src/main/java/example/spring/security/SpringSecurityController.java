package example.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

	@GetMapping("/do-greet")
	public String greet() {
		return "Welcome to Spring Security [[Greet()]/do-greet]";
	}
	
	@GetMapping("/admin-work")
	public String adminWork() {
		return "Admin doing his work bitch [[adminWork()]/admin-work]";
	}
	
	@GetMapping("/user-work")
	public String userWork() {
		return "User doing his work biootchh [[userWork()]/user-work]";
	}
}
