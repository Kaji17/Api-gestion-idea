package com.pevir.idea.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pevir.idea.modele.Idea;
import com.pevir.idea.services.IdeaService; 


@CrossOrigin(origins= "*")
@RestController
public class ideaControlleur {
	
	//Injection du service IdeaServie
	@Autowired 
	private IdeaService ideaservice;
	
	//Controlleur pour récuperer la liste des idées 
	@GetMapping(value="/idees")
	public List<Idea> getIdea() {
		return ideaservice.getIdea();
	}
	
	//Controlleur pour récuperer une idéee en fonction de son identifiant
	@GetMapping(value="/idees/{id}")
	public Idea getIdeaById(@PathVariable int id) {
		return ideaservice.getIdeaById(id);
	}
	
	//Controlleur pour supprimer une idéee en fonction de son identifiant
	@DeleteMapping(value="/idees/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteIdea(@PathVariable int id) {
		ideaservice.deleteIdea(id);
	}
	
	//Controlleur pour ajouter une idéee
	@PostMapping(value="/idees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addIdea(@RequestBody Idea idea1) {
		ideaservice.addIdea(idea1);
	}
	
	//Controlleur pour modifier une idéee
	@PutMapping(value="/idees/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Idea idea1, @PathVariable int id) {
		ideaservice.updateIdea(idea1, id);
	}
}
