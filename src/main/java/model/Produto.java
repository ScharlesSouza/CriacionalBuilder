package model;

import java.time.LocalDate;
import org.immutables.builder.Builder;

public final class Produto {
    int id;
    String titulo;
    String descricao;
    double preco;
    String marca;
    String modelo;
    String categoria;
    int estoque;
    LocalDate dataCadastro;
    LocalDate dataAtualizacao;
    String urlFoto;
    Vendedor vendedor;
    double peso;
    double altura;
    double largura;
    double profundidade;

    
    Produto(int id, String titulo, String descricao, double preco, String marca, String modelo, String categoria, int estoque, LocalDate dataCadastro, LocalDate dataAtualizacao, String urlFoto, Vendedor vendedor, double peso, double altura, double largura, double profundidade) {
        this.id = id;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setCategoria(categoria);
        this.setVendedor(vendedor);
        this.dataCadastro = LocalDate.now();
        this.setDataAtualizacao(LocalDate.now());
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
        this.urlFoto = urlFoto;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /*
    public Produto setId(int id) {
        this.id = id;
        return this;
    }

     */

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <=0)
            throw new IllegalArgumentException(
                    "O preço deve ser maior que zero");

        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if ((modelo !=null && modelo.isBlank()) && (getMarca() == null || getMarca().isBlank()))
            throw  new IllegalArgumentException("É preciso atribuir uma marca para poder informar um modelo");
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", preco=" + preco + ", marca=" + marca + ", modelo=" + modelo + ", categoria=" + categoria + ", estoque=" + estoque + ", dataCadastro=" + dataCadastro + ", dataAtualizacao=" + dataAtualizacao + ", urlFoto=" + urlFoto + ", vendedor=" + vendedor + ", peso=" + peso + ", altura=" + altura + ", largura=" + largura + ", profundidade=" + profundidade + '}';
    }

    
}
