package dao;

import business.entity.Usuario;
import java.util.*;

public class UsuarioDAO implements IBaseDAO<Usuario> {
    private Map<String, Usuario> baseDatosSimulada = new HashMap<>();

    @Override
    public void insertar(Usuario usuario) {
        baseDatosSimulada.put(usuario.getEmail(), usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        baseDatosSimulada.put(usuario.getEmail(), usuario);
    }

    @Override
    public void eliminar(String email) {
        baseDatosSimulada.remove(email);
    }

    @Override
    public Usuario obtenerPorId(String email) {
        return baseDatosSimulada.get(email);
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return new ArrayList<>(baseDatosSimulada.values());
    }
}
