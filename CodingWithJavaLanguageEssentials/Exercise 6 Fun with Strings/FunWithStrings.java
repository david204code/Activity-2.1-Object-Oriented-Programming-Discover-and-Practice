package trivera.core.strings;

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

public class FunWithStrings {

    public static void main(java.lang.String[] args) {
        System.out.println("Exercise: Strings");
        System.out.println("Type: lab-code");
        System.out.println("Java: " + System.getProperty("java.version"));

        //CODE1:
        // Create four strings
        String string1 = new String("Praise");
        String string2 = new String("the");
        String string3 = new String("Holy");
        String string4 = string3;

        //CODE2:
        // Print out each string, along with their lengths
        System.out.println("String-1: " + string1 + " Length: " + string1.length());
        System.out.println("String-2: " + string2 + " Length: " + string2.length());
        System.out.println("String-3: " + string3 + " Length: " + string3.length());
        System.out.println("String-4: " + string4 + " Length: " + string4.length());

        //CODE3:
        // If string1 equals string2, print saying so
        if (string1.equals(string2))
            System.out.println("String-1 and String-2 are equal");
        else
            System.out.println("String-1 and String-2 are not equal");

        //CODE4:
        // If string1 == string2, print
        if (string1 == string2)
            System.out.println("String-1 and String-2 are ==");
        else
            System.out.println("String-1 and String-2 are not ==");

        //CODE5:
        // If string3 equals string4, print
        if (string3.equals(string4))
            System.out.println("String-3 and String-4 are equal");
        else
            System.out.println("String-3 and String-4 are not equal");

        //CODE6:
        // If string3 == string4, print
        if (string3 == string4)
            System.out.println("String-3 and String-4 are ==");
        else
            System.out.println("String-3 and String-4 are not ==");

        //CODE7:
        // Create upper case copies of string1 and string3
        String upper1 = string1.toUpperCase();
        String upper2 = string3.toUpperCase();
        // Print uppercase copies
        System.out.println(upper1);
        System.out.println(upper2);

        //CODE8:
        // If string1 is case-insensitive-equal-to the new uppercase copy of
        // string1, print
        if (string1.equalsIgnoreCase(upper1))
            System.out.println("String-1 and Upper-1 are equal (ignoring case)");
        else
            System.out.println("String-1 and Upper-1 are not equal (ignoring case)");
    }
}