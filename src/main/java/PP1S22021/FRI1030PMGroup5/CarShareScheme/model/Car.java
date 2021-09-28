package PP1S22021.FRI1030PMGroup5.CarShareScheme.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.Date;


@Entity(name = "CarTable")

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Builder
public class Car  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "carName", columnDefinition = "TEXT")
    private String carName;

    @Column(name = "carModel", columnDefinition = "TEXT")
    private String carModel;

    @Column(name = "carColor", columnDefinition = "TEXT")
    private String carColor;

    @Column(name = "carPrice", columnDefinition = "TEXT")
    private String carPrice;


    public Car() {
    }

    public Long getId() {
        return id;
    }

    public String getcarName() {
        return carName;
    }

    public String getCarModel() { return carModel; }

    public String getCarColor() { return carColor; }

    public String getCarPrice() {
        return carPrice;
    }

    public void setID(Long id) {this.id = id;}

    public void setgetcarName (String carName) {this.carName = carName;}

    public void setgetcarModel (String carModel) {this.carModel = carModel;}

    public void setgetcarColor (String carColor) {this.carColor = carColor;}

    public void setgetcarPrice (String carPrice) {this.carPrice = carPrice;}
}