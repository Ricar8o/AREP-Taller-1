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

        LinkedList<Double> lista = new LinkedList<Double>();
        lista.add(50.2);
        lista.add(10.3);
        lista.add(20.3);
        lista.add(40.3);
        lista.add(-80.3);

        System.out.println( lista.get(-5));
        
    }
    
}
