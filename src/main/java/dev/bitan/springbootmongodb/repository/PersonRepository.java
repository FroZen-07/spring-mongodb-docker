package dev.bitan.springbootmongodb.repository;

import dev.bitan.springbootmongodb.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
