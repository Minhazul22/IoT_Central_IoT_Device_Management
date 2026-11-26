package com.iotcentral.device;

import java.util.UUID;
import java.util.ArrayList;

public class Main {



public static void main(String[] args){
   //Object creation
    Device device_1 =  new Device("TemperatureSensor", UUID.randomUUID());
    Device device_2 =  new Device("HumiditySensor", UUID.randomUUID());
    Device device_3 =  new Device("VoltageSensor", UUID.randomUUID());
    Device device_4 =  new Device("PressureSensor", UUID.randomUUID());

        // ArrayList<Device> to store objects.
    ArrayList<Device> items = new ArrayList<>();

    items.add(device_1);
    items.add(device_2);
    items.add(device_3);
    items.add(device_4);


    //setting two devices online to test
    items.get(0).setStatus(DeviceStatus.ONLINE);
    items.get(1).setStatus(DeviceStatus.ONLINE);




    int count = 0;
// A for loop to iterate through the list
    for (int i = 0; i < items.size(); i++){
        System.out.println("device " + (i + 1) + "name: " + items.get(i).getName());

        System.out.println("Device" + (i+1) + "status: " + items.get(i).getStatus());
  // An if condition to check device status.
        if (items.get(i).getStatus() == DeviceStatus.ONLINE){
            count++;
        }

//Display their information.
        System.out.println("Number of Devices that are ONLINE: " + count);
        System.out.println("Total Number of Registered Devices: " + items.size());

    }






}






}//1st curly brace
