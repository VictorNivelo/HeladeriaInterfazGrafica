/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Victor Nivelo
 */
public class GalletaHelada {
    private String Galletas;
    private Float PrecioGalletas;  

    GalletaHelada(String galletas_de_menta, String galleta_de_chocolate, String galleta_de_fresa, String galleta_de_vainilla, String galleta_de_limon, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getGalletas() {
        return Galletas;
    }

    public void setGalletas(String Galletas) {
        this.Galletas = Galletas;
    }

    public Float getPrecioGalletas() {
        return PrecioGalletas;
    }

    public void setPrecioGalletas(Float PrecioGalletas) {
        this.PrecioGalletas = PrecioGalletas;
    }

    @Override
    public String toString() {
        return "Galletas" + Galletas + " PrecioGalletas" + PrecioGalletas;
    }
    
    
}
