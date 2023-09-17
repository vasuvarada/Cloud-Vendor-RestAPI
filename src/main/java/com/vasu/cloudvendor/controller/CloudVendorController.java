package com.vasu.cloudvendor.controller;

import com.vasu.cloudvendor.model.CloudVendor;
import com.vasu.cloudvendor.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorController
{
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    CloudVendorService cloudVendorService;

    @GetMapping("/getCloudVendor/{CloudVendorID}")
    public CloudVendor getCloudVendor(@PathVariable("CloudVendorID") Long CloudVendorID)
    {
        return  cloudVendorService.getCloudVendor(CloudVendorID);
    }

    @GetMapping("/getAllCloudVendors")
    public List<CloudVendor> getAllCloudVendors()
    {
        return  cloudVendorService.getAllCloudVendors();
    }

    @PostMapping("/createCloudVendors")
    public String createCloudVendor(@RequestBody  CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return  "vendor details created successfully";
    }

    @PutMapping("/updateCloudVendor")
    public  String updateCloudVendor(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return  "cloudVendor updated successfully";
    }

    @DeleteMapping("/deleteCloudVendor/{CloudVendorID}")
    public  String deleteCloudVendor(@PathVariable("CloudVendorID") Long CloudVendorID)
    {
        cloudVendorService.deleteCloudVendor(CloudVendorID);
        return "vendor details deleted";
    }





}
