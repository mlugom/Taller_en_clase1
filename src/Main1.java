/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de Trabajo
 */
public class Main1 {
    public static void main(String[] args) {
    Persona persona1 = new Persona("Pipe");

	Carro carro1 = new Carro("a");
	Carro carro2 = new Carro("b");
	Carro carro3 = new Carro("c");
       
	persona1.addCarro(carro1);
	persona1.addCarro(carro2);
	persona1.addCarro(carro3);
        
	persona1.listarCarros();
        }
}
    
