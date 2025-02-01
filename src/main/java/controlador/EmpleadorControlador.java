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
import modelo.EmpleadorModelo;



/**
 *
 * @author Usuario
 */
public class EmpleadorControlador {

    //INSTANCIO UN OBJETO DEL MODELO A INSERTAR
    private EmpleadorModelo p;
    //INSTANCIAR LA CONEXIÓN A LA BASE DE DATOS
    ConexionBDD conectar = new ConexionBDD();
    //CLASE QUE ME PERMITA CONECTARME DIRECTAMENTE A MYSQL
    Connection conectado = (Connection) conectar.conectar();
    //CLASE QUE ME PERMITE EJECUTAR MI SENTENCIA SQL
    PreparedStatement ejecutar;
    //OBTENER RESULTADOS DE LA CONSULTA
    ResultSet resultado;

    //MÉTODOS DE TRANSACCIONABILIDAD
    public void insertarEmpleador(EmpleadorModelo p) {
        //1.- UTILIZAR EXCEPCIÓN
        try {//LANZAR TESTEAR UN CONJUNTO DE CÓDIGO 
            String sentenciaSQL = "call sp_insertar_empleador('"+p.getNombres()+"','"+p.getApellidos()+"','"+p.getCedula()+"','"+p.getDireccion()+"','"+p.getCorreoElectronico()+"','"+p.getFechaNacimiento()+"','"+p.getEmpresa()+"','"+p.getCargo()+"');";
            ejecutar = conectado.prepareCall(sentenciaSQL);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null,"Empleador Creado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null,"El Empleador no ha sido creado,"
                        + " revise que los datos ingresados sean correctos");
            }

        } catch (SQLException e) {
            //CAPTURAR PARA DARLE UN TRATAMIENTO 
            JOptionPane.showMessageDialog(null,"Comuniquese con el Administrador para solicitar ayuda");
                
        }

    }
    public ArrayList<Object[]> buscarEmpleador(String cedula) { 
            ArrayList<Object[]> listaObject=new ArrayList<>(); // instncia un objeto de tipo arrayList ingresa la cédula como parámetro
        try {
            // declara de tipo String una variable donde llama al sp con la cédula como parámetro
            String sql = "call sp_buscarEmpleador('%"+cedula+"%');"; 
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            resultado = ejecutar.executeQuery(); // QUERY -->recibo un conjunto de datos
            int cont = 1;
            while (resultado.next()) {
                Object[] obempleador = new Object[9]; //instancia un arreglo tipo objeto de 6
                for (int i = 0; i < 8; i++) {
                    obempleador[i+1] = resultado.getObject(i+1);//obtener los valores de cada columna
                }
                obempleador[0]=cont;
                listaObject.add(obempleador);
                cont++;
            }
            ejecutar.close();//cierra la conexion
            return listaObject;//retorna el registro del miembro del equipo
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNÍQUESE CON EL ADMINISTRADOR");
        }
        return null;
    }
    
     public ArrayList<Object[]> datosEmpleador() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_listarEmpleadores();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[]  obmiembro = new Object[9];
                for (int i = 1; i <9; i++) {
                    obmiembro[i] = resultado.getObject(i);
                }
                obmiembro[0]=cont;
                listaObject.add( obmiembro);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNÍQUESE CON EL ADMINISTRADOR");

        }

        return null;
    }

     
     public void actualizarEmpleador(EmpleadorModelo p) {
        try {
            String sentenciaSQL = "call sp_actualizarEmpleador1('"+p.getCedula()+"','"+p.getNombres()+"','"+p.getApellidos()+"','"+p.getDireccion()+"','"+p.getCorreoElectronico()+"','"+p.getFechaNacimiento()+"','"+p.getEmpresa()+"','"+p.getCargo()+"');";
            //String sentenciaSQL = "sp_actualizarMiembroE ('"+mem.getNombre()+"','"+mem.getApellido()+"','"+mem.getCedula()+"','"+mem.getFechaNac()+"','"+mem.getRol()+"','"+mem.getCorreo()+"','"+mem.getFechaIngesoPro()+"','"+mem.getEstado()+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sentenciaSQL);
            int resultado1 = ejecutar.executeUpdate();
            if (resultado1 > 0) {
                JOptionPane.showMessageDialog(null, "Empleador Actualizado con Éxito");
            
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
              
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Comuníquese con el administrador");
        }
    }
}
