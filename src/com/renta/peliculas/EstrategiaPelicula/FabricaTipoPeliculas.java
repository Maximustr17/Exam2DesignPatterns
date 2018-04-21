package com.renta.peliculas.EstrategiaPelicula;

import com.renta.peliculas.TipoPelicula;

public class FabricaTipoPeliculas {
    public static ITipoPelicula fabricaTipoPelicula(TipoPelicula tipo){
        switch (tipo){
            case NORMAL: return new TipoNormal();
            case ESTRENO: return new TipoEstreno();
            case INFANTIL:return new TipoInfantil();
        }
        return null;
    }
}
