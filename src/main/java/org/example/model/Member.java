package org.example.model;

public class Member {
    private String name;
    private int age;
    private String birthDate;
    private String phone;
    private String address;
    private boolean isMarried;

    public Member() {
    }

    public Member(String name, int age, String birthDate, String phone, String address, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
