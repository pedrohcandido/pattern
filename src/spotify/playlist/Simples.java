
package spotify.playlist;


public class Simples implements Musica{
    
    private String nome;
    
    public Simples(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String getNome() {

        return nome;
    }
    
}
