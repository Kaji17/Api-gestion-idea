package com.pevir.idea.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pevir.idea.modele.Idea;
import com.pevir.idea.repository.IIdeaRespository;
import com.pevir.idea.services.IdeaService;

@RestController
public class ideaControlleur {
	
	//Injection du service IdeaServie
	@Autowired 
	private IdeaService ideaservice;
	
	
	//Controlleur pour récuperer la liste des idées 
	@RequestMapping(method = RequestMethod.GET, value="/api-gest-idee-v1.0.0/idees")
	public List<Idea> getIdea() {
		return ideaservice.getIdea();
	}
	
	//Controlleur pour récuperer une idéee en fonction de son identifiant
	@RequestMapping(method = RequestMethod.GET, value= "/api-gest-idee-v1.0.0/idee/{id}")
	public Idea getIdeaById(@PathVariable int id) {
		return ideaservice.getIdeaById(id);
	}
	
	//Controlleur pour supprimer une idéee en fonction de son identifiant
	@RequestMapping(method = RequestMethod.DELETE, value= "/api-gest-idee-v1.0.0/idee/{id}")
	public void deleteIdea(@PathVariable int id) {
		ideaservice.deleteIdea(id);
	}
	
	//Controlleur pour ajouter une idéee
	@RequestMapping(method = RequestMethod.POST, value="/api-gest-idee-v1.0.0/idees")
	public void addIdea(@RequestBody Idea idea1) {
		ideaservice.addIdea(idea1);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value="/api-gest-idee-v1.0.0/idee/{id}")
	public void update(@RequestBody Idea idea1, @PathVariable int id) {
		ideaservice.updateIdea(idea1, id);
	}
}
