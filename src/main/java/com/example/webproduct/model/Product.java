package com.example.webproduct.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item_seq")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String img;
    private int quantity;
    private double price;
}
