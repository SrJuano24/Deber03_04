/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_04.Vista;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {

        var ventanaPersonaje = new Ventana_Personaje();
        ventanaPersonaje.setVisible(true);
        ventanaPersonaje.setLocation(10, 20);
        var ventanaActor = new Ventana_Actor();
        ventanaActor.setVisible(true);
        ventanaActor.setLocation(10, 20);
        var ventanaPelicula = new Ventana_Pelicula();
        ventanaPelicula.setVisible(true);
        ventanaPelicula.setLocation(10, 20);
        

    }

}
