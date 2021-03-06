package PP1S22021.FRI1030PMGroup5.CarShareScheme.configurations;

import PP1S22021.FRI1030PMGroup5.CarShareScheme.repositories.UserRepository;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class UserConfig {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    @Bean(name = "userCreateBean")
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User user1 = User.builder()
                    .username("fofmsan")
                    .firstName("aww")
                    .lastName("aagg")
                    .email("abcsss@hotmail.com")
                    .password("SECUREPASSWORD")
                    .phone("1234567890")
                    .accountType("Admin")
                    .build();
            User user2 = User.builder()
                    .username("GrayFox")
                    .firstName("Frank")
                    .lastName("Jaegar")
                    .email("frankjaegar@gmail.com")
                    .password("SECUREPASSWORD")
                    .phone("0000555999")
                    .abn("An ABN")
                    .accountType("Regular")
                    .build();
            User user3 = User.builder()
                    .username("FROOSH")
                    .firstName("John")
                    .lastName("Frusciante")
                    .email("jf@gmail.com")
                    .password("SECUREPASSWORD")
                    .phone("0000555999")
                    .accountType("Publisher")
                    .build();
            User user4 = User.builder()
                    .username("LetsAGo")
                    .firstName("Mario")
                    .lastName("Luigi")
                    .email("itsame@gmail.com")
                    .password("SECUREPASSWORD")
                    .phone("5463456634")
                    .abn("An ABN")
                    .accountType("Regular")
                    .build();

            if (repository.getByEmail(user1.getEmail()).isPresent()) {
                System.out.println("User already exists");
            } else {
                repository.save(user1);
            }
            if (repository.getByEmail(user2.getEmail()).isPresent()) {
                System.out.println("User already exists");
            } else {
                repository.save(user2);
            }
            if (repository.getByEmail(user3.getEmail()).isPresent()) {
                System.out.println("User already exists");
            } else {
                repository.save(user3);
            }
            if (repository.getByEmail(user4.getEmail()).isPresent()) {
                System.out.println("User already exists");
            } else {
                repository.save(user4);
            }
        };
    }
}


