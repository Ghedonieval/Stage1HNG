package com.example.hng;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class helloController {
    
    private final helloService helloService;

    @GetMapping("/hello")
    public ResponseEntity<helloResponse> hello (@RequestParam("visitor_name") String visitorName, HttpServletRequest request){
        return new ResponseEntity<>(helloService.hello(visitorName, request) , HttpStatus.OK);
    }
}
