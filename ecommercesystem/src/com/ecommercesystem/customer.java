package com.ecommercesystem;

public class customer extends account {

    private String phonenumber;
    private String address;
    private cart mycart;

    public customer(String username, String password, String phonenumber, String address) {
        super(username, password);
        this.phonenumber = phonenumber;
        this.address = address;
    }

    @Override
    public void signin() {
        //proceed to main page
    }

    public void register(){
        //adds customer account to database
    }

}
