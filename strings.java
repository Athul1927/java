// write a program to read string manipulation method 

public class strings{

public static void main(String[] args)
{
   
    String str1 = " Welcome to my system ";
    String str2 = "java programming";


    int length = str1.length();
    System.out.println("length of str1:" + length);

    //concatenation of string

    String str3 = str1.concat(str2);
    System.out.println("concatenated string:" + str3);

    String str4 = str1 + " " + str2;
    System.out.println("concatenated string using + operation: " + str4);

    String str5 = " WELCOME TO MY SYSTEM ";

    //comparing strings
    
    boolean isEqual = str1.equals(str2);
    System.out.println("Are str1 and str2 equal (ignoring case)?" + isEqual);

    // index of a character
    int index =str1.indexOf('o');
    System.out.println("Index of 'o' in str1: " + index);

    // upper case and lower cse
    String upperStr = str1.toUpperCase();
    String lowerStr = str1.toLowerCase();
    System.out.println("Upper Case:" + upperStr);
    System.out.println("Lower Case: " + lowerStr);

    // replace character
    String replacedStr= str1.replace('o','x');
    System.out.println("Replaced String:" + replacedStr);

    //substring
    String subStr = str1.substring(0,5);
    System.out.println("Substring" + subStr);

    //trim 
    String str6 = "  Welcome to my system  ";
    String trimmedStr = str6.trim();
    System.out.println("Trimmed string : " + trimmedStr);

    //ASCI value of a character
    char ch = 'A';
    int asciivalue = (int) ch;
    System.out.println("ASCII value of '" + ch + "':" + asciivalue);

    //byte value of a string
    byte[] byteArray = str1.getBytes();
    System.out.println("Byte array of str1: " + java.util.Arrays.toString(byteArray));

}

}
    

