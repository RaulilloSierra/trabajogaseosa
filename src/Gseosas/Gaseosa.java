/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gseosas;

/**
 *
 * @author RaulSierraYJulianaCastillo
 */
public class Gaseosa {
    //atributos
    private String TipoEnvase;
    private String Color;
    private String TipoEtiqueta;
    private int Precio;
    
    public Gaseosa (){
    
}
    public Gaseosa (String TipoEnvase, String Color, String TipoEtiqueta, int Precio){
        super();
        this.TipoEnvase=TipoEnvase;
        this.Color=Color;
        this.TipoEtiqueta=TipoEtiqueta;
        this.Precio=Precio;
    }
    public void setDatosGaseosa(String TipoEnvase, String Color, String TipoEtiqueta, int Precio){
        this.TipoEnvase=TipoEnvase;
        this.Color=Color;
        this.TipoEtiqueta=TipoEtiqueta;
        this.Precio=Precio;
    }

    public String getTipoEnvase() {
        return TipoEnvase;
    }

    

    public String getColor() {
        return Color;
    }

    public String getTipoEtiqueta() {
        return TipoEtiqueta;
    }
    public int getPrecio() {
        return Precio;
    }

    
    
    
}
