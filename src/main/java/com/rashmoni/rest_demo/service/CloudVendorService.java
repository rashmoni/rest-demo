package com.rashmoni.rest_demo.service;

import com.rashmoni.rest_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public CloudVendor fetchCloudVendor(String cloudVendorId);
    public String deleteCloudVendor(String cloudVendorId);
    public List<CloudVendor> fetchAllCloudVendors();
}
