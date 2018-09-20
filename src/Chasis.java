/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
public class Chasis {
    private String marca;
    private String color;
    private float diametro;

    public Chasis(String marca, String color, float diametro){
        this.marca = marca;
	this.color = color;
	this.diametro = diametro;
    }

    public String getMarca(){
	return this.marca;
    }

    public String getColor(){
	return this.color;
    }

    public float getDiametro(){
	return this.diametro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    
}