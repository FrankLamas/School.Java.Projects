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
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario.findByNombre", query = "SELECT u FROM Usuario u WHERE u.nombre like concat('%',:nombre,'%') ")
    , @NamedQuery(name = "Usuario.findByDomicilio", query = "SELECT u FROM Usuario u WHERE u.domicilio like concat('%',:domicilio,'%') ")
    , @NamedQuery(name = "Usuario.findByAval", query = "SELECT u FROM Usuario u WHERE u.aval like concat('%',:aval,'%') ")
    , @NamedQuery(name = "Usuario.findByDomicilioaval", query = "SELECT u FROM Usuario u WHERE u.domicilioaval like concat('%',:domicilioaval,'%') ")
    , @NamedQuery(name = "Usuario.findByTelefonoaval", query = "SELECT u FROM Usuario u WHERE u.telefonoaval like concat('%',:telefonoaval,'%') ")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DOMICILIO")
    private String domicilio;
    @Basic(optional = false)
    @Column(name = "AVAL")
    private String aval;
    @Basic(optional = false)
    @Column(name = "DOMICILIOAVAL")
    private String domicilioaval;
    @Basic(optional = false)
    @Column(name = "TELEFONOAVAL")
    private String telefonoaval;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String nombre, String domicilio, String aval, String domicilioaval, String telefonoaval) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.aval = aval;
        this.domicilioaval = domicilioaval;
        this.telefonoaval = telefonoaval;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getAval() {
        return aval;
    }

    public void setAval(String aval) {
        this.aval = aval;
    }

    public String getDomicilioaval() {
        return domicilioaval;
    }

    public void setDomicilioaval(String domicilioaval) {
        this.domicilioaval = domicilioaval;
    }

    public String getTelefonoaval() {
        return telefonoaval;
    }

    public void setTelefonoaval(String telefonoaval) {
        this.telefonoaval = telefonoaval;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
