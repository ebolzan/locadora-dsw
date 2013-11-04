/*
 * locação classe associativa entre cliente e dvd 
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author evandro, luiz
 */


public class Locacao implements Serializable{
    
    private Cliente cliente;
    private Dvd dvd;
    private int diasDevolver;
    private Date dataCadastro;
    private BigDecimal valor;
    private Boolean editavel;

    public Locacao(Cliente cliente, Dvd dvd, int diasDevolver, Date dataCadastro, BigDecimal valor) {
        this.cliente = cliente;
        this.dvd = dvd;
        this.diasDevolver = diasDevolver;
        this.dataCadastro = dataCadastro;
        this.valor = valor;
    }            
    
    public Cliente getUsuario() {
        return cliente;
    }

    public void setUsuario(Cliente usuario) {
        this.cliente = usuario;
    }

    public Dvd getDvd() {
        return dvd;
    }

    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }

    public int getDiasDevolver() {
        return diasDevolver;
    }

    public void setDiasDevolver(int diasDevolver) {
        this.diasDevolver = diasDevolver;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getEditavel() {
        return editavel;
    }

    public void setEditavel(Boolean editavel) {
        this.editavel = editavel;
    }

           
}