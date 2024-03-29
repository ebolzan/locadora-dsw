/*
 * user class usada para criar subclasse admin e cliente
 */

package model;

/**
 *
 * @author evandro, luiz
 */

public class User {
    protected String nome;
    protected String email;
    protected String endereco;

    public User(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
    
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
}