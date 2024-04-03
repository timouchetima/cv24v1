package fr.univrouen.cv24.controllers;

//import java.awt.PageAttributes.MediaType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.TestCV;
import util.Fichier;

@RestController
public class GetController {
	@GetMapping("/resume")
	public String getListCVinXML() {
		return "Envoi de la liste des CV";
	}

	@GetMapping("/cvid")
	//public String getCVinXML() {
	//	return "Détail du contenu du CV demandé";
	//}
	
	
	public String getCVinXML(
	@RequestParam(value = "texte") String texte) {
	return ("Détail du CV n°" + texte);
	}
	@GetMapping("/test")
	public String getCVinXML(
			@RequestParam(value = "id") int id,@RequestParam(value = "titre") String titre) {
			return ( "Test : \n" +
	                "id = " + id + "\n" +
	                "titre = " + titre);
			}
	//@RequestParam(value = "texte")  ==>permet de passer en paramtre dans  url
	//http://localhost:8080/cvid?texte=12345
	
	@GetMapping("/testfic")
	public String afficherContenuFichier() {
	    return Fichier.loadFileXML();
	}
	
	@RequestMapping(value="/testxml", produces=MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody TestCV getXML() {
	TestCV cv = new TestCV("HAMILTON","Margaret","1969/07/21","Appollo11@nasa.us");
	return cv;
	}
}