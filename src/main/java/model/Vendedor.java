package model;

import org.immutables.builder.Builder;

public class Vendedor {
    String nome;

    @Builder.Constructor
    public Vendedor(String nome) {
        this.nome = nome;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
