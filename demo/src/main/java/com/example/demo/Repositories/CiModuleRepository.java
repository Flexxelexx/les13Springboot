package com.example.demo.Repositories;


import com.example.demo.models.CiModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiModuleRepository extends JpaRepository <CiModule, Long> {
}
