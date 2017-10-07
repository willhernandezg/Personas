package me.willhernandezg.personas;

/**
 * Created by android on 30/09/2017.
 */

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private int sexo;

    public Persona(String cedula, String nombre, String apellido, int sexo){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void guardar(){
        Datos.guardarPersona(this);
    }
}