package com.grazianomarallo.Person.dao;
/**
 * @author grazianomarallo
 * @project: Person
 * @package: com.grazianomarallo.Person.dao
 * @date: 10/03/2020
 */

import com.grazianomarallo.Person.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

//This class mock a databse
@Repository("fakeDao") //@Component is the same
public class FakePersonDataAccessService implements PersonDao {
    //Simulate a DB as an ArrayList
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.getAge()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> optionalPerson = selectPersonById(id);
        if(optionalPerson.isEmpty())
         return 0;
        DB.remove(optionalPerson.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person update) {
        return selectPersonById(id)
                .map(person -> {
                     int indexOfPersontoUpdate = DB.indexOf(person);
                     if(indexOfPersontoUpdate >= 0){
                         DB.set(indexOfPersontoUpdate, new Person(id, update.getName(), update.getAge()));
                         return 1;
                    }
                     return 0;
                })
                .orElse(0);
    }


}
