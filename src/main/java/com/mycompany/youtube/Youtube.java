
package com.mycompany.youtube;

public class Youtube {

    public static void main(String[] args) {
        Usuario usuario = new Usuario ("manzana");
        Video video = new Video ("aprendiendo java",2400, "http;//manzana.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        Usuario usuario2=new Usuario ("Blanco");
        Comentario comment1=new Comentario("Feo tu modo", usuario2);
        System.out.println("El usuario" + usuario2.getNombre()+ "Publico el comentario"+comment1.getContenido());
    }
}
