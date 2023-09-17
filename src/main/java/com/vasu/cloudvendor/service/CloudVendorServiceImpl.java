package com.vasu.cloudvendor.service;

import com.vasu.cloudvendor.model.CloudVendor;
import com.vasu.cloudvendor.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }
    @Override
    public void createCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);

    }

    @Override
    public void updateCloudVendor(CloudVendor cloudVendor) {
            // Use save to update an existing entity
            cloudVendorRepository.save(cloudVendor);
    }


    @Override
    public void deleteCloudVendor(Long cloudVendorID) {
        cloudVendorRepository.deleteById(cloudVendorID);
    }

    @Override
    public CloudVendor getCloudVendor(Long cloudVendorID) {

        return    cloudVendorRepository.findById(cloudVendorID).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
