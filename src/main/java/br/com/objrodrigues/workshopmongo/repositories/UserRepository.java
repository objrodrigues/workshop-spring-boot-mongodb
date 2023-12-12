package br.com.objrodrigues.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.objrodrigues.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
}
