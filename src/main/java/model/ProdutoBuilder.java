/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;


public class ProdutoBuilder {

    private int id;
    private String titulo;
    private String descricao;
    private double preco;
    private String marca;
    private String modelo;
    private String categoria;
    private int estoque;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private String urlFoto;
    private Vendedor vendedor;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    //public ProdutoBuilder(String descricao, double preco) {}
    
    public ProdutoBuilder(String titulo, String descricao, double preco,String categoria, Vendedor vendedor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.vendedor = vendedor;
    }

    public ProdutoBuilder id(int id) {
        this.id = id;
        return this;
    }

    public ProdutoBuilder titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public ProdutoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public ProdutoBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ProdutoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public ProdutoBuilder dataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public ProdutoBuilder dataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
        return this;
    }

    public ProdutoBuilder urlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        return this;
    }

    public ProdutoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public ProdutoBuilder peso(double peso) {
        this.peso = peso;
        return this;
    }

    public ProdutoBuilder altura(double altura) {
        this.altura = altura;
        return this;
    }

    public ProdutoBuilder largura(double largura) {
        this.largura = largura;
        return this;
    }

    public ProdutoBuilder profundidade(double profundidade) {
        this.profundidade = profundidade;
        return this;
    }

    public Produto build() {
        return new Produto(id, titulo, descricao, preco, marca, modelo, categoria, estoque, dataCadastro, dataAtualizacao, urlFoto, vendedor, peso, altura, largura, profundidade);
    }
    
}
