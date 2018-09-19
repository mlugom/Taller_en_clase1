
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de Trabajo
 */
public class Persona {
     private String nombre;
     private ArrayList<Carro> carros;

    public Persona(String nombre){
	this.nombre = nombre;
	this.carros = new ArrayList<Carro>();
    }

    public void addCarro(Carro carro){
	carros.add(carro);
    }

    public void listarCarros(){
	for(int i = 0; i < this.carros.size(); i++){
	    System.out.println(this.carros.get(i).getMarca() + this.carros.get(i).getRuedas() + this.carros.get(i).getChasis() + this.carros.get(i).getMotor());
	}
    }
}
