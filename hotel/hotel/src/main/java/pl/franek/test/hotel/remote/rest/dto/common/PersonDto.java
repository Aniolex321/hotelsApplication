package pl.franek.test.hotel.remote.rest.dto.common;

public class PersonDto {
    private String name;
    private String phone_number;
    private String address;
    private String email;

    public PersonDto(String name, String phone_number, String address, String email) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.email = email;
    }
}
