package com.sunglowsys.domain;

public class Address {
    private Long id;
    private String addressLine1;
    private String getAddressLine2;
    private String landMark;
    private String state;
    private String zipCode;


    public Address(){
        System.out.println ("address object create successfully");
    }

    public Address(Long id, String addressLine1, String getAddressLine2, String landMark, String state, String zipCode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.getAddressLine2 = getAddressLine2;
        this.landMark = landMark;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public void setGetAddressLine2(String getAddressLine2) {
        this.getAddressLine2 = getAddressLine2;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void checkAddress(){
        System.out.println ("id:"+1001);
        System.out.println ("addressLine1:"+"mirehchi");
        System.out.println ("addressLine2:"+"mirehchi");
        System.out.println ("landMark:"+"etah");
        System.out.println ("state:" + "uttarpradesh");
        System.out.println ("zipCodd:"+"207125");
    }
}
