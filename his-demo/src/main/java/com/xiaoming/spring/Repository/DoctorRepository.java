package com.xiaoming.spring.Repository;

import com.xiaoming.spring.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
