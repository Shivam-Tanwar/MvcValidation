import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class UserController {

	@RequestMapping("/greeting")
	public String greeting(Model m) {
		m.addAttribute("user",new User());
		return "myviewpage";
	}
	@RequestMapping("/greeting2")
	public String greeting2(@Valid @ModelAttribute("user")User u, BindingResult br) {
		if(br.hasErrors()) {
			return "myviewpage";
		}
		else {
			return "myviewpage2";
		}
	}
}
