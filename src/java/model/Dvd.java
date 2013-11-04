/*
 * Dvd classe
 */

package model;

import java.math.BigDecimal;
import java.io.Serializable;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;

/**
 *
 * @author evandro, luiz
 */

//@Named("dvd")
//@SessionScoped
public class Dvd implements Serializable{
    
    //valores de filmes conforme tipo
    private static final BigDecimal LANC = new BigDecimal("3.50");
    private static final BigDecimal NORMAL = new BigDecimal("2.00");    
    
    private String titulo;
    private String categoria;    
    private Boolean lancamento;
    private Boolean editavel;

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

    public Boolean getLancamento() {
        return lancamento;
    }

    public void setLancamento(Boolean lancamento) {
        this.lancamento = lancamento;
    }        

    public Boolean getEditavel() {
        return editavel;
    }

    public void setEditavel(Boolean editavel) {
        this.editavel = editavel;
    }
        
}
