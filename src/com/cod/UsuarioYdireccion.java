package com.cod;

public class UsuarioYdireccion {
    String usuario = "";
    String ip = "127.0.0.2";

    UsuarioYdireccion() {
        usuario = "anonymous@danielcastelao.org";
    }

    UsuarioYdireccion(String param1) {
        this.usuario = param1;
    }

    public boolean con() {
        if (usuario != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
