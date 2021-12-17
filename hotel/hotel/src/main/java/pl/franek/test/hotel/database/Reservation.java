package pl.franek.test.hotel.database;

import pl.franek.test.hotel.remote.rest.dto.common.ReservationStatus;

import java.util.List;

public class Reservation {
    private Integer id;
    private ReservationStatus status;
    private List<Room> rooms;
    private Person person;

    public Reservation(Integer id, ReservationStatus status, List<Room> rooms, Person person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
