package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckdonorRepo extends JpaRepository<Donor, String> {
    // Method to find donor by blood pack number
    @Query(value = "SELECT * FROM donor_details WHERE bloodpackertnumber=?1 ", nativeQuery = true)
   // @Query(value = "SELECT bloodpackertnumber,donorpname FROM donor_details WHERE bloodpackertnumber=?1 ", nativeQuery = true)
    Donor findByBloodpackertnumber(String bloodpackertnumber);
}
