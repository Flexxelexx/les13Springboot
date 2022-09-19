package com.example.demo.Services;


import com.example.demo.Dtos.WallbracketDTO;
import com.example.demo.Repositories.WallBracketRepository;
import com.example.demo.exceptions.RecordNotFoundException;
import com.example.demo.models.WallBracket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WallbracketService {

    @Autowired
    private WallBracketRepository wallBracketRepository;

    public List<WallBracket> getWallBrackets() {
        return wallBracketRepository.findAll();
    }

    public WallbracketDTO getWallbracket(Long id) {
        Optional<WallBracket> wallBracketFound = wallBracketRepository.findById(id);
        if (wallBracketFound.isPresent()) {
            return WallbracketDTO.fromWallbracket(wallBracketFound.get());
        } else {
            throw new RecordNotFoundException("Cannot find wallbracket");
        }
    }

    public WallbracketDTO saveWallbracket(WallbracketDTO dto) {
        WallBracket wallBracket = wallBracketRepository.save(dto.toWallbracket());

        return WallbracketDTO.fromWallbracket(wallBracket);
    }

    public void removeWallbracket(Long id) {
        Optional<WallBracket> wallbracketFound = wallBracketRepository.findById(id);
        if (wallbracketFound.isPresent()) {
            wallBracketRepository.delete(wallbracketFound.get());
        } else {
            throw new RecordNotFoundException("Cannot find wallbracket");
        }
    }

    public void updateWallbracket (Long id, WallbracketDTO wallbracket) {
        Optional<WallBracket> wallbracketFound = wallBracketRepository.findById(id);
        if (wallbracketFound.isPresent()) {

            WallBracket Original = wallbracketFound.get();

            Original.setSize(wallbracket.getSize());
            Original.setName(wallbracket.getName());
            Original.setPrice(wallbracket.getPrice());
            Original.setAdjustable(wallbracket.isAdjustable());

            wallBracketRepository.save(Original);
        } else {
            throw new RecordNotFoundException("Cannot find wallbracket!");
        }
    }
}
