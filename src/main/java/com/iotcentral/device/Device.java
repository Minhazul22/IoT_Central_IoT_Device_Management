package com.iotcentral.device;

import java.util.UUID;

public class Device {
    private String name;
    private UUID id;
    private DeviceStatus status;

    /// constructor
    public Device(String name, UUID id){
        this.name = name;
        this.id = id;
        this.status = DeviceStatus.OFFLINE;
    }

    /// getter methods
    public String getName(){
        return name;
    }

    public UUID getId(){
        return id;
    }
    public DeviceStatus getStatus(){
        return status;
    }

    //setter method to update status
    public void setStatus(DeviceStatus newStatus){
        this.status = newStatus;
    }










}//1st curly brace
