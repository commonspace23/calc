package com.example.calculator;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculatorRestController
{
    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping("/calculator")
    public List<Calculator> GetAllCalculator()
    {return calculatorService.GetAllCalculator();}

    @RequestMapping("/calculator/{id}")
    public Calculator GetCalculator(@PathVariable int id)
    {return calculatorService.GetCalculator(id);}

    @PostMapping("/calculator")
    public void AddCalculator(@RequestBody Calculator calculator)
    {calculatorService.AddCalculator(calculator);}

    @PutMapping("/calculator/{id}")
    public void UpdateCalculator(@RequestBody Calculator calculator,@PathVariable int id)
    {calculatorService.UpdateCalculator(calculator, id);}

    @DeleteMapping("/calculator/{id}")
    public void DeleteCalculator(@PathVariable int id)
    {calculatorService.DeleteCalculator(id);}

}
