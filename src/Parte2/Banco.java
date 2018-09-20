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
public class Banco {
    private String nombre;
    private ArrayList<Tipo> tipos;
    private ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.tipos = new ArrayList<Tipo>();
        this.cuentas = new ArrayList<Cuenta>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public void addTipo(Tipo tipo){
        this.tipos.add(tipo);
    }
    
    public void addCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }
    
    public void listarCuentas(){
        for(int i = 0; i < cuentas.size(); i++){
            System.out.println("Cuenta" + (i+1) + ":");
            System.out.println("Numero: " + cuentas.get(i).getNumCuenta());
            System.out.println("Saldo: " + cuentas.get(i).getSaldoCorriente());
            System.out.println("Fecha de creacion: " + cuentas.get(i).getFechaCreacion().getDia() +
            "/" + cuentas.get(i).getFechaCreacion().getMes() + "/" + 
            cuentas.get(i).getFechaCreacion().getAnio());
            System.out.println("Cliente: " + cuentas.get(i).getCliente());
            System.out.println("Movimientos:");
            for(int j = 0; j < cuentas.get(i).getMovimientos().size(); j++){
                System.out.println("Tipo: " + cuentas.get(i).getMovimientos().get(j).getTipo().getNombre());
                System.out.println("Saldo anterior: " + cuentas.get(i).getMovimientos().get(j).getSaldoAnterior());
                System.out.println("Cantidad: " + cuentas.get(i).getMovimientos().get(j).getCantidad());
            }
            System.out.println(" "); //para que realice un salto de linea.
        }
    }
}
