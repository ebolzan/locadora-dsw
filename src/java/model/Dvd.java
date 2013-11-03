/*
 * Dvd classe
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author evandro, luiz
 */

@Named("dvd")
@SessionScoped
public class Dvd implements Serializable{
    
    //valores de filmes conforme tipo
    private static final Double LANC = new Double("3.50");
    private static final Double NORMAL = new Double("2.00");    
    
    private String titulo;
    private String categoria;    
    private Boolean lancamento;

    public Dvd(String titulo, String categoria, Boolean lancamento) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.lancamento = lancamento;
    }    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }     

    public Boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(Boolean lancamento) {
        this.lancamento = lancamento;
    }        
}
