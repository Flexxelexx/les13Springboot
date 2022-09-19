package com.example.demo.Repositories;

import com.example.demo.models.RemoteController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoteControllerRepository extends JpaRepository <RemoteController, Long> {
}
