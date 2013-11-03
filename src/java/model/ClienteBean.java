/*
 * classe usuario e suas definicoes
 */

package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author evandro, luiz
 */

@Named("cliente")
@SessionScoped
public class ClienteBean implements Serializable{    
    
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    private Boolean ativo = true;
    private Boolean editavel;       
    
     //private static final ArrayList<Cliente> clienteList = new ArrayList<>(Arrays.asList(a))

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public Boolean getEditavel() {
        return editavel;
    }

    public void setEditavel(Boolean editavel) {
        this.editavel = editavel;
    }
    
    private static final ArrayList<Cliente> clientList = new ArrayList<>(
            Arrays.asList(
                    new Cliente("99999999","Evandro", "ebolzan@inf.ufsm.br",
                    "Santa Maria - Camobi"),
                    new Cliente("5555555","Eduardo", "eduardo@inf.ufsm.br", 
                            "Santa Maria - Camobi"),
                    new Cliente("6656565","Felipe", "felipe@inf.ufsm.br", 
                            "Santa Maria - Camobi")
    ));
      
    
    public ArrayList<Cliente> getClienteList()
    {
        return clientList;
    }        
        
     public String addAction() {	
        Cliente cliente = new Cliente(this.telefone, this.nome, this.email, this.endereco);        
        clientList.add(cliente);        
	return null;                
    }
 
    public String deleteAction(Cliente cliente) {
	clientList.remove(cliente);
	return null;
    }
    
    public String editAction(Cliente cliente) {	
        cliente.setEditavel(true);
	return null;
    }
    
    public String saveAction() {
 
	// Altera o valor de editavel em todos os itens.
	for (Cliente cliente : clientList){
            cliente.setEditavel(false);            
	}
	// volta para a pagina atual
	return null;
    }  
}
