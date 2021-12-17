package pl.franek.test.hotel.remote.rest.dto.response;

import pl.franek.test.hotel.remote.rest.dto.common.PersonDto;
import pl.franek.test.hotel.remote.rest.dto.common.ReservationDto;
import pl.franek.test.hotel.remote.rest.dto.common.ReservationStatus;

import java.util.List;

public class ReservationStatusDto {
    private Integer id;
    private ReservationStatus status;
    private List<ReservationDto> reservations;
    private PersonDto person;

    public ReservationStatusDto(Integer id, ReservationStatus status, List<ReservationDto> reservations, PersonDto person) {
        this.id = id;
        this.status = status;
        this.reservations = reservations;
        this.person = person;
    }
}
