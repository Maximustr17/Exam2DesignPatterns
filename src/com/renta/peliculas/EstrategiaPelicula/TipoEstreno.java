package com.renta.peliculas.EstrategiaPelicula;

public class TipoEstreno implements ITipoPelicula {
    @Override
    public double getMontoAlquiler(int dias) {
        return dias*3;
    }
}
