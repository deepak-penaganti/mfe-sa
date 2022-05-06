package dev.deepakpenaganti.ssp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.deepakpenaganti.ssp.documents.User;

public interface UserRepository extends MongoRepository<User, Integer>{

}
