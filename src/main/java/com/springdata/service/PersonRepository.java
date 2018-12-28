package com.springdata.service;

import com.springdata.domain.Person;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Date;
import java.util.List;

//@RepositoryDefinition 注解来替代继承 Repository 接口
//@RepositoryDefinition(domainClass = Person.class,idClass = Integer.class)
//public interface PersonRepository  {


public interface PersonRepository extends Repository<Person,Integer> {

    Person getByName(String name);

    ////WHERE lastName like %? AND id < ?
    List<Person> getByNameEndingWithAndAgeLessThan(String name, Integer age);

    //WHERE lastName like ?% AND id > ?
    List<Person> getByNameStartingWithAndAgeGreaterThan(String name, Integer age);

    //WHERE email IN(?,?,?) OR birth < ?
    List<Person> getByEmailInOrBirthLessThan(List<String> emailList, Date date);
}
