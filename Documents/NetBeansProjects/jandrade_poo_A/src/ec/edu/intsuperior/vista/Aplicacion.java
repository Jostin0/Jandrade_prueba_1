/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;


public class Aplicacion {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
    Persona p1= new Persona();
    Persona p2= new Persona();
    Persona p3= new Persona();
    
     System.out.print("Ingrese la cedula de la persona 1: ");
       p1.setCedula(leer.next());

        System.out.print("Ingrese el Nombre: ");
          p1.setNombre(leer.next());

          System.out.print("Ingrese el Apellido: ");
            p1.setApellido(leer.next());
            
            p1.setGenero(Persona.TipoGenero.FEMENINO);
        
              System.out.println(p1.toString());  
              
                 //System.out.print("Los datos de la persona solicitada es: \n"
                 //+ "Cedula: "+p1.getCedula()+"\n"
                 // + "Nombre: " +p1.getNombre()+ " " +" "+p1.getApellido()+"\n"
                   //+ "Genero: "+p1.getGenero()+"\n");
       
     System.out.print("Ingrese la cedula de la persona 2: ");
       p2.setCedula(leer.next());

        System.out.print("Ingrese el Nombre: ");
          p2.setNombre(leer.next());
           
          System.out.print("Ingrese el Apellido: ");
            p2.setApellido(leer.next());
          
              p2.setGenero(Persona.TipoGenero.MASCULINO);
                
                System.out.println(p2.toString());
 
                   //System.out.print("Los datos de la persona solicitada es: \n"
                   //+ "Cedula: "+p2.getCedula()+"\n"
                   // + "Nombre: " +p2.getNombre()+ " " +p2.getApellido()+ "\n"
                   // + "Genero: "+p2.getGenero()+"\n");
               

    }
   
}
