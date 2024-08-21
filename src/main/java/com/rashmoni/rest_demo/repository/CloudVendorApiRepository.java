package com.rashmoni.rest_demo.repository;

import com.rashmoni.rest_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorApiRepository extends JpaRepository<CloudVendor, String> {
}
