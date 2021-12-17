package pl.franek.test.hotel.database;

public class Person {
    private String name;
    private String phone_number;
    private String address;
    private String email_address;

    public Person(String name, String phone_number, String address, String email_address) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.email_address = email_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}
