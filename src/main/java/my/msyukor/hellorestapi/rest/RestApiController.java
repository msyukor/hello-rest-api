package my.msyukor.hellorestapi.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RestApiController {

	@Value( "${info.app.version}" )
	private String appVersion;
	
	@GetMapping("/")
	public String helloWorld() {
		return "MyAPI version " + appVersion;
	}

}
