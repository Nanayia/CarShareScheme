package PP1S22021.FRI1030PMGroup5.CarShareScheme.repositories;

import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car getById(Long id);
}
