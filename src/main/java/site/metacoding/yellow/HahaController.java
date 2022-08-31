package site.metacoding.yellow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HahaController {
	
	@GetMapping("/yellow")
	public String abcde() {
		return "index";
	}
}
