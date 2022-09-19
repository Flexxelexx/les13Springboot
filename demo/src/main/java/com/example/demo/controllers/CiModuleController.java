package com.example.demo.controllers;


import com.example.demo.Dtos.CiModuleDTO;
import com.example.demo.Services.CiModuleService;
import com.example.demo.models.CiModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CiModuleController {

    @Autowired
    private CiModuleService ciModuleService;


    @GetMapping("/cimodules")
    public ResponseEntity<Object> getAllCimodules() {
        return new ResponseEntity<>(ciModuleService.getCiModules(), HttpStatus.OK);
    }

    @GetMapping("/cimodules/{id}")
    public ResponseEntity<Object> getOneCimodule(@PathVariable Long id) {
        return new ResponseEntity<>(ciModuleService.getCiModules(), HttpStatus.OK);
    }

    @PostMapping("/cimodules")
    public ResponseEntity<Object> addCimodule (@RequestBody CiModuleDTO dto) {
        return new ResponseEntity<>(ciModuleService.saveCiModule(dto), HttpStatus.OK);
    }

    @DeleteMapping("/cimodules/{id}")
    public ResponseEntity<Object> deleteCimodule (@PathVariable Long id) {
        ciModuleService.removeCiModule(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/cimodules/{id}")
    public ResponseEntity<Object> updateCimodule (@PathVariable Long id, @RequestBody CiModule ciModule) {
        ciModuleService.updateCiModule(id, CiModuleDTO.fromCiModule(ciModule));
        return ResponseEntity.noContent().build();
    }
}
