package com.cod;

public class UsuarioYdireccion {
    /**
     *
     */
    private static UsuarioYdireccion instance=null;
    String usuario = "";
    String ip = "127.0.0.2";


    UsuarioYdireccion() {
        usuario = "anonymous@danielcastelao.org";
    }

    UsuarioYdireccion(String param1) {
        this.usuario = param1;
    }

    /**
     * Creo el Singleton
     * @return
     */
    public static UsuarioYdireccion getInstance() {
        //comprueba si ya esta creada
        if (instance == null) {
            //como no está creada, la creo
            //desde aqui si que puedo acceder al contructor
            //por que estoy en la misma clase
            instance = new UsuarioYdireccion();
        }
        // devuelvo la instancia
        return instance;
    }

    /**
     * compuebo si el usuario es aanonimo o no
     * @return
     */
    public boolean comprovacionusuario() {
        if (usuario != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
