package com.renta.peliculas;

import org.junit.Test;

public class testingTest {
   @Test
    public void testMontoTotal(){
       Cliente cliente= new Cliente("Mario");
       cliente.persist();
       Alquiler alquiler1= new Alquiler(new Disco("4520",new Pelicula("peli",1)),1);
       Alquiler alquiler2= new Alquiler(new Disco("4524",new Pelicula("peli2",2)),5);
       Alquiler alquiler3= new Alquiler(new Disco("4522",new Pelicula("peli3",3)),3);
       cliente.addRental(alquiler1);
       cliente.addRental(alquiler2);
       cliente.addRental(alquiler3);
   }
    @Test
    public void testPuntosAlquiler(){
        Cliente cliente= new Cliente("Mario");
        cliente.persist();
        Alquiler alquiler= new Alquiler(new Disco("4520",new Pelicula("peli",1)),3);
        cliente.addRental(alquiler);
    }

}
