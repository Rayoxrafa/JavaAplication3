package dao;

import business.entity.Password;
import java.util.*;

public class PasswordDAO implements IBaseDAO<Password> {
    private List<Password> contrasenias = new ArrayList<>();

    @Override
    public void insertar(Password password) {
        contrasenias.add(password);
    }

    @Override
    public void actualizar(Password password) {
        // Implementación para actualizar una contraseña existente
    }

    @Override
    public void eliminar(String sitio) {
        contrasenias.removeIf(p -> p.getSitio().equals(sitio));
    }

    @Override
    public Password obtenerPorId(String sitio) {
        for (Password p : contrasenias) {
            if (p.getSitio().equals(sitio)) return p;
        }
        return null;
    }

    @Override
    public List<Password> obtenerTodos() {
        return contrasenias;
    }
}
