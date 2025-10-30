package com.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class MultiplicationApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiplicationApplication.class, args);
    }
}

@Controller
class MultiplicationController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @PostMapping("/multiply")
    public String getMultiplicationTable(@RequestParam("number") String numberStr, Model model) {
        try {
            int number = Integer.parseInt(numberStr);
            StringBuilder result = new StringBuilder();
            
            // Generate multiplication table up to 100
            for (int i = 1; i <= 100; i++) {
                result.append(number).append(" × ").append(i)
                      .append(" = ").append(number * i).append("\n");
            }
            
            model.addAttribute("result", result.toString());
            model.addAttribute("number", number);
        } catch (NumberFormatException e) {
            model.addAttribute("error", "Please enter a valid integer");
        }
        
        return "index";
    }
}