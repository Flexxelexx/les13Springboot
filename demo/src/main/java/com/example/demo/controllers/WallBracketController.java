package com.example.demo.controllers;


import com.example.demo.Dtos.WallbracketDTO;
import com.example.demo.Services.WallbracketService;
import com.example.demo.models.WallBracket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
public class WallBracketController {

    @Autowired
    private WallbracketService wallbracketService;

    @GetMapping("/wallbrackets")
    public ResponseEntity<Object> getAllWallbrackets() {
        return new ResponseEntity<>(wallbracketService.getWallBrackets(), HttpStatus.OK);
    }

    @GetMapping("/wallbrackets/{id}")
    public ResponseEntity<Object> getOneWallbracket(@PathVariable Long id) {
        return new ResponseEntity<>(wallbracketService.getWallbracket(id), HttpStatus.OK);
    }

    @PostMapping("/wallbrackets")
    public ResponseEntity<Object> addWallbracket (@RequestBody WallbracketDTO dto) {
        return new ResponseEntity<>(wallbracketService.saveWallbracket(dto), HttpStatus.OK);
    }

    @DeleteMapping("/wallbrackets/{id}")
    public ResponseEntity<Object> deleteWallbracket(@PathVariable Long id) {
        wallbracketService.removeWallbracket(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/wallbrackets/{id}")
    public ResponseEntity<Object> updateWallbracket (@PathVariable Long id, @RequestBody WallBracket wallBracket) {
        wallbracketService.updateWallbracket(id, WallbracketDTO.fromWallbracket(wallBracket));
       return ResponseEntity.noContent().build();
    }
}
