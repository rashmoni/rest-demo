package com.rashmoni.rest_demo.controller;

import com.rashmoni.rest_demo.model.CloudVendor;
import com.rashmoni.rest_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiController {



    CloudVendorService cloudVendorService;

    public CloudVendorApiController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/vendor/{vendorId}")
    public CloudVendor fetchCloudVendorDetails(@PathVariable("vendorId") String vendorId){

        return cloudVendorService.fetchCloudVendor(vendorId);
    }

    @GetMapping("/vendors")
    public List<CloudVendor> fetchAllCloudVendorDetails(){
        return cloudVendorService.fetchAllCloudVendors();
    }

    @PostMapping("/vendor")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
       cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor successfully created";
    }
    @PutMapping("/vendor")
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor successfully updated";
    }
    @DeleteMapping("/vendor/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor successfully deleted";
    }

}
