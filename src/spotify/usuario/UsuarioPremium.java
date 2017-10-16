
package spotify.usuario;


public class UsuarioPremium implements Estado{

    protected UsuarioPremium(){
        
    }
    
    @Override
    public void reproduzirMusica() {

        Musica musica = new Musica();
        musica.reproduzir();
    }

    
}
