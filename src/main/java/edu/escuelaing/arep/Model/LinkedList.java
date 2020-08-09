package edu.escuelaing.arep.Model;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;


    public LinkedList(){
    }
    
    // ADD METHODS.

    public void addFirst(Double nodeValue) {
        Node f = first;
        Node newNode = new Node(nodeValue, f);
        if (f == null)
            last = newNode;
        else
            f.setPrev(newNode);

        first = newNode;
        size++;
    }

    public void addLast(Double nodeValue) {
        Node ult = last;
        Node newNode = new Node(nodeValue);
        if (ult == null)
            this.first = newNode;
        else
            ult.setNext(newNode);

        last = newNode;
        size++;
    }

    public void add(Double nodeValue){
        addLast(nodeValue);
    }

    // GET METHODS
    public Node getFirst(){
        return first;
    }
   
    public Node getLast(){
        return last;
    } 
    
    public int getSize(){
        return size;
    } 

}