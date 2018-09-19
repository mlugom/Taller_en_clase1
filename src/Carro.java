/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de Trabajo
 */
public class Carro {
     private String marca;
    private Rueda[] ruedas;
    private Chasis chasis;
    private Motor motor;

    public Carro(String marca){
	this.marca = marca;
	if(this.marca.equals("a")){
	    this.chasis = new Chasis("marca1", "black", 50);
	    this.motor = new Motor(1400, 70);
	    this.ruedas = new Rueda[4];

	    for(int i = 0; i < ruedas.length; i++){
		this.ruedas[i] = new Rueda("Bridgestone", "black");
	    }	
	}else if(this.marca.equals("b")){
	    this.chasis = new Chasis("marca2", "gray", 40);
	    this.motor = new Motor(850, 55);
	    this.ruedas = new Rueda[4];

	    for(int i = 0; i < ruedas.length; i++){
		this.ruedas[i] = new Rueda("Michelin", "black");
	    }	    
	}else{
	    this.chasis = new Chasis("marca3", "brown", 80);
	    this.motor = new Motor(2100, 95);
	    this.ruedas = new Rueda[4];

	    for(int i = 0; i < ruedas.length; i++){
		this.ruedas[i] = new Rueda("Timsun", "black");
	    }
	}
    }

    public String getMarca(){
	return this.marca;
    }

    public String getRuedas(){
	return this.ruedas[0].getMarca();
    }

    public String getChasis(){
	return this.chasis.getMarca();
    }

    public float getMotor(){
	return this.motor.getCilindraje();
    }
}
