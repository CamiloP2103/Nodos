/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.util.Iterator;

/**
 *
 * @author sala5
 */
public class Queue <Item> implements Iterable<Item>{
    private Node first;
    private Node last;
    private int count;
    
    public Queue(){
        first = null;
        last = null;
        count = 0;
    }
    
    private class Node{
        Item item;
        Node next;
    }
    
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        oldlast.next = last;
        if(isEmpty())
            first = last;
        count++;
    }
    
    public Item dequeue(){
        Item item = first.item;
        first.item = null;
        first = first.next;
        count--;
        if(isEmpty())
            last = null;
        return item;
    }
    
    public boolean isEmpty(){return first == null;}
    public int size(){return count;}
    
    @Override
    public Iterator<Item> iterator() {
        return new LinkedListIterator();
    }
    
    private class LinkedListIterator implements Iterator{
        
        private Node current;
        
        @Override
        public boolean hasNext() {return current != null;}

        @Override
        public Object next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
        
    }
}
