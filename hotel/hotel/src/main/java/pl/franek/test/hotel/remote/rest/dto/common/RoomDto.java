package pl.franek.test.hotel.remote.rest.dto.common;

public class RoomDto {
    private Integer bed_count;
    private double price;

    public RoomDto(Integer id, Integer bed_count, double price) {
        this.id = id;
        this.bed_count = bed_count;
        this.price = price;
    }
}
