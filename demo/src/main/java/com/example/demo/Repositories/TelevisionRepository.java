package com.example.demo.Repositories;

import com.example.demo.models.Television;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelevisionRepository extends JpaRepository <Television, Long> {
}
