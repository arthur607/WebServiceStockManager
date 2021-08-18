package com.project.salsaModas.SalsaModas.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Data
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    //id auto increment
    private Long id;
    private String nome;
    private String modelo;
    private Double preco;

public Product(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(nome, product.nome) && Objects.equals(modelo, product.modelo) && Objects.equals(preco, product.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, modelo, preco);
    }
}
