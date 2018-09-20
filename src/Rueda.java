/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Estudiante
 */
  public class Rueda {
    private String marca;
    private String color;
    
    public Rueda(String marca, String color){
        this.marca = marca;
        this.color = color;
    }

    public String getMarca(){
	return this.marca;
    }

    public String getColor(){
	return this.color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}