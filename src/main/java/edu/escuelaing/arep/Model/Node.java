package edu.escuelaing.arep.Model;

public class Node<E>{
    private E data;
    private Node<E> next;
    private Node<E> prev;

    public Node(E value, Node<E> prev, Node<E> next) {
        this.data = value;
        this.next = next;
        this.prev = prev;
    }

    public E data(){
        return this.data;
    }

    public void setData(E value){
        this.data = value;
    }

    public Node<E> next(){
        return next;
    }

    public void setNext(Node<E> next){
        this.next = next;
    }

    public Node<E> prev(){
        return prev;
    }

    public void setPrev(Node<E> prev){
        this.prev = prev;
    }
}