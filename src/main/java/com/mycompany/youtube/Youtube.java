
package com.mycompany.youtube;

public class Youtube {

    public static void main(String[] args) {
        Usuario usuario = new Usuario ("manzana");
        Video video = new Video ("aprendiendo java",2400, "http;//manzana.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
    }
}
