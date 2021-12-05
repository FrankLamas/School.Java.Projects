/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author falco
 */
@Entity
@Table(name = "LIBRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l")
    , @NamedQuery(name = "Libro.findByClave", query = "SELECT l FROM Libro l WHERE l.clave = :clave")
    , @NamedQuery(name = "Libro.findByTitulo", query = "SELECT l FROM Libro l WHERE l.titulo like concat('%',:titulo,'%') ")
    , @NamedQuery(name = "Libro.findByAutor", query = "SELECT l FROM Libro l WHERE l.autor like concat('%',:autor,'%') ")
    , @NamedQuery(name = "Libro.findByNejemplares", query = "SELECT l FROM Libro l WHERE l.nejemplares like concat('%',:nejemplares,'%') ")})
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLAVE")
    private String clave;
    @Basic(optional = false)
    @Column(name = "TITULO")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "AUTOR")
    private String autor;
    @Basic(optional = false)
    @Column(name = "NEJEMPLARES")
    private int nejemplares;

    public Libro() {
    }

    public Libro(String clave) {
        this.clave = clave;
    }

    public Libro(String clave, String titulo, String autor, int nejemplares) {
        this.clave = clave;
        this.titulo = titulo;
        this.autor = autor;
        this.nejemplares = nejemplares;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNejemplares() {
        return nejemplares;
    }

    public void setNejemplares(int nejemplares) {
        this.nejemplares = nejemplares;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clave != null ? clave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.clave == null && other.clave != null) || (this.clave != null && !this.clave.equals(other.clave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Libro[ clave=" + clave + " ]";
    }
    
}
