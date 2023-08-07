package net.media.training.designpattern.builder;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> listOfPeople = new ArrayList<>();
        Person personObj = new PersonBuilder().addName("Nirav").addId(5).addCity("Dombivli").addCountry("India").build();
        listOfPeople.add(personObj);

        PeopleDataSource obj = new PeopleDataSource();
        String xmlData = obj.getPeopleXml(listOfPeople);
        System.out.println(xmlData);
    }
}
