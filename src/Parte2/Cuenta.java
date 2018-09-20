package Parte2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de Trabajo
 */
import java.util.ArrayList;

public class Cuenta {
    private int numCuenta;
    private double saldoCorriente;
    private Fecha fechaCreacion;
    private String cliente;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(int numCuenta, double saldoCorriente, Fecha fechaCreacion, String cliente) {
        this.numCuenta = numCuenta;
        this.saldoCorriente = saldoCorriente;
        this.fechaCreacion = fechaCreacion;
        this.cliente = cliente;
        this.movimientos = new ArrayList<Movimiento>();
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldoCorriente(double saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
    public void addMovimiento(Movimiento movimiento){
        this.movimientos.add(movimiento); //añade el movimiento al ArrayList
        if(movimiento.getTipo().getNombre().equals("deposito")){ //mira si es deposito o retiro
            this.saldoCorriente += movimiento.getCantidad();
        }else{
            this.saldoCorriente -= movimiento.getCantidad();
        }
    }
}
