package sa.mahmoud.TutorialTrial1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerService {
	
	@RequestMapping("/")
	public String doWork()
	{
		
		return "index";
	}

}
