package PP1S22021.FRI1030PMGroup5.CarShareScheme.services;


import PP1S22021.FRI1030PMGroup5.CarShareScheme.repositories.CarRepository;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Autowired

    public List<Car> getCars() {
        return carRepository.findAll();
    }
}