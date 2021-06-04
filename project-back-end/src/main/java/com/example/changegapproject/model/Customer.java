package com.example.changegapproject.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {

    private String _id;

    private String name;
    private String address;
    private int phone;
    private String country;

    public Customer(){
        super();
    }

    public Customer(String _id, String name, String address, int phone, String country) {
        this._id = _id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.country = country;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
