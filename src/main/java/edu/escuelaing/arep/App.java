package edu.escuelaing.arep;

// import java.util.Iterator;
// import java.util.LinkedList;

import edu.escuelaing.arep.Model.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        LinkedList lista = new LinkedList();
        lista.add(50.2);
        lista.add(10.3);


        
    }

    /**
    public static void main( String[] args )
    {
        LinkedList<String> list=new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("Negan");

        //Adding an element to the last position
        list.addLast("Rick");

        //Adding an element to the 3rd position
        list.add(2, "Glenn");

        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
        System.out.println(iterator.next());
        }
    }
    **/
    
}
