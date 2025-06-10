package com.ipartek.modelo;

public class Habitacion 
{
    private int idHabitacion;
    private int numeroHabitacion;
    private double metros;
    private double precio;
    private int numeroCamas;
    private boolean exterior;


    public Habitacion() 
    {
    	 this.idHabitacion = 0;
         this.numeroHabitacion = 0;
         this.metros = 0;
         this.precio = 0;
         this.numeroCamas = 0;
         this.exterior = false;
    }


    public Habitacion(int idHabitacion, int numeroHabitacion, double metros, double precio, int numeroCamas, boolean exterior) {
        this.idHabitacion = idHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.metros = metros;
        this.precio = precio;
        this.numeroCamas = numeroCamas;
        this.exterior = exterior;
    }


    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public boolean isExterior() {
        return exterior;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }

	@Override
	public String toString() 
	{
		return "Habitacion [idHabitacion=" + idHabitacion + ", numeroHabitacion=" + numeroHabitacion + ", metros="
				+ metros + ", precio=" + precio + ", numeroCamas=" + numeroCamas + ", exterior=" + exterior + "]";
	}
    
    
    
    
}

