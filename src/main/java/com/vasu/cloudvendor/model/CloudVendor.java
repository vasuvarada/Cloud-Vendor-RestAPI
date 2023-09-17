package com.vasu.cloudvendor.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Entity
@Table(name="cloud-vendor")
public class CloudVendor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vendorID;
    @Column
    private  String vendorName;
    @Column
    private String vendorAddress;
    @Column
    private  long vendorPhoneNumber;

    public CloudVendor() {

    }

    @JsonCreator
    public CloudVendor(@JsonProperty("vendorID") long vendorID, @JsonProperty("vendorName") String vendorName,@JsonProperty("vendorAddress")  String vendorAddress, @JsonProperty("vendorPhoneNumber") long vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public long getVendorID() {
        return vendorID;
    }

    public void setVendorID(long vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public long getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(long vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }




}
