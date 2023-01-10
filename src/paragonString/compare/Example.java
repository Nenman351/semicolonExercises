package paragonString.compare;

import javax.management.StringValueExp;

public class Example {
    public static void main(String[] args) {
        String name = "hello";

        String str = new String("hello");
//        System.out.println(name == str);
//        System.out.println(name.equalsIgnoreCase(str));
//        System.out.println(name.compareTo("hemlo"));
//        System.out.println(name.regionMatches(true, 1, str, 1, 2));
        System.out.println(name.indexOf('e', 2));
        System.out.println(name.lastIndexOf('l', 0));
        System.out.println();

        String school = "Semicolon Africa";
        String continent = school.substring(10);
        String extract = continent.substring(2, 6);
        System.out.println(extract);
    }
}
