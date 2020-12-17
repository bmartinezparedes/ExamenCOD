package com.cod;

public class UsuarioYdireccion {

    private static UsuarioYdireccion instance=null;
    String usuario = "";
    String ip = "127.0.0.2";


    UsuarioYdireccion() {
        usuario = "anonymous@danielcastelao.org";
    }

    UsuarioYdireccion(String param1) {
        this.usuario = param1;
    }
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

    public boolean con() {
        if (usuario != "anonymous@danielcastelao.org") {
            return true;
        } else {
            return false;
        }
    }
}
