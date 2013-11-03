/*
 * classe admin sistema de locação
 */

package model;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/** 
 * @author evandro, luiz
 */

@Named("admin")
@SessionScoped
public class Admin extends User implements Serializable{

   private String login;
   private String senha;   

    public Admin(String login, String senha, String nome, String email, String endereco) {
        super(nome, email, endereco);
        this.login = login;
        this.senha = senha;
    }      
   
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }               
    
}
