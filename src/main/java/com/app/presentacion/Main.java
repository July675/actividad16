package com.app.presentacion;

import java.util.List;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;

public class Main {
	public static void main(String[] args) {
		// INSTANCIAR DOS ARTISTAS
		Artista artista1 = new Artista("Marce", "Rock", "argentino", 17);
		Artista artista2 = new Artista("July", "Nada", "argentina", 17);

		// INSTANCIAR DOS CANCIONES
		Cancion cancion1 = new Cancion("Nana", 20, 2025);
		Cancion cancion2 = new Cancion("Ok mañana", 22, 2022);
		ControladoraLogica conLog = new ControladoraLogica();
		try {
			// CREAR AL MENOS DOS ARTISTAS, Y DOS CANCIONES
			conLog.crearArtista(artista1);
			conLog.crearArtista(artista2);

			conLog.crearCancion(cancion1);
			conLog.crearCancion(cancion2);

			System.out.println("Guardado");

		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

		// ----- LECTURA DE ARTISTAS -----

		System.out.println("=== TODOS LOS ARTISTAS ===");
		List<Artista> artistas = conLog.listarArtistas();
		for (Artista a : artistas) {
			System.out.println(a);
		}
		System.out.println("=== BUSCAR ARTISTA CON ID 1 ===");
		Artista encontrado = conLog.buscarUnArtista(1);
		if (encontrado != null) {
			System.out.println(encontrado);
		} else {
			System.out.println("No existe un artista con ese id");
		}
		System.out.println("=== BUSCAR ARTISTA CON ID 999 ===");
		Artista noExiste = conLog.buscarUnArtista(999);
		if (noExiste != null) {
			System.out.println(noExiste);
		} else {
			System.out.println("No existe un artista con ese id");
		}

		// ----- LECTURA DE CANCIONES -----

		System.out.println("=== TODAS LAS CANCIONES ===");

		List<Cancion> canciones = conLog.listarCanciones();

		for (Cancion c : canciones) {
			System.out.println(c);
		}

		System.out.println("=== BUSCAR CANCION CON ID 1 ===");

		Cancion cancionEncontrada = conLog.buscarUnaCancion(1);

		if (cancionEncontrada != null) {
			System.out.println(cancionEncontrada);
		} else {
			System.out.println("No existe una canción con ese id");
		}

		System.out.println("=== BUSCAR CANCION CON ID 999 ===");

		Cancion cancionNoExiste = conLog.buscarUnaCancion(999);

		if (cancionNoExiste != null) {
			System.out.println(cancionNoExiste);
		} else {
			System.out.println("No existe una canción con ese id");
		}

	}
}
