package edu.escuelaing.arep.Model;

public class LinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;


    public LinkedList(){
    }
    
    // Link METHODS.

    private void linkFirst(E value) {
        Node<E> f = first;
        Node<E> newNode = new Node<>(value,null,f);
        if (f == null)
            last = newNode;
        else
            f.setPrev(newNode);

        first = newNode;
        size++;
    }

    private void linkLast(E value) {
        Node<E> ult = last;
        Node<E> newNode = new Node<>(value,ult,null);
        if (ult == null)
            this.first = newNode;
        else
            ult.setNext(newNode);

        last = newNode;
        size++;
    }

    private void linkBefore(E value, Node<E> sigu) {
        Node<E> ant = sigu.prev();
        Node<E> newNode = new Node<>(value, ant, sigu);
        sigu.setPrev(newNode);
        if (ant == null)
            first = newNode;
        else
            ant.setNext(newNode);;
        size++;
    }

    // ADD METHODS.
    public void add(E value){
        linkLast(value);
    }
    public void addFirst(E value){
        linkFirst(value);
    }
    public void addLast(E value){
        linkLast(value);
    }
    public void add (int index, E value){

        if (index == size){
            linkLast(value);
        }
        else{
            linkBefore(value, searchNode(index));
        }
        
    }
    // GET METHODS
    public E getFirst(){
        return first.data();
    }
   
    public E getLast(){
        return last.data();
    } 
    
    public int getSize(){
        return size;
    } 

    private Node<E> searchNode(int index) {
        
        if (index >=0 && index < this.size){
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next();
            return x;
        }else if ( index >= -size &&  index <= -1){
            Node<E> x = last;
            for (int i = size - 1; i > 0; i--){
                System.out.println(x.data());
                x = x.prev();
            }
            return x;
        }else{
            throw new IndexOutOfBoundsException("Index: "+index+", Size: "+size);
        }
    }


    public E get(int index){
        return searchNode(index).data();
    }

    
}