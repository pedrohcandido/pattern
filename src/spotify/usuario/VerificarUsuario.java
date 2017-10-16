
package spotify.usuario;


public class VerificarUsuario {
    
    public Estado criaPerfil(String usuario){
        if(usuario.equalsIgnoreCase("premium")){            
           return new UsuarioPremium();
        }else{
            return new UsuarioFree();
        }
         
    }    
}
