package business.entity;

import java.time.LocalDate;

public class Password {
    private String sitio;
    private String usuarioSitio;
    private String contraseniaEncriptada;
    private LocalDate fechaCreacion;

    public Password(String sitio, String usuarioSitio, String contraseniaEncriptada) {
        this.sitio = sitio;
        this.usuarioSitio = usuarioSitio;
        this.contraseniaEncriptada = contraseniaEncriptada;
        this.fechaCreacion = LocalDate.now();
    }

    public void editarContrasenia(String nuevaEncriptada) {
        this.contraseniaEncriptada = nuevaEncriptada;
    }

    public void mostrarDetalles() {
        System.out.println("Sitio: " + sitio + ", Usuario: " + usuarioSitio);
    }

    public String getSitio() {
        return sitio;
    }

    public String getUsuarioSitio() {
        return usuarioSitio;
    }

    public String getContraseniaEncriptada() {
        return contraseniaEncriptada;
    }
}
