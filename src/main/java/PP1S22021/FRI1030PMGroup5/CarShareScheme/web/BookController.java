package PP1S22021.FRI1030PMGroup5.CarShareScheme.web;

import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.Book;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

//public class BookController {


  //  @GetMapping()
   // public List<Book> getBooks() {
       // System.out.println(("Booking"));
        //return BookService.getBooks();
  //  }



//}
