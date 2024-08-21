package com.rashmoni.rest_demo.impl;

import com.rashmoni.rest_demo.exception.CloudVendorNotFoundException;
import com.rashmoni.rest_demo.model.CloudVendor;
import com.rashmoni.rest_demo.repository.CloudVendorApiRepository;
import com.rashmoni.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorApiRepository cloudVendorApiRepository;

    public CloudVendorServiceImpl(CloudVendorApiRepository cloudVendorApiRepository) {
        this.cloudVendorApiRepository = cloudVendorApiRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorApiRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorApiRepository.save(cloudVendor);
        return "Success";

    }

    @Override
    public CloudVendor fetchCloudVendor(String cloudVendorId) {
        if(cloudVendorApiRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested cloud vendor does not exists");
        return cloudVendorApiRepository.findById(cloudVendorId).get();

    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorApiRepository.deleteById(cloudVendorId);
        return "success";
    }

    @Override
    public List<CloudVendor> fetchAllCloudVendors() {
        return cloudVendorApiRepository.findAll();
    }
}
