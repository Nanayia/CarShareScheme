package PP1S22021.FRI1030PMGroup5.CarShareScheme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.Date;


@Entity(name = "BookTable")
@NoArgsConstructor
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
    private String dropoffDate;



    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getpickUp() { return pickUp; }

    public String getdropOff() { return dropOff; }


}


