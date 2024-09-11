package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface DonorRegisterRepo extends JpaRepository<Donor,String> {
}
