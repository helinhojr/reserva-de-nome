/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.teste.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
public class Reserva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String tipoDeEmpresa;
    private String denominacao;
    private String actividadePrincipal;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;
    private boolean registado;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Representante> representantes;
    public Reserva() {
        this.data =Calendar.getInstance();
        this.data.setTime(new Date());
        this.registado=false;
        this.representantes = new ArrayList<>();
    }
    
    
    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipoDeEmpresa
     */
    public String getTipoDeEmpresa() {
        return tipoDeEmpresa;
    }

    /**
     * @param tipoDeEmpresa the tipoDeEmpresa to set
     */
    public void setTipoDeEmpresa(String tipoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
    }

    /**
     * @return the denominacao
     */
    public String getDenominacao() {
        return denominacao;
    }

    /**
     * @param denominacao the denominacao to set
     */
    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }

    /**
     * @return the actividadePrincipal
     */
    public String getActividadePrincipal() {
        return actividadePrincipal;
    }

    /**
     * @param actividadePrincipal the actividadePrincipal to set
     */
    public void setActividadePrincipal(String actividadePrincipal) {
        this.actividadePrincipal = actividadePrincipal;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the registado
     */
    public boolean isRegistado() {
        return registado;
    }

    /**
     * @param registado the registado to set
     */
    public void setRegistado(boolean registado) {
        this.registado = registado;
    }

    /**
     * @return the representantes
     */
    public List<Representante> getRepresentantes() {
        return representantes;
    }

    /**
     * @param representantes the representantes to set
     */
    public void setRepresentantes(List<Representante> representantes) {
        this.representantes = representantes;
    }
    
    
    public void adicionar(Representante representante){
        this.representantes.add(representante);
    }
    
}
