package pl.franek.test.hotel.remote.rest.dto.common;

import java.util.List;

public class HotelDto {
    private Integer id;
    private String name;
    private List<RoomDto> rooms;

    public HotelDto(Integer id, String name, List<RoomDto> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }
}
