package security;

import java.util.Base64;

public class Encriptador {

    public static String encriptar(String texto) {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }

    public static String desencriptar(String texto) {
        return new String(Base64.getDecoder().decode(texto));
    }
}
