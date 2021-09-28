package PP1S22021.FRI1030PMGroup5.CarShareScheme.web;

import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.Car;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//public class CarController {

   // @GetMapping()
   // public List<Car> getCars() {
      //  System.out.println(("Cars"));
      //  return CarService.getCars();
  //  }

//}
