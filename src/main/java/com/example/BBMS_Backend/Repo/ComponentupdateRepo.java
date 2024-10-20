package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.BloodComponent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentupdateRepo extends JpaRepository<BloodComponent , String> {

    BloodComponent findByBloodpackertnumber(String bloodpackertnumber);
}
