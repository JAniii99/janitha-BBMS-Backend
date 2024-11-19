package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.BloodComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodComponentRepository extends JpaRepository<BloodComponent, String> {
    // JpaRepository already includes the method for fetching all records.
}
