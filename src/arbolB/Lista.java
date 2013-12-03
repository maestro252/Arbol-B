/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolB;

import java.util.*;

public class Lista
{
    // instance variables - replace the example below with your own
    public static ArrayList<Integer> ingresados;


    public Lista()
    {
       ingresados = new ArrayList<Integer>();
    }
    public boolean buscar(int valor){
        boolean esta = false;
        for (int i = 0; i < ingresados.size() && !esta; i++){
            if (ingresados.get(i) == valor){
                 esta = true;
                
            }
        }
        return esta;
        
    }
}