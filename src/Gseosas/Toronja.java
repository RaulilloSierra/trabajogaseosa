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
public class Toronja extends Gaseosa {
    public String Sabor;
    public int Presentacion;
    
    public Toronja (){
    
    }

    public Toronja (String TipoEnvase, String Color, String TipoEtiqueta, int Precio, String Sabor, int Presentacion) {
        super(TipoEnvase, Color, TipoEtiqueta, Precio);
        this.Sabor=Sabor;
        this.Presentacion=Presentacion;
    }
    public void setDatosToronja(String Sabor, int Presentacion) {
        this.Sabor = Sabor;
        this.Presentacion=Presentacion;
    }
    public String getSabor() {
        return Sabor;
    }

    public int getPresentacion() {
        return Presentacion;
    }
    public void MostrarDatos(){
        Toronja obj1 = new Toronja();
        obj1.setDatosGaseosa("Vidrio", "Amarillo", "Papel adherible", 1500);
        obj1.setDatosToronja("Toronja", 1500);
        System.out.println("Sabor: "+obj1.getSabor()+"\n"
                + "Color: "+obj1.getColor()+"\n"
                + "Tipo de Envase: "+obj1.getTipoEnvase()+"\n"
                + "Presentacion: "+obj1.getPresentacion()+" ml"+"\n"
                + "Tipo de Etiqueta: "+obj1.getTipoEtiqueta()+"\n"
                + "Precio: "+obj1.getPrecio()+" pesos"+"\n");
    }
    
}