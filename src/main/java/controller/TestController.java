package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import bean.Personne;
import service.PersonneService;

@RestController
public class TestController {
	@Autowired
	private PersonneService personneService;
	
	@GetMapping("/personnes")
	public List<Personne> getListPersonne() {
		return personneService.getListPersonne();
	}
	
	@PostMapping("/personne")
	public Personne savePersonne(@PathVariable Personne personne) {
		return personneService.savePersonne(personne);
	}
}
