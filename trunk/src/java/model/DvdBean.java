/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author lfschleder
 */
@Named("dvd")
@SessionScoped
public class DvdBean implements Serializable{
 	
    private String titulo;
    private String categoria;    
    private Boolean lancamento;

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
    
    
	
    private static final ArrayList<Dvd> dvdList = 
	new ArrayList<>(Arrays.asList(
 
	new Dvd("Título 1", "Comédia", true),
        new Dvd("Título 2", "Terror", true),
        new Dvd("Título 3", "Ação", true),
        new Dvd("Título 4", "Comédia", true)
    ));
 
    public ArrayList<Dvd> getDvdList() {
	return dvdList;
    }
 
    public String addAction() {
	Dvd dvd = new Dvd(this.titulo, this.categoria, this.lancamento);
	dvdList.add(dvd);
	return null;
    }
 
    public String deleteAction(Dvd dvd) {

	dvdList.remove(dvd);
	return null;
    }
}

