
package com.mycompany.youtube;

public class Youtube {

    public static void main(String[] args) {
        Usuario usuario = new Usuario ("Negro");
        Video video = new Video ("Aprendiendo Java",2400, "http;//negro.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
        
        Usuario usuario2=new Usuario ("Blanco");
        Comentario comment1=new Comentario("Puto el que lo lea", usuario2);
        System.out.println("El usuario" + usuario2.getNombre()+ "Publico el comentario"+comment1.getContenido());
    }
}