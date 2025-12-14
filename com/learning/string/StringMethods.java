package com.learning.string;

public class StringMethods {

    public static void main(String[] args) {

        String str=" 3RITECHNOLOGy ";

        System.out.println(str.equals("Aashika"));
        System.out.println(str.equals("3RITECHNOLOGY"));
        System.out.println(str.equalsIgnoreCase("3RITECHNOLOGY"));
        System.out.println(str.compareTo("3RITECHNOLOGY"));
        System.out.println(str.compareTo("3RITECHNOLOGz")); //
        System.out.println(str.indexOf("O"));
        System.out.println(str.lastIndexOf("O"));
        System.out.println(str.replace("y","x"));
        System.out.println(str.substring(3,12));
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());


    }

}
