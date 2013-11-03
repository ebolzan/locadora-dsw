/*
 * classe usuario e suas definicoes
 */

package model;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author evandro, luiz
 */

@Named
@SessionScoped
public class Cliente extends User implements Serializable{    
    private String telefone;
    private Boolean ativo = true;

    public Cliente() {        
    }
    
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    public String getSaudacao()
    {  
        if(this.getNome() != null)
            return "" + this.getNome() + " "+ this.getEmail();
        else
            return null;
        
        //return "" + this.getNome() + " "+ this.getEmail();
    }            
           
        
}
