package com.springboot.springbootapidemo.repository;

import com.springboot.springbootapidemo.data.Native;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NativeRepository extends JpaRepository<Native, String> {

}
