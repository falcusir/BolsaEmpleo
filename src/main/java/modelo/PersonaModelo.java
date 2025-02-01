/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class PersonaModelo {
    private int idPersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String correoElectronico;
    private String fechaNacimiento;

    public PersonaModelo() {
    }

    public PersonaModelo(int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String fechaNacimiento) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "DATOS PERSONALES\n"+
                "Nombres: "+getNombres()+"\n"+
                "Apellidos: "+getApellidos()+"\n"+
                "Cédula: "+getCedula()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Correo Electrónico: "+getCorreoElectronico()+"\n"+
                "Fecha de Nacimiento: "+getFechaNacimiento();
    }         
     
    
    
    
    
    
}

