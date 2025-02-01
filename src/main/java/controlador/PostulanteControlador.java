/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.PostulanteModelo;

/**
 *
 * @author Dell Core i7
 */
public class PostulanteControlador {
    //INSTANCIAR UN OBJETO DEL MODELO A INSERTAR
    private PostulanteModelo p;
    //INSTANCIAR LA CONEXION A LA BASE DE DATOS
    //Tiene todos los drivers de conexión
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITE CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection)conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL a traves de cadenas
    PreparedStatement ejecutar;
    //obtener resultados de la consulta/estructura de datos--colecciones--fila o conjunto de resultados
    ResultSet res;
    
    //METODO DE TRANSACCIONABILIDAD
    public void insertarPostulante(PostulanteModelo p){
        //1. UTILIZAR UNA EXCEPCIÓN SIEMPRE 
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO
            String sentenciaSQL="call sp_insertar_postulante('"+p.getNombres()+"', '"+p.getApellidos()+"', '"+p.getCedula()+"', '"+p.getDireccion()+"', '"+p.getCorreoElectronico()+"', '"+p.getFechaNacimiento()+"', '"+p.getEspecialidad()+"', '"+p.getExperinecia()+"', '"+p.getEstado()+"');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int resu = ejecutar.executeUpdate();//poner play a la sentencia sql
            if (resu > 0) {//>o transacción exitosa
                JOptionPane.showMessageDialog(null,"Postulante Creado con éxito");//llamar ventanas emergentes--sacar mensaje de diálogo
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null,"El Postulante no ha sido creado,"
                        + " revise que los datos ingresados sean correctos");
            }    
        } catch (SQLException e) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO
            JOptionPane.showMessageDialog(null,"Comuníquese con el Administrador para solicitar ayuda");
        }
    }
    
        public ArrayList<Object[]> buscarPostulante(String cedula) { 
            ArrayList<Object[]> listaObject=new ArrayList<>(); // instncia un objeto de tipo arrayList ingresa la cédula como parámetro
        try {
            // declara de tipo String una variable donde llama al sp con la cédula como parámetro
            String sql = "call sp_BuscarPostulante('%"+cedula+"%');"; 
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpostulante = new Object[6]; //instancia un arreglo tipo objeto de 6
                for (int i = 0; i < 6; i++) {
                    obpostulante[i] = res.getObject(i+1);//obtener los valores de cada columna
                }
                obpostulante[0]=cont;
                listaObject.add(obpostulante);
                cont++;
            }
            ejecutar.close();//cierra la conexion
            return listaObject;//retorna el registro del postulante
           
        } catch (SQLException e) {
            System.out.println("ERROR SQL"+e);
        }
        return null;
    }
        
    public ArrayList<Object[]> datosPostulante() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call sp_listarPostulantes();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[]  obpostulante = new Object[6];
                for (int i = 1; i < 6; i++) {
                    obpostulante[i] = res.getObject(i+1);
                }
                 obpostulante[0]=cont;
                listaObject.add( obpostulante);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA POSTULANTE");

        }

        return null;
    }
    
        public void actualizarPostulante(PostulanteModelo p) {
        try {
            String sentenciaSQL = "call sp_InsertarPostulante('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getDireccion() + "','" + p.getCorreoElectronico() + "','" + p.getFechaNacimiento() + "','" + p.getEspecialidad() + "','" + p.getExperinecia()+ "','" + p.getEstado() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sentenciaSQL);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Postulante Actualizado con Éxito");
            
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
              
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    public void eliminarPostulante(String cedula) {
        try {
            String sql = "call sp_EliminarPostulante(" + cedula + ");";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Postulante Eliminado con éxito");
 
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
      
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL"+e);
        }
    }
    
}
