/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class ClienteModelo {
    private int idCliente;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public ClienteModelo() {
    }

    public ClienteModelo(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono, String correoElectronico) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
 
        return "DATOS PERSONALES\n"+
                "Cédula: "+getCedula()+"\n"+
                "Nombres: "+getNombre()+"\n"+
                "Apellidos: "+getApellido()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Teléfono: "+getTelefono()+"\n"+
                "Correo Electrónico: "+getCorreoElectronico();
                
       
    }
 
    
}
