package dev.bitan.springbootmongodb.service;

import dev.bitan.springbootmongodb.collection.Person;

public interface PersonService {
    String save(Person person);
}
