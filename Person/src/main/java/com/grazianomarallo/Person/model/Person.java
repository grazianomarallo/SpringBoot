package com.grazianomarallo.Person.model;
/**
 * @author grazianomarallo
 * @project: Person
 * @package: com.grazianomarallo.Person.model
 * @date: 10/03/2020
 */
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Person {
    private final UUID id;
    @NotBlank //this means that we cannot have blank
    private final String name;
    @NotNull
    @Min(0)
    private final Integer age;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }
}
