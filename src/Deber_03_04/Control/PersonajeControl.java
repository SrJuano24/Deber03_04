/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_04.Control;


import Deber_03_04.Modelo.Personaje;
import Deber_03_04.Servicio.ActorServiceImpl;
import Deber_03_04.Servicio.PeliculaServiceImpl;
import Deber_03_04.Servicio.PersonajeServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonajeControl {

    private PeliculaServiceImpl peliculaServiceImpl = new PeliculaServiceImpl();
    private ActorServiceImpl actorServiceImpl = new ActorServiceImpl();
    private PersonajeServiceImpl personajeServiceImpl= new PersonajeServiceImpl();

    public String crear(String[] data) {
        var retorno = "No se pudo crear la pelicula:";

        var codigoPersonaje=Integer.valueOf(data[0]).intValue();;
        var nombrePersonaje = data[1];
        var film = this.peliculaServiceImpl.buscarPorNombre(data[2]);
        var interprete = this.actorServiceImpl.buscarPorNombre(data[3]);
        var edadPersonaje = Integer.valueOf(data[4]).intValue();
        var rol = data[5];
        var calificacion = data[6];
        var descripcionPersonaje = data[7];

        if (edadPersonaje < 0) {
            retorno += " Edad del personaje incorrecto.";

        } else {
            if (edadPersonaje < 0) {
                retorno += " Calificacion del perosonaje incorrecto.";

            } else {
                var personaje = new Personaje(codigoPersonaje,nombrePersonaje, film, interprete, edadPersonaje, rol, calificacion, descripcionPersonaje);
                this.personajeServiceImpl.crear(personaje);

                retorno = "Personaje: " + personaje.getNombrePersonaje() + " Creado correctamente: ";
                
            }
        }
        return retorno;

    }

    public List<Personaje> Listar() {
        return this.personajeServiceImpl.listar();

    }
    
    public String modificar(String[] data) {
        var retorno = "No se pudo crear la pelicula:";

        var codigoPersonaje=Integer.valueOf(data[0]).intValue();;
        var nombrePersonaje = data[1];
        var film = this.peliculaServiceImpl.buscarPorNombre(data[2]);
        var interprete = this.actorServiceImpl.buscarPorNombre(data[3]);
        var edadPersonaje = Integer.valueOf(data[4]).intValue();
        var rol = data[5];
        var calificacion = data[6];
        var descripcionPersonaje = data[7];
         var personajeModificado = Integer.valueOf(data[8]).intValue();;

        if (edadPersonaje < 0) {
            retorno += " Edad del personaje incorrecto.";

        } else {
            if (edadPersonaje < 0) {
                retorno += " Calificacion del perosonaje incorrecto.";

            } else {
                var personaje = new Personaje(codigoPersonaje,nombrePersonaje, film, interprete, edadPersonaje, rol, calificacion, descripcionPersonaje);
                this.personajeServiceImpl.modificar(personaje, personajeModificado);

                retorno = "Personaje: " + personaje.getNombrePersonaje() + " Modificado correctamente: ";
                
            }
        }
        return retorno;

    }
     public void eliminar(String codigos){
        var codigo=Integer.valueOf(codigos).intValue();
        this.personajeServiceImpl.eliminar(codigo);
    
    
    }
}
