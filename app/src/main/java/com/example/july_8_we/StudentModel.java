package com.example.july_8_we;

public class StudentModel {
    private String name;
    private int age;
    private String address;
    private String dob;
    private int imageId;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDOB() {
        return dob;
    }

    public int getImageId() {
        return imageId;
    }

    public StudentModel(String name, int age, String address, int imageId, String dob){
        this.address=address;
        this.age=age;
        this.dob=dob;
        this.imageId=imageId;
        this.name=name;
    }
}
