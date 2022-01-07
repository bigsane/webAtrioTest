package dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bean.Personne;

public interface PersonneDAO extends CrudRepository<Personne, Long> {
	
	public List<Personne> findAll();
}
