/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class EmpleadorModelo extends PersonaModelo{
    private int idEmpleador;
    private String empresa;
    private String cargo;
    private PersonaModelo idPersona;

    public EmpleadorModelo() {
    }

    public EmpleadorModelo(int idEmpleador, String empresa, String cargo, PersonaModelo idPersona) {
        this.idEmpleador = idEmpleador;
        this.empresa = empresa;
        this.cargo = cargo;
        this.idPersona = idPersona;
    }

    public EmpleadorModelo(int idEmpleador, String empresa, String cargo, int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String fechaNacimiento) {
        super(idPersona, nombres, apellidos, cedula, direccion, correoElectronico, fechaNacimiento);
        this.idEmpleador = idEmpleador;
        this.empresa = empresa;
        this.cargo = cargo;
        
    }

    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setIdPersona(PersonaModelo idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "DATOS PERSONALES\n"+"\n"+
                "Nombres: "+getNombres()+"\n"+
                "Apellidos: "+getApellidos()+"\n"+
                "Cédula: "+getCedula()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Correo Electrónico: "+getCorreoElectronico()+"\n"+
                "Fecha de Nacimiento: "+getFechaNacimiento()+"\n"+
                "Empresa a la que pertenece: "+getEmpresa()+"\n"+
                "Cargo: " +getCargo();
    }


}
