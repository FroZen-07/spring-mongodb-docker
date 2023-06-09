package dev.bitan.springbootmongodb.service;

import dev.bitan.springbootmongodb.collection.Person;
import dev.bitan.springbootmongodb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;


    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }
}
