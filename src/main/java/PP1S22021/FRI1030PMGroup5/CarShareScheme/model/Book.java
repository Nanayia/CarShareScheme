package PP1S22021.FRI1030PMGroup5.CarShareScheme.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "BookTable")

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "userID",  columnDefinition = "TEXT")
    private String userID;

    @Column(name = "carType", columnDefinition = "TEXT")
    private String carType;

    @Column(name = "pickUp", columnDefinition = "TEXT")
    private String pickUp;

    @Column(name = "dropOff", columnDefinition = "TEXT")
    private String dropOff;

    @Column(name = "pickupDate", columnDefinition = "DATE")
    private Date pickupDate;

    @Column(name = "dropoffDate", columnDefinition = "Date")
    private Date dropoffDate;



    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getuserID() {
        return userID;
    }

    public String getcarType() {return carType;}

    public String getpickUp() { return pickUp; }

    public String getdropOff() { return dropOff; }

    public Date getPickupDate() { return pickupDate; }

    public Date getdropoffDate() { return dropoffDate; }

    public void setID(Long id) {this.id = id;}

    public void setUserID (String userID) {this.userID = userID;}

    public void setCarType (String carType) {this.carType = carType;}

    public void setPickUp (String pickUp) {this.pickUp = pickUp;}

    public void setDropOff (String dropOff) {this.dropOff = dropOff;}

    public void setpickupDate (Date pickupDate) {this.pickupDate = pickupDate;}

    public void setdropoffDate (Date dropoffDate) {this.dropoffDate = dropoffDate;}



}


