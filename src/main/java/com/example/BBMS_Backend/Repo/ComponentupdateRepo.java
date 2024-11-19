package com.example.BBMS_Backend.Repo;

import com.example.BBMS_Backend.Entity.BloodComponent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ComponentupdateRepo extends JpaRepository<BloodComponent , String> {

    //@Query(value = "select * from bloodcomponentdetails2 bc1_0 where bc1_0.bloodpackertnumber=?")
    //SELECT bloodpackertnumber FROM bloodcomponentdetails2 WHERE eid IN (SELECT eid FROM bloodcomponentdetails2 WHERE bloodpackertnumber = ?1);
    @Query(value = "SELECT * FROM bloodcomponentdetails2 WHERE bloodpackertnumber=?1 AND eid IN (SELECT eid FROM bloodcomponentdetails2 WHERE bloodpackertnumber = ?1)", nativeQuery = true)
    // @Query(value = "SELECT bloodpackertnumber, blood_group, blood_resus, buffycoatdateofexpire,buffycoatdateofmanufacture, buffycoatvolume, donorpname,ffpdateofexpire, ffpdateofmanufacture, ffpvolume, fname,packertserialnumber, packerttype, plateletdateofexpire,plateletdateofmanufacture, plateletvolume, rccdateofexpire,rccdateofmanufacture, rccvolume FROM bloodcomponentdetails2 WHERE bloodpackertnumber = ?1;", nativeQuery = true)
    BloodComponent findByBloodpacknumber(String bloodpackertnumber);

}
