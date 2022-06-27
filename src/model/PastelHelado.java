/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Victor Nivelo
 */
public class PastelHelado {
    private String Pastel;
    private Float PrecioPastel;

    PastelHelado(String pastel_helado_de_gelatina, String pastel_helado_de_3_capas, String pastel_helado_de_durazno, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPastel() {
        return Pastel;
    }

    public void setPastel(String Pastel) {
        this.Pastel = Pastel;
    }

    public Float getPrecioPastel() {
        return PrecioPastel;
    }

    public void setPrecioPastel(Float PrecioPastel) {
        this.PrecioPastel = PrecioPastel;
    }

    @Override
    public String toString() {
        return "Pastel" + Pastel + ", PrecioPastel" + PrecioPastel;
    }
    
    
}
