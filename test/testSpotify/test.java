package testSpotify;

import java.util.Scanner;

import Spotify.Cancion;
import Spotify.Playlist;
import Spotify.Usuario;
public class test {

	
	// estaticas
/*	String nombrePlaylist = "to my dream", nombreCancion = "Particles", generoCancion = "Rock", artistaCancion = "Nothing but Thieves", nombreUsuario = "alan"; 
	Double duracionCancion = 3.56;		
	Integer edadUsuario = 20;
	
	Playlist playlist = new Playlist(nombrePlaylist);
	Usuario usuario = new Usuario(nombreUsuario, edadUsuario, playlist);
	Cancion cancion = new Cancion(nombreCancion, generoCancion, duracionCancion, artistaCancion);
	
	@Test 
	public void queSePuedaAgregarCancionesALaPlaylist() {
		
	}
	@Test
	public void queNoSePuedaAgregarUnaCancionDosVecesEnLaMismaPlaylist() {
		
	}
	@Test
	public void queSePuedaEliminar1Cancion() {
		
	}*/


	private static final int GUARDAR_DATOS = 1, CREAR_PLAYLIST = 2, AGREGAR_CANCION = 3, REPRODUCIR_PLAYLIST = 4,
			SALIR = 5;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Playlist playlist = new Playlist("purgatory");
		Cancion cancionNueva = new Cancion("creep", "rock", 3.58, "radiohead");
		Usuario usuario = new Usuario("mora", 19, playlist);
		Integer opcionDeseada = 0;

		do {
			System.out.println(" ");
			System.out.println("-- Bienvenido a Spotify --");
			System.out.println("Seleccione la opcion deseada.");
			System.out.println("1 - Guardar mis datos personales.");
			System.out.println("2 - Crear una playlist nueva.");
			System.out.println("3 - Agregar canciones a la playlist.");
			System.out.println("4 - Reproducir playlist.");

			opcionDeseada = teclado.nextInt();

			switch (opcionDeseada) {
			case GUARDAR_DATOS:
				guardarDatos(teclado, usuario);
				break;
			case CREAR_PLAYLIST:
				crearPlaylist(teclado, playlist);
				break;
			case AGREGAR_CANCION:
				agregarCanciones(cancionNueva, teclado);
				break;
			case REPRODUCIR_PLAYLIST:
				reproducirPlaylist(teclado, playlist, cancionNueva);
				break;
			case SALIR:
				break;
			default:
				System.out.println("error");
				break;

			}
		} while (opcionDeseada != SALIR);
	}

	public static void guardarDatos(Scanner teclado, Usuario usuario) {
		System.out.println("Ingrese su nombre");
		String nombre = teclado.next();

		System.out.println("Ingrese su edad");
		Integer edad = teclado.nextInt();

		System.out.println("Ingrese el nombre de su playlist");
		String nombrePlaylist = teclado.next();
		Playlist playlist1 = new Playlist(nombrePlaylist);
		
		Usuario usuario1 = new Usuario(nombre, edad, playlist1);
		if(usuario1.equals(usuario)) {
			System.out.println("Usuario creado exitosamente");
			System.out.println(usuario.toString() + ", playlist = " + playlist1.getNombre() + "]");
		} else {
			System.out.println("error");
		}
	}

	public static void crearPlaylist(Scanner teclado, Playlist playlist) {
		System.out.println("Ingrese el nombre de su nueva playlist");
		String nombre = teclado.next();
		Playlist playlist1 = new Playlist(nombre);
		if(playlist1.equals(playlist));
		System.out.println("Playlist creada exitosamente");
		System.out.println(playlist);

	}

	public static void agregarCanciones(Cancion cancionNueva, Scanner teclado) {
		String nombre, genero, artista;
		Double duracionSegundos;

		System.out.println("Ingrese el nombre de la cancion");
		nombre = teclado.next();

		System.out.println("Ingrese el genero de la cancion");
		genero = teclado.next();

		System.out.println("Ingrese la duracion de la cancion en segundos");
		duracionSegundos = teclado.nextDouble();

		System.out.println("Ingrese el artista");
		artista = teclado.next();
		
		Cancion cancionAgregada = new Cancion(nombre, genero, duracionSegundos, artista);
		
		if(cancionAgregada.equals(cancionNueva));
		System.out.println("Cancion agregada exitosamente");
		System.out.println(cancionAgregada);
		
	}
	public static void reproducirPlaylist(Scanner teclado, Playlist playlist, Cancion cancionNueva) {
		System.out.println(playlist.toString());
		System.out.println(cancionNueva.toString());
		
	}

}
