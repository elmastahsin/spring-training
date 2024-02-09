package com.company.spring26jwt.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Hello JWT!");
    }

}
