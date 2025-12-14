package com.learning.string;

public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb+" world!");
        System.out.println("Length = "+sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.capacity());
        System.out.println(sb.append(" world"));
        System.out.println(sb.insert(1, "Mr. Kim"));
        System.out.println(sb.delete(1,2));

        StringBuffer word = new StringBuffer("MOM");
        word.reverse();
        System.out.println(word);
    }

}
