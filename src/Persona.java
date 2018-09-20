/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
import java.util.ArrayList;
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
            System.out.println("Carro #" + i+1 +":");
	    System.out.println("Marca :" + this.carros.get(i).getMarca() );
            System.out.println("Ruedas :" + this.carros.get(i).getRuedas());
            System.out.println("Chasis :" + this.carros.get(i).getChasis());
            System.out.println("motor :" + this.carros.get(i).getMotor());
            
        
        }
        
    }
}