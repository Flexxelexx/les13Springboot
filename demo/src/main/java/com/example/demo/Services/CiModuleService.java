package com.example.demo.Services;


import com.example.demo.Dtos.CiModuleDTO;
import com.example.demo.Repositories.CiModuleRepository;
import com.example.demo.exceptions.RecordNotFoundException;
import com.example.demo.models.CiModule;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiModuleService {

    @Autowired
    private CiModuleRepository ciModuleRepository;

    public List<CiModule> getCiModules() {
        return ciModuleRepository.findAll();
    }

    public CiModuleDTO getCiModules(Long id) {
        Optional<CiModule> ciModuleFound = ciModuleRepository.findById(id);
        if (ciModuleFound.isPresent()) {
            return CiModuleDTO.fromCiModule(ciModuleFound.get());
        } else {
            throw new RecordNotFoundException("Cannot find CI module");
        }
    }

    public CiModuleDTO saveCiModule(CiModuleDTO dto) {
        CiModule ciModule = ciModuleRepository.save(dto.toCiModule());

        return CiModuleDTO.fromCiModule(ciModule);
    }

    public void removeCiModule (Long id) {
        Optional<CiModule> ciModulefound = ciModuleRepository.findById(id);
        if (ciModulefound.isPresent()) {
            ciModuleRepository.delete(ciModulefound.get());
        } else {
            throw new RecordNotFoundException("Cannot find ciModule");
        }
    }


    public void updateCiModule(Long id, CiModuleDTO ciModule) {
        Optional<CiModule> ciModulefound = ciModuleRepository.findById(id);
        if (ciModulefound.isPresent()) {

            CiModule Original = ciModulefound.get();

            Original.setName(ciModule.getName());
            Original.setType(ciModule.getType());
            Original.setPrice(ciModule.getPrice());

            ciModuleRepository.save(Original);
        } else {
            throw new RecordNotFoundException("Cannot find ciModule");
        }
    }


}
