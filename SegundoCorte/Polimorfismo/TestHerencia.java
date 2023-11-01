package test;


import herencia.*;
import java.util.Date;

public class TestHerencia {

    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Axel Roel", 'm', 25, "Santo tomas");
        
        //System.out.println(persona1);
         //System.out.println(persona.obtenerDetalle());
        imprimir(persona1);
        //Crear empleados 
        Empleado empleado1 = new Empleado(3000,"Gutierrez");
        //System.out.println(empleado1.obtenerDetalle());
        imprimir(empleado1);
        
        var fecha = new Date();
        Cliente client = new Cliente(fecha,true,"Juan",'M',25,"Santo Tomás");
        //System.out.println(cliente.obtenerDetalle());                
        imprimir(client);
    }   
    public static void imprimir(Persona personaje) {
    System.out.println(personaje.obtenerDetalle());
    }
}