package com.pevir.idea.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pevir.idea.modele.Idea;
import com.pevir.idea.repository.IIdeaRespository;

@Service
public class IdeaService {

	@Autowired
	private IIdeaRespository ideaRepository;

	/**
	 * Méthodes permettant de retourner la liste de toute les idées
	 * 
	 * @return List<Idea>
	 */
	public List<Idea> getIdea() {
		List<Idea> ideas = new ArrayList<>();
		ideaRepository.findAll().forEach(idea1 ->{
			ideas.add(idea1);
		});
		return ideas;
	}

	/**
	 * Méthodes permettant de retourner une idée par l'id
	 * 
	 * @return Idea
	 */
	public Idea getIdeaById(int id) {
		return ideaRepository.findById(id).orElse( null);
	}
	
	
	/**
	 * Méthodes permettant de supprimer une idée par l'id
	 * 
	 * @return void
	 */
	public void deleteIdea(int id) {
		ideaRepository.deleteById(id);;
	}
	
	
	/**
	 * Méthodes permettant d'ajouter une idée
	 * 
	 * @return void
	 */
	public void addIdea(Idea idea1) {
		ideaRepository.save(idea1);
	}
	
	/**
	 * Méthodes permettant de modifier une idée
	 * 
	 * @return void
	 */
	public void updateIdea(Idea idea2, int id) {
		ideaRepository.save(idea2);
	}

}
