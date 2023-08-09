package net.media.training.designpattern.solutions.builder;

import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        StringBuilder finalXML = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        XMLBuilder root = new XMLBuilder("People",new HashMap<>(){{
            put("number", Integer.toString(persons.size()));
        }});
        for (Person person : persons) {
            String idStr = Integer.toString(person.getId());
            String nameStr = person.getName();
            XMLBuilder address = root.addElement("Person", new HashMap<>(){
                {
                    put("id",idStr);
                    put("name",nameStr);}
            }).addElement("Address");

            address.addElement("City").addContent(person.getCity());
            address.addElement("Country").addContent(person.getCountry());
        }
        return root.buildXML();
    }
}

