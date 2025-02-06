package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/home")
    public ApiResponse HomeControllerHandeler() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Home Controller");
        return apiResponse;
    }
}
