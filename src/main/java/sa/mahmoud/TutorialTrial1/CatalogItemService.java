package sa.mahmoud.TutorialTrial1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogItemService {
	
	@RequestMapping("/")
	public String doWork()
	{
		
		return "I am Mahmoud";
	}

}
