/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import gui.PantallaHeladeria;

/**
 * @author Victor Nivelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Helados chocolate = new Helados("Chocolate",0.75f);
        Helados Menta = new Helados("Menta",0.50f);
        Helados Vainilla = new Helados("Vainilla",0.25f);
        Helados Mango = new Helados("Mango",0.75f);
        Helados Fresa = new Helados("Fresa",1.00f);
        Helados Cereza = new Helados("Cereza",1.25f);
        Conos Chocolate = new Conos("Cono de chocolate","Cono de vainilla","Cono de fresa","Cono de cereza",1.25f);
        GalletaHelada galletaHelada = new GalletaHelada("Galletas de menta","Galleta de chocolate","Galleta de fresa","Galleta de vainilla","Galleta de limon",1.75f);
        PastelHelado pastelHelado = new PastelHelado("Pastel helado de gelatina","Pastel helado de 3 capas","Pastel helado de durazno",2.5f);
        
    }
}
