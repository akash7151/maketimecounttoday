package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;






    @RestController
    public class visa{
        @GetMapping("/visa")

        public String getData() { return  "Please book evisa via vfs global in 40days from Dev A" ; }


    }
