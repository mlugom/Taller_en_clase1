/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

/**
 *
 * @author Equipo de Trabajo
 */
public class Main2 {
    public static void main(String[] args) {
        Tipo tipo1 = new Tipo("deposito");
        Tipo tipo2 = new Tipo("retiro");
        Banco ban1 = new Banco("Banco calidad");
        Fecha fecha1 = new Fecha(5,"agosto",2018);
        Fecha fecha2 = new Fecha(6,"agosto",2018);
        Fecha fecha3 = new Fecha(19,"septiembre",2018);
        Cuenta cuenta1 = new Cuenta(34567,10000,fecha1,"Hector");
        Cuenta cuenta2 = new Cuenta(12568,20000,fecha2,"Ulises");
        
        ban1.addTipo(tipo1);
        ban1.addTipo(tipo2);
        
        Movimiento mov1 = new Movimiento(fecha3,cuenta1.getSaldoCorriente(),500,tipo1);
        Movimiento mov2 = new Movimiento(fecha3,cuenta1.getSaldoCorriente(),600,tipo2);
        Movimiento mov3 = new Movimiento(fecha3,cuenta2.getSaldoCorriente(),500,tipo1);
        Movimiento mov4 = new Movimiento(fecha3,cuenta2.getSaldoCorriente(),600,tipo2);
        
        cuenta1.addMovimiento(mov1);
        cuenta1.addMovimiento(mov2);
        cuenta2.addMovimiento(mov3);
        cuenta2.addMovimiento(mov4);
        
        ban1.addCuenta(cuenta1);
        ban1.addCuenta(cuenta2);
        
        ban1.listarCuentas();
    }
}
