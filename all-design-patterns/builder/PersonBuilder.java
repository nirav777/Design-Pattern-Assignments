package net.media.training.designpattern.builder;

public class PersonBuilder {
    int id;
    String name, city, country;

    public PersonBuilder addId(int id){
        this.id = id;
        return this;
    }

    public PersonBuilder addName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder addCity(String city){
        this.city = city;
        return this;
    }

    public PersonBuilder addCountry(String country){
        this.country = country;
        return this;
    }

    public Person build(){
        Person person = new Person(name, id, city, country);
        return person;
    }

}
