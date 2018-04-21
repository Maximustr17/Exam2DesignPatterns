package com.renta.peliculas;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
	private String nombre;
	
	public Cliente(String pNombre) {
        nombre = pNombre;
    }
	
    public String statement() {
        String result = "Alquileres de " + nombre + ":\n";
        result +=  "Monto total:  " + String.valueOf(this.getMontoTotal()) + "\n";
        result += "Gano " + String.valueOf(this.getcantPuntosAlquilerFrecuentes()) + " puntos por alquiler frecuente";
        return result;
    }
    double getcantPuntosAlquilerFrecuentes(){
        double puntosAlquilerFrecuente = 0;
        Iterator<Alquiler> iterator= alquileres.iterator();
        while (iterator.hasNext()) {
            Alquiler alquiler = iterator.next();
            puntosAlquilerFrecuente ++;
            if (alquiler.isEstreno() && alquiler.getDiasAlquilado() > 1) puntosAlquilerFrecuente ++;
        }
        return puntosAlquilerFrecuente;
    }
    public double getMontoTotal(){
        double montoTotal = 0;
        Iterator<Alquiler> iterator= alquileres.iterator();
        while (iterator.hasNext()) {
            Alquiler alquiler = iterator.next();
            montoTotal +=  alquiler.getMontoAlquiler();
        }
        return montoTotal;
    }
	public String getNombre() {
		return nombre;
	}
    public void addRental(Alquiler arg) {
    	alquileres.add(arg);
    }
    public static Cliente get(String name) {
    	return (Cliente) Registrar.get("Clientes", name);
    }
    public void persist() {
    	Registrar.add("Clientes", this);
    }
    private ArrayList<Alquiler> alquileres= new ArrayList<>();
}
