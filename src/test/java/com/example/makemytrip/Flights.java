package com.example.makemytrip;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




    @RestController
    public class Flights {

        @GetMapping("/flights")
        public String getData() {return  "Please flights ticket 30% discount" ; }
    }

