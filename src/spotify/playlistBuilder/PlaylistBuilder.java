
package spotify.playlistBuilder;

import spotify.playlist.Composta;
import spotify.playlist.Musica;
import spotify.playlist.Simples;


public class PlaylistBuilder {
    
    public void playList(){
          
          Musica m1 = new Simples("Faixa 1 ");
          Musica m2 = new Simples("Faixa 2 ");
          Musica m3 = new Simples("Faixa 3 ");
          Musica m4 = new Simples("Faixa 4 ");
          Musica m5 = new Simples("Faixa 5 ");
          Musica m6 = new Simples("Faixa 6 ");
          Musica m7 = new Simples("Faixa 7 ");
          Musica m8 = new Simples("Faixa 8 ");
          Musica m9 = new Simples("Faixa 9 ");
          Musica m10 = new Simples("Faixa 10 ");
          
          Musica playlist = new Composta(m1,m2);          
          Musica playlist1 = new Composta(playlist,m3);          
          Musica playlist2 = new Composta(playlist1,m4);          
          Musica playlist3 = new Composta(playlist2,m5);          
          Musica playlist4 = new Composta(playlist3,m6);          
          Musica playlist5 = new Composta(playlist4,m7);          
          Musica playlist6 = new Composta(playlist5,m8);          
          Musica playlist7 = new Composta(playlist6,m9);          
          Musica playlist8 = new Composta(playlist7,m10);
          
          System.out.println(playlist8.getNome());
    }
    
}
