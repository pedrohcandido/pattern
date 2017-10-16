
package spotify.playlist;


public class Composta implements Musica{


    private Musica musica1;
    private Musica musica2;
    
    public Composta(Musica musica1, Musica musica2){
        this.musica1 = musica1;
        this.musica2 = musica2;
    }
    
    
    @Override
    public String getNome() {
        
        return musica1.getNome() + " + " + musica2.getNome();
    }
    
}
