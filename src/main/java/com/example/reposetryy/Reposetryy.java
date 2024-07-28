package com.example.reposetryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserEntity;
@Repository
public interface Reposetryy extends JpaRepository<UserEntity, Long> {

}
