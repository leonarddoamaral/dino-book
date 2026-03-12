package com.example.demo.dinossaur;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinossaurRepository extends JpaRepository<Dinossaur, Long> {

}
