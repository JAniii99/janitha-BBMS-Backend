package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.Bloodstock;
import com.example.BBMS_Backend.Response.Bloodstockresponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface BloodStockRepository extends JpaRepository<Bloodstock,String> {
    @Query(value = "SELECT COUNT(*) FROM bloodcomponentdetails2 WHERE blood_group = ?1 AND blood_resus = ?2 ", nativeQuery = true)
    int findBloodStock(String bloodGroup, String resus);


}
