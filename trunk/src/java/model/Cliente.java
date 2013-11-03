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

public class Cliente extends User implements Serializable{    
    private String telefone;
    private Boolean ativo = true;
    private Boolean editavel;

    public Cliente(String telefone, String nome, String email, String endereco) {
        super(nome, email, endereco);
        this.telefone = telefone;
    }

    public Boolean getEditavel() {
        return editavel;
    }

    public void setEditavel(Boolean editavel) {
        this.editavel = editavel;
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
