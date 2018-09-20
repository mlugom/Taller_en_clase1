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
public class Movimiento {
    private Fecha fecha;
    private double saldoAnterior;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(Fecha fecha, double saldoAnterior, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
}
