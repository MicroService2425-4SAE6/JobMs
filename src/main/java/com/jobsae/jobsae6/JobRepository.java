package com.jobsae.jobsae6;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends  JpaRepository<Job , Integer> {
}
