package com.example.demo.controllers;


import com.example.demo.Dtos.RemoteControllerDTO;
import com.example.demo.Services.RemoteControllerService;
import com.example.demo.models.RemoteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RemoteControllerController {

    @Autowired
    private RemoteControllerService remoteControllerService;

    @GetMapping("/remotecontrollers")
    public ResponseEntity<Object> getAllRemoteControllers() {
        return new ResponseEntity<>(remoteControllerService.getRemoteControllers(), HttpStatus.OK);
    }

    @GetMapping("/remotecontrollers/{id}")
    public ResponseEntity<Object> getOneRemotecontroller(@PathVariable Long id) {
        return new ResponseEntity<>(remoteControllerService.getRemoteController(id), HttpStatus.OK);
    }

    @PostMapping("/remotecontrollers")
    public ResponseEntity<Object> addRemotecontroller (@RequestBody RemoteControllerDTO dto) {
        return new ResponseEntity<>(remoteControllerService.saveRemoteController(dto), HttpStatus.OK);
    }

    @DeleteMapping("/remotecontrollers/{id}")
    public ResponseEntity<Object> deleteRemotecontroller(@PathVariable Long id) {
        remoteControllerService.removeRemoteController(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/remotecontrollers/{id}")
    public ResponseEntity<Object> updateRemotecontroller (@PathVariable Long id, @RequestBody RemoteController remoteController) {
        remoteControllerService.updateRemoteController(id, RemoteControllerDTO.fromRemoteController(remoteController));
        return ResponseEntity.noContent().build();
    }
}
