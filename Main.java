package main;

import business.entity.Usuario;
import business.entity.Password;
import security.Encriptador;
import service.GestorContrasenias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorContrasenias gestor = new GestorContrasenias();

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu email: ");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nombre, email);
        gestor.registrarUsuario(usuario);

        int opcion;
        do {
            System.out.println("\n==== GESTOR DE CONTRASENAS ====");
            System.out.println("1. Agregar contrasena");
            System.out.println("2. Mostrar contrasenas");
            System.out.println("3. Eliminar contrasena");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Sitio web: ");
                    String sitio = scanner.nextLine();
                    System.out.print("Usuario del sitio: ");
                    String usuarioSitio = scanner.nextLine();
                    System.out.print("Contrasena: ");
                    String contrasena = scanner.nextLine();

                    gestor.agregarContrasenia(usuario, sitio, usuarioSitio, contrasena);
                    System.out.println("Contrasena agregada.");
                    System.out.println("Contrasena encriptada (Base64): " + Encriptador.encriptar(contrasena));
                    break;

                case 2:
                    System.out.println("\nLista de contrasenas:");
                    gestor.mostrarContraseniasUsuario(usuario);
                    break;

                case 3:
                    System.out.print("Nombre del sitio web a eliminar: ");
                    String sitioEliminar = scanner.nextLine();
                    usuario.eliminarContraseniaPorSitio(sitioEliminar);
                    System.out.println("Contrasena eliminada.");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
