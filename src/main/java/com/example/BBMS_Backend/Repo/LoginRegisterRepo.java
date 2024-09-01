package com.example.BBMS_Backend.Repo;
import com.example.BBMS_Backend.Entity.LoginRegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface LoginRegisterRepo extends JpaRepository<LoginRegisterEntity,Integer> {
    LoginRegisterEntity findByUname(String uname);


}
