package edu.escuelaing.arep.Model;

public class Node {
    private Double data;
    private Node next;
    private Node prev;

    public Node(Double value, Node next) {
        this.data = value;
        this.next = next;
    }

    public Node(Double value) {
        this.data = value;
    }

    public Object data(){
        return this.data;
    }

    public void setData(Double value){
        this.data = value;
    }

    public Node next(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node prev(){
        return next;
    }

    public void setPrev(Node next){
        this.next = next;
    }
}