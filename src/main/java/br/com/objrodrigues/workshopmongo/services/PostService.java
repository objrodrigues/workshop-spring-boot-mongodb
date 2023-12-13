package br.com.objrodrigues.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.objrodrigues.workshopmongo.domain.Post;
import br.com.objrodrigues.workshopmongo.exception.ObjectNotFoundException;
import br.com.objrodrigues.workshopmongo.repositories.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}