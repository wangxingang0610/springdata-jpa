package com.springdata.service;

import com.springdata.domain.Person;
import org.springframework.data.repository.Repository;

public interface PersonRepository extends Repository<Person,Integer> {

    Person getByName(String name);
}
