/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Dell Core i7
 */
public class Main {
    public static void main(String[] args) {
        //probar que este conectada a la base de datos
        ConexionBDD bdd = new ConexionBDD();
        bdd.conectar();
    }
}
