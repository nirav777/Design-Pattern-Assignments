package net.media.training.designpattern.solutions.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XMLBuilder {
    String tagName;
    Map<String, String> attributes;
    List<XMLBuilder> children;
    boolean isLeaf;
    String content;



    XMLBuilder(String tagName, Map<String, String> attributes){
        this.attributes = attributes;
        this.tagName = tagName;
        children = new ArrayList<>();
    }

    XMLBuilder(String tagName){
        this.tagName = tagName;
        children = new ArrayList<>();
    }



    XMLBuilder addElement(String tagName, Map<String, String> attributes) {
        XMLBuilder child = new XMLBuilder(tagName,attributes);
        children.add(child);
        return child;
    }

    XMLBuilder addElement(String tagName) {
        XMLBuilder child = new XMLBuilder(tagName);
        children.add(child);
        return child;
    }


    void addContent(String content){
        this.content = content;
        isLeaf = true;
    }

    String attributesToString(){
        if(attributes==null){
            return "";
        }
        StringBuilder result = new StringBuilder("");

        for(String key: attributes.keySet()){
            result.append(" ").append(key).append("=\"").append(attributes.get(key)).append("\"");
        }

        return result.toString();
    }
    //    <Person id="20" name="siddhesh">

    String buildXML(){
        StringBuilder finalXML = new StringBuilder("");
        finalXML.append("<").append(tagName).append(attributesToString()).append(">");
        if(isLeaf) finalXML.append(content);
        else {
            for (XMLBuilder child : children) {
                finalXML.append(child.buildXML());
            }
        }
        finalXML.append("</").append(tagName).append(">");
        return finalXML.toString();
    }
}


class AttributePairMisMatch  extends Exception
{
    public AttributePairMisMatch ()
    {
        // calling the constructor of parent Exception
        super("The number of keys and values are not matching.");
    }
}