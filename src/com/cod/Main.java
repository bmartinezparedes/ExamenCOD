package com.cod;

public class Main {
    public static void main(String[] args) {
        /**
         * compruebo la si la conexion funciona
         */
        if (conexion1("pepe@danielcastelao.org")) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (conexion2()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        ;
    }

    /**
     *
     * @param u
     * @return
     */
    public static boolean conexion1(String u) {
        UsuarioYdireccion usuario1= UsuarioYdireccion.getInstance();
        System.out.println("Conectando a " + usuario1.ip + ", con el usuario " + u);
        return usuario1.comprovacionusuario();
    }

    public static boolean conexion2() {
        UsuarioYdireccion usuario2 =  UsuarioYdireccion.getInstance();
        System.out.println("Conectando a " + usuario2.ip + ", con el usuario " + usuario2.usuario);
        return usuario2.comprovacionusuario();
    }
}
