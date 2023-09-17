package com.vasu.cloudvendor.service;

import com.vasu.cloudvendor.model.CloudVendor;

import java.util.List;

public interface CloudVendorService
{
    public void createCloudVendor(CloudVendor cloudVendor);
    public  void updateCloudVendor(CloudVendor cloudVendor);

    public  void deleteCloudVendor(Long cloudVendorID);

    public  CloudVendor getCloudVendor(Long cloudVendorID);

    public List<CloudVendor> getAllCloudVendors();
}
