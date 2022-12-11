package com.example.calculator;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CalculatorService
{
    @Autowired
    public CalculatorDao calculatorDao;

    public List<Calculator> GetAllCalculator()
    {
        List<Calculator> calculators=new ArrayList<>();
        calculatorDao.findAll().forEach(calculators::add);
        return calculators;
    }

    public Calculator GetCalculator(int id)
    {
        Calculator c=calculatorDao.findById(id).get();
        return c;
    }

    public void AddCalculator(Calculator calculator)
    {
        calculatorDao.save(calculator);
    }

    public void UpdateCalculator(Calculator calculator,int id)
    {
        calculatorDao.save(calculator);
    }

    public void DeleteCalculator(int id)
    {
        calculatorDao.deleteById(id);
    }
}
