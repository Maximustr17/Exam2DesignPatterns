package com.renta.peliculas.EstrategiaPelicula;

public class TipoInfantil implements ITipoPelicula{

    @Override
    public double getMontoAlquiler(int dias) {
        double montoAlquiler = 1.5;
        if (dias > 3){
            montoAlquiler += (dias - 3) * 1.5;
        }
        return montoAlquiler;
    }
}
