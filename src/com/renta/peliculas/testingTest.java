package com.renta.peliculas;

import org.junit.Test;
import static org.junit.Assert.*;

public class testingTest {
   @Test
    public void testMontoTotal(){
       Cliente cliente= new Cliente("Mario");
       cliente.persist();
       Alquiler alquiler1= new Alquiler(new Disco("4520",new Pelicula("peli",TipoPelicula.NORMAL)),1);
       Alquiler alquiler2= new Alquiler(new Disco("4524",new Pelicula("peli2",TipoPelicula.INFANTIL)),5);
       Alquiler alquiler3= new Alquiler(new Disco("4522",new Pelicula("peli3",TipoPelicula.ESTRENO)),3);
       cliente.addRental(alquiler1);
       cliente.addRental(alquiler2);
       cliente.addRental(alquiler3);

       assertEquals(15.5,cliente.getMontoTotal(),0);
   }
    @Test
    public void testPuntosAlquiler(){
        Cliente cliente= new Cliente("Mario");
        cliente.persist();
        Alquiler alquiler= new Alquiler(new Disco("4520",new Pelicula("peli",TipoPelicula.ESTRENO)),3);
        cliente.addRental(alquiler);
        assertEquals(2.00,cliente.getcantPuntosAlquilerFrecuentes(),0);
    }

}
