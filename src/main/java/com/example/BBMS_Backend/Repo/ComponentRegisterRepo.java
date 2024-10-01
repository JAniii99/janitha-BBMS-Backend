package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.BloodComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ComponentRegisterRepo extends JpaRepository<BloodComponent , String> {

    BloodComponent findByBloodpackertnumber(String bloodpackertnumber);
}
