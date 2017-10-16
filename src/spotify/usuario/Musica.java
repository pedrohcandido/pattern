
package spotify.usuario;


public class Musica implements Player{

    protected Musica(){
        
    }
    
    @Override
    public void reproduzir() {

        
        System.out.println("Reproduzindo musica....");
    }
    
}
