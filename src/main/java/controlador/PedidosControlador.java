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
 * @author Dell Core i7
 */
public class PedidosControlador {
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

    public ArrayList<Object[]> buscarPedidos(String cedula) { 
            ArrayList<Object[]> listaObject=new ArrayList<>(); // instncia un objeto de tipo arrayList ingresa la cédula como parámetro
        try {
            // declara de tipo String una variable donde llama al sp con la cédula como parámetro
            String sql = "call sp_ObtenerPedidos('"+cedula+"');"; 
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //TODA INSERCIÓN DEVUELVE UN ESTADO >0 CUANDO FUE FAVORABLE Y MENOR A O CUANDO NO SE REALIZÓ 
            resultado = ejecutar.executeQuery(); // QUERY -->recibo un conjunto de datos
            int cont = 1;
            while (resultado.next()) {
                Object[] obpedidos = new Object[9]; //instancia un arreglo tipo objeto de 6
                for (int i = 1; i < 9; i++) {
                    obpedidos[i] = resultado.getObject(i+1);//obtener los valores de cada columna
                }
                obpedidos[0]=cont;
                listaObject.add(obpedidos);
                cont++;
            }
            ejecutar.close();//cierra la conexion
            return listaObject;//retorna el registro del miembro del equipo
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CLIENTE NO ENCONTRADO COMUNÍQUESE CON EL ADMINISTRADOR");
        }
        return null;
    }
    
}
