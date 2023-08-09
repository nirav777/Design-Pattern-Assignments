package net.media.training.designpattern.solutions.builder;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Person person1 = new PersonBuilder("siddhesh").setId(20).setCity("Dombivli").setCountry("India").getPerson();
        Person person2 = new PersonBuilder("Mahesh").setId(30).setCountry("India").setCity("Ambernath").getPerson();

        String xmlString = PeopleDataSource.getPeopleXml(new ArrayList<>(List.of(person1,person2)));
        System.out.println(xmlString);
    }
}
