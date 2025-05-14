package com.example.makemytrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





    @RestController
    public class CExchange {
        @GetMapping("/CExchange")
        public String getData() {return  "Please exchange your currency at best rate" ; }
    }
