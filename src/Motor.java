/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Equipo de Trabajo
 */
public class Motor {
     private float cilindraje;
    private float potencia;

    public Motor(float cilindraje, float potencia){
        this.cilindraje = cilindraje;
        this.potencia = potencia;
    }

    public float getCilindraje(){
	return this.cilindraje;
    }

    public float getPotencia(){
	return this.potencia;
    }
}
