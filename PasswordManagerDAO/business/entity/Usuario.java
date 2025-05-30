package business.entity;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private List<Password> contrasenias = new ArrayList<>();

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void agregarContrasenia(Password password) {
        contrasenias.add(password);
    }

    public void eliminarContrasenia(Password password) {
        contrasenias.remove(password);
    }

    public List<Password> mostrarContrasenias() {
        return contrasenias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
