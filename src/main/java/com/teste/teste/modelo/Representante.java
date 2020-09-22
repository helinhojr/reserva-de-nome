/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.teste.modelo;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Representante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    private String apelido;
    private String nomes;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDeNascimento;
    private String nacionalidade;
    private String tipoDeDocumento;
    private String numeroDoDocumento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataDeEmissao;
    @OneToOne(cascade = CascadeType.ALL)
    private Residencia residencia;
    private String tipo;
    

    public Representante() {
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
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the nomes
     */
    public String getNomes() {
        return nomes;
    }

    /**
     * @param nomes the nomes to set
     */
    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    /**
     * @return the dataDeNascimento
     */
    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento the dataDeNascimento to set
     */
    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the tipoDeDocumento
     */
    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    /**
     * @param tipoDeDocumento the tipoDeDocumento to set
     */
    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    /**
     * @return the numeroDoDocumento
     */
    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    /**
     * @param numeroDoDocumento the numeroDoDocumento to set
     */
    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    /**
     * @return the dataDeEmissao
     */
    public Calendar getDataDeEmissao() {
        return dataDeEmissao;
    }

    /**
     * @param dataDeEmissao the dataDeEmissao to set
     */
    public void setDataDeEmissao(Calendar dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    /**
     * @return the residencia
     */
    public Residencia getResidencia() {
        return residencia;
    }

    /**
     * @param residencia the residencia to set
     */
    public void setResidencia(Residencia residencia) {
        this.residencia = residencia;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
