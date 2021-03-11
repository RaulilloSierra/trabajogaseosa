/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gseosas;

/**
 *
 * @author Raulito
 */
public class main {
    public static void main (String []args){
        System.out.println("Datos de la gaseosa 1:"+"\n");
        Manzana Objeto1=new Manzana();
        Objeto1.MostrarDatos();
        System.out.println("Datos de la gaseosa 2"+"\n");
        Uva Objeto2=new Uva();
        Objeto2.MostrarDatos();
        System.out.println("Datos de la gaseosa 3:"+"\n");
        Kola Objeto3=new Kola();
        Objeto3.MostrarDatos();
        System.out.println("Datos de la gaseosa 4:"+"\n");
        Toronja Objeto4=new Toronja();
        Objeto4.MostrarDatos();
    }
}
