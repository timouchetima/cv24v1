package fr.univrouen.cv24.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//principalement utilisée dans le contexte de développement d'API RESTful.
@RestController
public class PostController {
	@RequestMapping(value = "/testpost", method = RequestMethod.POST, consumes = "application/xml")
	public String postTest(@RequestBody String flux) {
		return ("<result><response>Message reçu : </response>" + flux + "</result>");
	}
}
