package net.media.training.designpattern.solutions.builder;

public class PersonBuilder {
    private String name;
    private int id;
    private String city;
    private String country;

    PersonBuilder(String name){
        this.name = name;
    }

    PersonBuilder setId(int id){
        this.id = id;
        return this;
    }

    PersonBuilder setCity(String city){
        this.city = city;
        return this;
    }

    PersonBuilder setCountry(String country){
        this.country = country;
        return this;
    }

    Person getPerson() {
        return new Person(name, id, city,country);
    }

}
