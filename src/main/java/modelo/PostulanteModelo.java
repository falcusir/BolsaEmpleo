/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class PostulanteModelo extends PersonaModelo{
    private int idPostulante;
    private String especialidad;
    private int experinecia;
    private boolean estado;
    private PersonaModelo idPersonas;
    //private int idPersona -- las 2 formas son válidas para la fk

    public PostulanteModelo() {
    }
    public PostulanteModelo(int idPostulante, String especialidad, int experinecia, boolean estado, PersonaModelo idPersonas) {
        this.idPostulante = idPostulante;
        this.especialidad = especialidad;
        this.experinecia = experinecia;
        this.estado = estado;
        this.idPersonas = idPersonas;
    }
    public PostulanteModelo(int idPostulante, String especialidad, int experinecia, boolean estado,int idPersona, String nombres, String apellidos, String cedula, String direccion, String correoElectronico, String fechaNacimiento) {
        super(idPersona, nombres, apellidos, cedula, direccion, correoElectronico, fechaNacimiento);
        this.idPostulante = idPostulante;
        this.especialidad = especialidad;
        this.experinecia = experinecia;
        this.estado = estado;
    }

    public int getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(int idPostulante) {
        this.idPostulante = idPostulante;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperinecia() {
        return experinecia;
    }

    public void setExperinecia(int experinecia) {
        this.experinecia = experinecia;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public PersonaModelo getIdPersonas() {
        return idPersonas;
    }

    public void setIdPersonas(PersonaModelo idPersonas) {
        this.idPersonas = idPersonas;
    }
    
     @Override
    public String toString() {
        return "DATOS PERSONALES\n"+
                "Nombres: "+getNombres()+"\n"+
                "Apellidos: "+getApellidos()+"\n"+
                "Cédula: "+getCedula()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Correo Electrónico: "+getCorreoElectronico()+"\n"+
                "Fecha de Nacimiento: "+getFechaNacimiento() +"\n"+
                "DATOS DEL POSTULANTE\n"+
                "Especialidad: "+getEspecialidad()+"\n"+
                "Años de Experiencia: "+getExperinecia()+"\n"+
                "Estado del Postulante: "+getFechaNacimiento();
                }
    
}
