package service;

import business.entity.Usuario;
import business.entity.Password;
import dao.UsuarioDAO;
import dao.PasswordDAO;
import security.Encriptador;

public class GestorContrasenias {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private PasswordDAO passwordDAO = new PasswordDAO();

    public void registrarUsuario(Usuario usuario) {
        usuarioDAO.insertar(usuario);
    }

    public Usuario login(String email) {
        return usuarioDAO.obtenerPorId(email);
    }

    public void agregarContrasenia(Usuario usuario, String sitio, String usuarioSitio, String contrasenia) {
        String encriptada = Encriptador.encriptar(contrasenia);
        Password password = new Password(sitio, usuarioSitio, encriptada);
        usuario.agregarContrasenia(password);
        usuarioDAO.actualizar(usuario);
        passwordDAO.insertar(password);
    }

    public void mostrarContraseniasUsuario(Usuario usuario) {
        for (Password p : usuario.mostrarContrasenias()) {
            p.mostrarDetalles();
        }
    }
}
