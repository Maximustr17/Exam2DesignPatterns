package com.renta.peliculas;

public class Alquiler {
    private Disco disco;
    private int diasAlquilado;
	
	public int getDiasAlquilado() {
    	return diasAlquilado;
    }
    public Disco getDisco() {
    	return disco;
    }
    
    public Alquiler(Disco pDisco, int pDiasAlquilado) {
    	disco = pDisco;
    	diasAlquilado = pDiasAlquilado;
    }
    public double getMontoAlquiler(){
	    return disco.getPelicula().getTipoPelicula().getMontoAlquiler(this.diasAlquilado);
    }
    public boolean isEstreno(){
	    return this.disco.getPelicula().getTipo()== TipoPelicula.ESTRENO;
    }

    

}
