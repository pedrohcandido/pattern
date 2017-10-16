
package spotify.usuario;


public class UsuarioFree implements Estado{

    protected UsuarioFree(){
        
    }
    
    @Override
    public void reproduzirMusica() {

        Propaganda propaganda = new Propaganda();
        propaganda.reproduzir();
    }


   
}
