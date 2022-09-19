package com.example.demo.Services;


import com.example.demo.Dtos.RemoteControllerDTO;
import com.example.demo.Repositories.RemoteControllerRepository;
import com.example.demo.exceptions.RecordNotFoundException;
import com.example.demo.models.RemoteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
public class RemoteControllerService {

    @Autowired
    private RemoteControllerRepository remoteControllerRepository;
    

    public List<RemoteController> getRemoteControllers() {
        return remoteControllerRepository.findAll();
    }


    public RemoteControllerDTO getRemoteController(Long id) {
        Optional<RemoteController> remoteControllerFound = remoteControllerRepository.findById(id);
        if (remoteControllerFound.isPresent()) {
            return RemoteControllerDTO.fromRemoteController(remoteControllerFound.get());
        } else {
            throw new RecordNotFoundException("Cannot find remote controller");
        }
    }

    public RemoteControllerDTO saveRemoteController(RemoteControllerDTO dto) {
        RemoteController remoteController = remoteControllerRepository.save(dto.toRemoteController());

        return RemoteControllerDTO.fromRemoteController(remoteController);
    }

    public void removeRemoteController (Long id) {
        Optional<RemoteController> remoteControllerfound = remoteControllerRepository.findById(id);
        if (remoteControllerfound.isPresent()) {
            remoteControllerRepository.delete(remoteControllerfound.get());
        } else {
            throw new RecordNotFoundException("Cannot find remote controller");
        }
    }

    public void updateRemoteController(Long id, RemoteControllerDTO remoteController) {
        Optional<RemoteController> remoteControllerFound = remoteControllerRepository.findById(id);
        if (remoteControllerFound.isPresent()) {

            RemoteController Original = remoteControllerFound.get();

            Original.setCompatibleWith(remoteController.getCompatibleWith());
            Original.setBatterytype(remoteController.getBatterytype());
            Original.setName(remoteController.getName());
            Original.setBrand(remoteController.getBrand());
            Original.setPrice(remoteController.getPrice());

            remoteControllerRepository.save(Original);
        } else {
            throw new RecordNotFoundException("Cannot find remote controller");
        }
    }
}
