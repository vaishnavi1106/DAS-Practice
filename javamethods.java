import java.util.*;

class javamethods{
    public static void main(String[] args) {
        String name1= "vaishnavi sonawane";
        String name2 = "Manish sonawane";
         
        // The charAt() method returns the character at the specified index in a string.

        // The index of the first character is 0, the second character is 1, and so on.
        char result=name1.charAt(4);
        System.out.println(result);

        // The codePointAt() method returns the Unicode value of the character at the specified index in a string.

        // The index of the first character is 0, the second character is 1, and so on.

        System.out.println(name1.codePointAt(0));
        // Returns the Unicode of the character before the specified index

        System.out.println(name1.codePointBefore(12));

        // Returns the number of Unicode values found in a string

        System.out.println(name1.codePointCount(4,7));

        // Compares two strings lexicographically

        System.out.println(name1.compareTo(name2));

        //  Compares two strings lexicographically, ignoring case differences
        System.out.println(name1.compareToIgnoreCase(name2));
        
        // 	Appends a string to the end of another string

        System.out.println(name1.concat(name2));
         
        //  	Checks whether a string contains a sequence of characters

        System.out.println(name1.contains(name2));
        System.out.println(name1.contains("sonawane"));
        // Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer

        System.out.println(name1.contentEquals(name2));

        // Returns a String that represents the characters of the character array
         char[] charArray = {'V', 'a', 'i', 's', 'h', 'n', 'a', 'v', 'i', ' ', 'S', 'o', 'n', 'a', 'w', 'a', 'n', 'e'};
        String name3 = new String(charArray);
        System.out.println(name3);


        // start with and end with method
        System.out.println(name1.startsWith("vaishnavi"));
        System.out.println(name2.endsWith("cobara"));

        //equals method,replace method

        System.out.println(name1.equals("manisha bai"));
        System.out.println(name1.replace("vaishnavi","manisha bai"));

        // equals ignore case method it ignore the lower case and upper case diffrence
        System.out.println(name1.equalsIgnoreCase("MANISH SONAWANE"));

        // Returns a formatted string using the specified locale, format string, and arguments
         String mystr="hello %s! one kilobyte is %,d bytesd";
         System.out.println(String.format(mystr,"vaishnavi",1000));

        //  Converts a string into an array of bytes
        byte[] value=mystr.getBytes();
        System.out.println(value[0]);

        //getChars method
        char[] ch=name1.toCharArray();
        System.out.println(ch);

        //hashcode method
        System.out.println(name1.hashCode());

        //indexOf method
        System.out.println(name1.indexOf("sonawane"));

        //lastindexof method
        System.out.println(name1.lastIndexOf("sonawane"));

        //intern method
        System.out.println(name1.intern());

        //isEmpty method        
        System.out.println(name1.isEmpty());
        //join method
        System.out.println(String.join(" ","vaishnavi","patil","sonawane"));
      
        //length method
        System.out.println(name1.length());

        //matches method
        System.out.println(name1.matches("vaishnavi"));

        //split method
        System.out.println(name1.split("sonawane"));

        //substring method  
        System.out.println(name1.substring(4)); 

        //toLowerCase method
        System.out.println(name1.toLowerCase());

        //toUpperCase method
        System.out.println(name1.toUpperCase());

        //trim method
        System.out.println("trim method");
        System.out.println(name1.trim());

        //valueOf method
        System.out.println(String.valueOf(name1.charAt(4)));

        

    }
}