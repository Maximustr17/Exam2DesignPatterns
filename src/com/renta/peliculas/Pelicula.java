package com.renta.peliculas;

import com.renta.peliculas.EstrategiaPelicula.FabricaTipoPeliculas;
import com.renta.peliculas.EstrategiaPelicula.ITipoPelicula;

public class Pelicula {
	private String nombre;
	private ITipoPelicula tipoPelicula;
	private TipoPelicula tipo;

	public Pelicula(String pNombre, TipoPelicula tipo) {
		setNombre(pNombre);
		this.tipo=tipo;
		tipoPelicula = FabricaTipoPeliculas.fabricaTipoPelicula(this.tipo);
	}

	public void setTipoPelicula(ITipoPelicula tipoPelicula) {
		this.tipoPelicula = tipoPelicula;
	}

	public TipoPelicula getTipo() {
		return tipo;
	}

	public void setTipo(TipoPelicula tipo) {
		this.tipo = tipo;
	}

	public ITipoPelicula getTipoPelicula() {
		return tipoPelicula;
	}

	public void persist() {
		Registrar.add ("Movies", this);
	}

	public static Pelicula get(String name) {
		return (Pelicula) Registrar.get ("Peliculas", name);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
