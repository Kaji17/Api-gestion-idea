package com.pevir.idea.repository;

import org.springframework.data.repository.CrudRepository;

import com.pevir.idea.modele.Idea;

public interface IIdeaRespository extends CrudRepository<Idea, Integer> {

}
