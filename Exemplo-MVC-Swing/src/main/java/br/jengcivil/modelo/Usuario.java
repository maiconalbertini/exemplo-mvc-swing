package br.jengcivil.modelo;

public class Usuario {
    
    private int id;
    private String origem;
    private String nomeusuario;
    private String senhausuario;
    private String observacoes;

    public Usuario() {
    }

    public Usuario(int id, String origem, String nomeusuario, String senhausuario, String observacoes) {
        this.id = id;
        this.origem = origem;
        this.nomeusuario = nomeusuario;
        this.senhausuario = senhausuario;
        this.observacoes = observacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenhausuario() {
        return senhausuario;
    }

    public void setSenhausuario(String senhausuario) {
        this.senhausuario = senhausuario;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
}
