package com.rajni.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajni.task.NumberEntity;

@Repository
public interface NumberRepository extends JpaRepository<NumberEntity, Long>{

}
