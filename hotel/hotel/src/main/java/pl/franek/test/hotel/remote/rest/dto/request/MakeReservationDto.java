package pl.franek.test.hotel.remote.rest.dto.request;

import pl.franek.test.hotel.remote.rest.dto.common.PersonDto;
import pl.franek.test.hotel.remote.rest.dto.common.ReservationDto;

import java.util.List;

public class MakeReservationDto {
    private List<ReservationDto> reservations;
    private PersonDto person;

    public MakeReservationDto(List<ReservationDto> reservations, PersonDto person) {
        this.reservations = reservations;
        this.person = person;
    }
}
