package com.example.demo.controllers;

import com.example.demo.Dtos.IdInputDTO;
import com.example.demo.Dtos.TelevisionDTO;
import com.example.demo.Services.TelevisionService;
import com.example.demo.models.Television;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class TelevisionController {

    @Autowired
    private TelevisionService televisionService;

    @GetMapping("/televisions")
    public ResponseEntity<Object> getAllTelevisions() {
        return new ResponseEntity<>(televisionService.getTelevisions(), HttpStatus.OK);
    }

    // array begint telling met 0
    // .size begint telling met 1


    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getOneTelevision(@PathVariable Long id) {
        return new ResponseEntity<>(televisionService.getTelevision(id), HttpStatus.OK);
    }

    @PostMapping("/televisions")
    public ResponseEntity<Object> addTelevision (@RequestBody TelevisionDTO dto) {
        return new ResponseEntity<>(televisionService.saveTelevision(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/televisions/{id}")
    public ResponseEntity<Object> deleteTelevision(@PathVariable Long id) {
        televisionService.removeTelevision(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/televisions/{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable Long id, @RequestBody Television television) {
        televisionService.updateTelevision(id, TelevisionDTO.fromTelevision(television));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/televisions/{id}/remotecontroller")
    public ResponseEntity<Object> updateRemoteController(@PathVariable Television televisionId, @RequestBody IdInputDTO id) {
        televisionService.updateRemoteController(televisionId, id);
        return ResponseEntity.noContent().build();
    }
}

