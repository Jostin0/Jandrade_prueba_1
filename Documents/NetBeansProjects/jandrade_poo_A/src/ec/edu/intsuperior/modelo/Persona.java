/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

public class Persona {
    String cedula;
String nombre;                            

String apellido;
        String direccion;
        public enum TipoGenero{ 
            MASCULINO, FEMENINO
        }
        TipoGenero genero;
        
 enum TipoSangre {ARH, B, O}
 TipoSangre tiposangre;
 
 
public Persona(){
    }

    public Persona(String cedula, String nombre, String apellido, String direccion, TipoGenero genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Los datos de la persona solicitada son: \n"
                 + "Cedula: "+getCedula()+"\n"
                  + "Nombre: " +getNombre()+ " " +" "+getApellido()+"\n"
                   + "Genero: "+ getGenero();
    }
}

