/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructras;

import java.util.Iterator;

/**
 *
 * @author sala5
 */
public class List <Item> implements Iterable<Item>{
    private Node first;
    private Node last;
    private int count;
    
    public List(){
        first = null;
        last = null;
        count = 0;
    }
    
    private class Node{
        Item item;
        Node next;
        Node prev;
    }
    
    public void add(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.prev = oldlast;
        oldlast.next = last;
        if(isEmpty())
            last.prev = null; 
            first = last;
        count++;
    }
    
    public Item remove(){
        if(isEmpty()) return null;
        Item item = first.item;
        first.item = null;
        first = first.next;
        count--;
        
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