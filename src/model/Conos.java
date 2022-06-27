/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 * @author Victor Nivelo
 */
public class Conos {
    private String Conos;
    private Float PrecioConos;
    
    private List<Conos> descripcionList;

    Conos(String cono_de_chocolate, String cono_de_vainilla, String cono_de_fresa, String cono_de_cereza, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setConos(String Conos) {
        this.Conos = Conos;
    }

    public void setPrecioConos(Float PrecioConos) {
        this.PrecioConos = PrecioConos;
    }

    public String getConos() {
        return Conos;
    }

    public Float getPrecioConos() {
        return PrecioConos;
    }

    @Override
    public String toString() {
        return "Conos" + Conos + " PrecioConos" + PrecioConos;
    }
    
    
}
