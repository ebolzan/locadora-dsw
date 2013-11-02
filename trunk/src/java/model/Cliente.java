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

@Named("cliente")
@SessionScoped
public class Cliente extends User implements Serializable{    
    private String telefone;
    private Boolean ativo;

    public Cliente(String nome, String endereco, String email, String telefone, Boolean ativo) {
        super(nome, endereco, email);
        this.telefone = telefone;
        this.ativo = ativo;
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
    
    
           
        
}
