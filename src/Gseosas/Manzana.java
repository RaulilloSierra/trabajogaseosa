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
public class Manzana extends Gaseosa {
    public String Sabor;
    public int Presentacion;
    
    public Manzana (){
    
    }

    public Manzana(String TipoEnvase, String Color, String TipoEtiqueta, int Precio, String Sabor, int Presentacion) {
        super(TipoEnvase, Color, TipoEtiqueta, Precio);
        this.Sabor=Sabor;
        this.Presentacion=Presentacion;
    }
    public void setDatosManzana(String Sabor, int Presentacion) {
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
        Manzana obj1 = new Manzana();
        obj1.setDatosGaseosa("Plastico", "Rosado", "Plastica envolvente", 1000);
        obj1.setDatosManzana("Manzana", 250);
        System.out.println("Sabor: "+obj1.getSabor()+"\n"
                + "Color: "+obj1.getColor()+"\n"
                + "Tipo de Envase: "+obj1.getTipoEnvase()+"\n"
                + "Presentacion: "+obj1.getPresentacion()+" ml"+"\n"
                + "Tipo de Etiqueta: "+obj1.getTipoEtiqueta()+"\n"
                + "Precio: "+obj1.getPrecio()+" pesos"+"\n");
    }
    
}
