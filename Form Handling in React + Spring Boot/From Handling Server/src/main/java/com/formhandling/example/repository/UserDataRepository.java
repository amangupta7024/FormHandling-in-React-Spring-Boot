package com.formhandling.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formhandling.example.entity.UserData;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, String>  {

}
