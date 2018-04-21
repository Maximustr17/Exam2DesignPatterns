package com.renta.peliculas.EstrategiaPelicula;

public class TipoNormal implements ITipoPelicula {
    @Override
    public double getMontoAlquiler(int dias) {
        double montoAlquiler = 2;
        if (dias > 2){
            montoAlquiler += (dias - 2) * 1.5;
        }
        return montoAlquiler;
    }
}
