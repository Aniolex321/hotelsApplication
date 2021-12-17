package pl.franek.test.hotel.remote.rest.dto.common;

public class ReservationDto {
    private Integer id;
    private Integer room_id;
    private Integer days;

    public ReservationDto(Integer id, Integer room_id, Integer days) {
        this.id = id;
        this.room_id = room_id;
        this.days = days;
    }
}
