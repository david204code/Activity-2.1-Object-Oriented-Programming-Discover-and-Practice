package trivera.core.simpleclass;

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

public class Employee {
    // instance fields salary and name
    int salary;
    String name;

    //CODE1:
    //Add an empty constructor
    public Employee() {
    }

    //CODE2:
    //Add a constructor that sets name and defaults salary to 500
    public Employee(String name) {
        this(name, 500);
    }

    //CODE3:
    //Add constructor that sets name and salary
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    //CODE4:
    //Create a getter method that returns the employees name
    public String getName() {
        return name;
    }

    //CODE5:
    //Create a setter method that sets the employees name
    public void setName(String name) {
        this.name = name;
    }

    //CODE6:
    //Create a getter method that gets the employees salary
    public int getSalary() {
        return salary;
    }

    //CODE7:
    //Create a setter method that sets the employees salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
