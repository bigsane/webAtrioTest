package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Personne;
import dao.PersonneDAO;

@Service
public class PersonneService {

	@Autowired
	private PersonneDAO personneDAO;
	
	public Personne savePersonne(Personne personne) {
		int dateActuelle = 2022;
		if(dateActuelle - personne.getDateNaissance() < 150) {
			return personneDAO.save(personne);
		}else {
			throw new IllegalArgumentException();
		}
		
	}
	
	public List<Personne> getListPersonne() {
		return (List<Personne>) personneDAO.findAll();
	}
}
