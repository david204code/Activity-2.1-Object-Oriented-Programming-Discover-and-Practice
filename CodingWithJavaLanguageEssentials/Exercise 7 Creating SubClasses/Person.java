package trivera.core.employee;

/**
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of Trivera Technologies, LLC
 *
 * Copyright (c) 2019 Trivera Technologies, LLC.
 * http://www.triveratech.com
 * </p>
 * @author Trivera Technologies Tech Team.
 */


public class Person {
    //CODE1:
    // The name private instance field
    private String name;

    //CODE2:
    // Create empty constructor
    // Create constructor that initialises the name
    public Person() {
    }

    public Person(String name) {
        // Saves the name argument into the instance field
        this.name = name;
    }

    //CODE3:
    // Override and implement the equals and toString methods
    public boolean equals(Object other) {
        // If the other object is not a Person, return false
        if (!(other instanceof Person))
        return false;

        // Cast the other reference into a Person
        Person otherPerson = (Person) other;

        // Get the name of the other other Person
        String otherName = otherPerson.getName();

        // If the other name is not null and it is equal (case insensitive)
        // to this Person's name, return true, otherwise return false
        return otherName != null && otherName.equalsIgnoreCase(this.name);
    }

    //CODE4:
    // Implement getter and setter methods for the name field
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}