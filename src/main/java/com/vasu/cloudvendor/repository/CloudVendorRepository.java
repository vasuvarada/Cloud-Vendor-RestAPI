package com.vasu.cloudvendor.repository;

import com.vasu.cloudvendor.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,Long> {
}
