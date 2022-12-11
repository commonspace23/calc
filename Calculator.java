package com.example.calculator;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Calculator
{
    @Id
    private int id;
    private char symbol;
    private String description;

    public Calculator() {
    }

    public Calculator(int id, char symbol, String description) {
        this.id = id;
        this.symbol = symbol;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
