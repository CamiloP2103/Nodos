/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodosenlazados;
import nodosenlazados.Lista;
/**
 *
 * @author sala5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(20);


        nodo1.next = nodo2;


        Nodo actual = nodo1;
        while(actual != null){
            System.out.println(actual.item + "->");
            actual = actual.next;
        }
       System.out.print("null");
    }
    
}
