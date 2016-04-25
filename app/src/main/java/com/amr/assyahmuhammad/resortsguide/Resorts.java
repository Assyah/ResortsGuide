package com.amr.assyahmuhammad.resortsguide;


public class Resorts {
    private String resortName, description, services, resortNumber, price, path;
    int position;

    public Resorts(String []resortName,String []description,String []services,String []resortNumber,
                   String []price,String []path){
        this.setResortName(resortName[position]);
        this.setDescription(description[position]);
        this.setServices(services[position]);
        this.setResortNumber(resortNumber[position]);
        this.setPrice(price[position]);
        this.setPath(path[position]);
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }
    public String getResortName() {
        return resortName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public void setServices(String services) {
        this.services = services;
    }
    public String getServices() {
        return services;
    }

    public void setResortNumber(String resortNumber) {
        this.resortNumber = resortNumber;
    }
    public String getResortNumber() {
        return resortNumber;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() {
        return price;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }
}
