package com.cooper.passwordmanager.repository;

import com.cooper.passwordmanager.model.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Integer> {



}
