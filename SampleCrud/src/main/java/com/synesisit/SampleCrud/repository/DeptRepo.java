package com.synesisit.SampleCrud.repository;

import com.synesisit.SampleCrud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Department,Long> {


}
