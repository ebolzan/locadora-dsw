/*
 * LocacaoBean acesso ao model locacao
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author evandro
 */
@Named("locacao")
@SessionScoped
public class LocacaoBean implements Serializable{
    private Cliente cliente;
    private Dvd dvd;
    private int diasDevolver;
    private Date dataCadastro;
    private BigDecimal valor;
    private Boolean editavel;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public Boolean getEditable() {
        return editavel;
    }

    public void setEditable(Boolean editable) {
        this.editavel = editable;
    }
    
    private static ArrayList<Locacao> locacaoList = new ArrayList<>(
            Arrays.asList(
                    new Locacao(new Cliente("8989889", "Evandro", "ebolzan@inf.ufsm.br", "restinga seca"), 
                            new Dvd("Titulo 1", "Drama", Boolean.TRUE), 2, new Date(2013, 10, 23), BigDecimal.ONE)                            
            ));       
    
    public ArrayList<Locacao> getLocacaoList()
    {
        return locacaoList;                
    }
    
    public String addAction()
    {
        Locacao locacao = new Locacao(cliente, dvd, diasDevolver, dataCadastro, BigDecimal.ZERO);
        locacaoList.add(locacao);        
        return null;
    }
    
    public String deleteAction(Locacao locacao)
    {
        locacaoList.remove(locacao);
        return null;
    }
    
    public String editAction(Locacao locacao)
    {
        locacao.setEditavel(true);
        return null;
    }
    
    public String saveAction()
    {
        for(Locacao locacao : locacaoList)
        {
            locacao.setEditavel(false);
        }
        return null;
    }
}
