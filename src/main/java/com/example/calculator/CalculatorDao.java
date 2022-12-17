package com.example.calculator;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CalculatorDao extends CrudRepository<Calculator,Integer>
{
}
