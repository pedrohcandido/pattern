
package spotify.usuario;


public class Propaganda implements Player{

    protected Propaganda(){
         
   }
    
    @Override
    public void reproduzir() {

        System.out.println("Reproduzindo Propagandas...");
        Musica musica = new Musica();
        musica.reproduzir();
    }
    
}
