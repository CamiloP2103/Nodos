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
public class Stack <Item> implements Iterable<Item>{
    private Node first;
    private int count;
    
    public Stack(){
        first = null;
        count = 0;
    }
    
    private class Node{
        Item item;
        Node next;
    }
    
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        count++;
    }
    
    public Item pop(){
        Item item = first.item;
        first.item = null;
        first = first.next;
        count--;
        return item;
    }
    
    public Item peak(){
        return first.item;
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
