/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;

/**
 *
 * @author Victor Nivelo
 */
public class Helados {
    private String Helado;
    private Float Precio;
    
    private List<Helados> descripcionList;
    
    public Helados(String Helado, Float Precio){
        this.Helado=Helado;
        this.Precio=Precio;
    }

    public String getHelado() {
        return Helado;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setHelado(String Helado) {
        this.Helado = Helado;
    }

    public void setPrecio(Float Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Helado de " + Helado +" Precio es "+ Precio;
    }
    
}
