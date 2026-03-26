import java.io.*;
import java.util.LinkedList;
public class RemoveElementsLinkedList {
    public static void main(String args[])
    {
        LinkedList<String>list=new LinkedList<String>();
        list.add("Good");
        list.add("Morning");
        list.add("have");
        list.add("a");
        list.add("great day");
        list.add("2");
        list.add("day");
        System.out.println("Orginal LinkedList:" + list);
        list .clear();
        System.out.println("List after clearing all elements : " + list);
        list.add("look");
        list.add("good");
        System.out.println("After adding element to empty list: "+ list);
    }
}
