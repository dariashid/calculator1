package pro.sky.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.calculator.service.CalculatorService;

public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @RequestMapping(path = "/sum")
    public ResponseEntity<String> sum(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа.");
        }
        int result = calculatorService.sum(num1, num2);
        return ResponseEntity.ok(num1 + "+" + num2 + " = " + result);
    }

    @RequestMapping(path = "/minus")
    public ResponseEntity<String> minus(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа.");
        }
        int result = calculatorService.minus(num1, num2);
        return ResponseEntity.ok(num1 + "-" + num2 + " = " + result);
    }

    @RequestMapping(path = "/divide")
    public  ResponseEntity<String> divide (@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа.");
        }
        int result = calculatorService.divide(num1, num2);
        return ResponseEntity.ok(num1 + " / " + num2 + " = " + result);
    }

    @GetMapping("/multiply")
    public ResponseEntity<String> multiply(@RequestParam Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа.");
        }
        int result = calculatorService.multiply(num1, num2);
        return ResponseEntity.ok(num1 + "*" + num2 + " = " + result);

    }

}
