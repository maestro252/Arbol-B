/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolB;

public class Nodo
{
    public int []valores;
    public Nodo []nodo;
    public static int numValores;
    public boolean tengoHijos = false;
    public int ocupados = 0;
    public Nodo padre;
    public Nodo(){
       nodo = new Nodo [Raiz.grado * 2 + 3];
       valores = new int [Raiz.grado * 2 + 1];
    }
    
}