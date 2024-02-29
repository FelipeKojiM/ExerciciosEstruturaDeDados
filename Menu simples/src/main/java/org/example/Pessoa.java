package org.example;

public class Pessoa {

    private String nome;
    private String senha;
    private Double peso;
    private Double altura;
    private Integer idade;

    public Pessoa(){
        this.nome = nome;
        this.senha = senha;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public Double getPeso() {return peso;}

    public void setPeso(Double peso) {this.peso = peso;}

    public Double getAltura() {return altura;}

    public void setAltura(Double altura) {this.altura = altura;}

    public Integer getIdade() {return idade;}

    public void setIdade(Integer idade) {this.idade = idade;}
}
