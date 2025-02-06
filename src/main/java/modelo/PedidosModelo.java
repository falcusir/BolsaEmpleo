/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.PedidosControlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell Core i7
 */
public class PedidosModelo {
    private int idPedido;
    private String fechaPedido;
    private String fechaEntrega;
    private double monto;
    private String estado;
    private ClienteModelo idCliente;

    public PedidosModelo() {
    }

    public PedidosModelo(int idPedido, String fechaPedido, String fechaEntrega, double monto, String estado, ClienteModelo idCliente) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.monto = monto;
        this.estado = estado;
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "DATOS PERSONALES";
    }
    
    
    
    
}
