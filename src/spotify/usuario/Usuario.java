
package spotify.usuario;


public class Usuario {
    
    private Estado perfil;
    
    public Usuario(){
        perfil = new UsuarioFree();
    }
    
    public void setEstado(Estado usuario){
        this.perfil = usuario;
    }
    
    public void reproduzirMusica(){

        perfil.reproduzirMusica();
    }
  
    
}
