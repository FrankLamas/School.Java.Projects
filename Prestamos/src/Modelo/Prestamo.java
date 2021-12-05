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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "PRESTAMO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamo.findAll", query = "SELECT p FROM Prestamo p")
    , @NamedQuery(name = "Prestamo.findByIdprestamo", query = "SELECT p FROM Prestamo p WHERE p.idprestamo = :idprestamo")
    , @NamedQuery(name = "Prestamo.findByFecha", query = "SELECT p FROM Prestamo p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Prestamo.findByFechaentrega", query = "SELECT p FROM Prestamo p WHERE p.fechaentrega = :fechaentrega")
    , @NamedQuery(name = "Prestamo.findByEstado", query = "SELECT p FROM Prestamo p WHERE p.estado = :estado")
    , @NamedQuery(name = "Prestamo.findByClave", query = "SELECT p FROM Prestamo p WHERE p.clave = :clave")
    , @NamedQuery(name = "Prestamo.findByIdusuario", query = "SELECT p FROM Prestamo p WHERE p.idusuario = :idusuario")})
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPRESTAMO")
    private Integer idprestamo;
    @Basic(optional = false)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "FECHAENTREGA")
    private String fechaentrega;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "CLAVE")
    private String clave;
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private int idusuario;

    public Prestamo() {
    }

    public Prestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public Prestamo(Integer idprestamo, String fecha, String fechaentrega, String estado, String clave, int idusuario) {
        this.idprestamo = idprestamo;
        this.fecha = fecha;
        this.fechaentrega = fechaentrega;
        this.estado = estado;
        this.clave = clave;
        this.idusuario = idusuario;
    }

    public Integer getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprestamo != null ? idprestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamo)) {
            return false;
        }
        Prestamo other = (Prestamo) object;
        if ((this.idprestamo == null && other.idprestamo != null) || (this.idprestamo != null && !this.idprestamo.equals(other.idprestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Prestamo[ idprestamo=" + idprestamo + " ]";
    }
    
}
