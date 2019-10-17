package com.tw.apistackbase.repository;

import com.tw.apistackbase.entity.Prosecutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProsecutorRepo extends JpaRepository<Prosecutor, String> {


}
