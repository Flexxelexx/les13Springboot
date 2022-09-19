package com.example.demo.Services;


import com.example.demo.Dtos.IdInputDTO;
import com.example.demo.Dtos.TelevisionDTO;
import com.example.demo.Repositories.RemoteControllerRepository;
import com.example.demo.Repositories.TelevisionRepository;
import com.example.demo.exceptions.RecordNotFoundException;
import com.example.demo.models.Television;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TelevisionService {

    private TelevisionRepository televisionRepository;

    private RemoteControllerRepository remoteControllerRepository;

    public TelevisionService(TelevisionRepository televisionRepository, RemoteControllerRepository remoteControllerRepository) {
        this.televisionRepository = televisionRepository;
        this.remoteControllerRepository = remoteControllerRepository;
    }

    public List<Television> getTelevisions() {
        return televisionRepository.findAll();
    }


    public TelevisionDTO getTelevision(Long id) {
        Optional<Television> televisionFound = televisionRepository.findById(id);
        if (televisionFound.isPresent()) {
            return TelevisionDTO.fromTelevision(televisionFound.get());
        } else {
            throw new RecordNotFoundException("Cannot find television");
        }
    }

    public TelevisionDTO saveTelevision(TelevisionDTO dto) {
        Television television = televisionRepository.save(dto.toTelevision());

        return TelevisionDTO.fromTelevision(television);
    }


    public void removeTelevision(Long id) {
        Optional<Television> televisionFound = televisionRepository.findById(id);
        if (televisionFound.isPresent()) {
            televisionRepository.delete(televisionFound.get());
        } else {
            throw new RecordNotFoundException("Cannot find television, sorry :-)!");
        }
    }



    public void updateTelevision(Long id, TelevisionDTO television) {
        Optional<Television> televisionFound = televisionRepository.findById(id);
        if (televisionFound.isPresent()) {

            Television Original = televisionFound.get();

            Original.setType(television.getType());
            Original.setBrand(television.getBrand());
            Original.setName(television.getName());
            Original.setScreenType(television.getScreenType());
            Original.setScreenQuality(television.getScreenQuality());

            Original.setPrice(television.getPrice());
            Original.setAvailableSize(television.getAvailableSize());
            Original.setRefreshRate(television.getRefreshRate());

            Original.setSmartTv(television.isSmartTv());
            Original.setWifi(television.isWifi());
            Original.setVoiceControl(television.isVoiceControl());
            Original.setHdr(television.isHdr());
            Original.setBluetooth(television.isBluetooth());
            Original.setAmbiLight(television.isAmbiLight());

            Original.setOriginalStock(television.getOriginalStock());
            Original.setSold(television.getSold());

            televisionRepository.save(Original);
        } else {
            throw new RecordNotFoundException("Cannot find television");
        }
    }

    public void updateRemoteController(Television televisionId, IdInputDTO id) {
    }
}

