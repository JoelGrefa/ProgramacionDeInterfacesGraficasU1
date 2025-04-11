package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class personaDAO {
	
	private File archivo;
	private persona persona;

	public personaDAO() {
		prepararArchivo();
	}

	public personaDAO(persona persona) {
		this.persona = persona;
		prepararArchivo();
	}

	private void prepararArchivo() {
		File directorio = new File("c:/gestionContactos");
		if (!directorio.exists()) { 
			directorio.mkdir();
		}
		archivo = new File(directorio, "datosContactos.csv");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
				// Escribir encabezado
				escribirLinea("NOMBRE;TELEFONO;EMAIL;CATEGORIA;FAVORITO", false);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void escribirLinea(String texto, boolean append) {
		try (FileWriter fw = new FileWriter(archivo, append);
			 BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write(texto);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean escribirArchivo() {
		if (persona != null) {
			escribirLinea(persona.datosContacto(), true);
			return true;
		}
		return false;
	}

	public List<persona> leerArchivo() throws IOException {
		List<persona> personas = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String linea;
			boolean esEncabezado = true;

			while ((linea = br.readLine()) != null) {
				if (esEncabezado) {
					esEncabezado = false;
					continue;
				}
				String[] datos = linea.split(";");
				if (datos.length >= 5) {
					persona p = new persona();
					p.setNombre(datos[0]);
					p.setTelefono(datos[1]);
					p.setEmail(datos[2]);
					p.setCategoria(datos[3]);
					p.setFavorito(Boolean.parseBoolean(datos[4]));
					personas.add(p);
				}
			}
		}
		return personas;
	}

	public void actualizarContactos(List<persona> personas) throws IOException {
		if (archivo.exists()) {
			archivo.delete();
		}
		archivo.createNewFile();
		escribirLinea("NOMBRE;TELEFONO;EMAIL;CATEGORIA;FAVORITO", true);
		for (persona p : personas) {
			escribirLinea(p.datosContacto(), true);
		}
	}
}
