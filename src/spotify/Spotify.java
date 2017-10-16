
package spotify;


import spotify.usuario.Usuario;
import spotify.usuario.VerificarUsuario;
import spotify.playlistBuilder.PlaylistBuilder;


public class Spotify {

   
    public static void main(String[] args) {
        
        System.out.println("\n" + "USUARIO PREMIUM :" + "\n");
        
        Usuario premium = new Usuario();
        VerificarUsuario usuariop = new VerificarUsuario();
        premium.setEstado(usuariop.criaPerfil("premium"));
        premium.reproduzirMusica();
        
        
        
        System.out.println("\n" + "USUARIO GRATUITO :" + "\n");
        
        Usuario gratuito = new Usuario();
        VerificarUsuario usuariog = new VerificarUsuario();
        gratuito.setEstado(usuariog.criaPerfil("gratuito"));
        gratuito.reproduzirMusica();
        
        System.out.println();
        
        PlaylistBuilder p = new PlaylistBuilder();
        p.playList();
        
        
        
        
    }
    
}
