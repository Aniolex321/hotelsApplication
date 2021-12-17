package pl.franek.test.hotel.remote.rest.dto.response;

import pl.franek.test.hotel.remote.rest.dto.common.HotelDto;
import java.util.List;

public class HotelListDto {
    private List<HotelDto> hotels;

    public HotelListDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
