package PP1S22021.FRI1030PMGroup5.CarShareScheme.services;


import PP1S22021.FRI1030PMGroup5.CarShareScheme.repositories.UserRepository;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.exceptions.UsernameAlreadyExistsException;
import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalStateException("User with Id " + id + " does not exist");
        }
        userRepository.deleteById(id);
    }

    public User saveUser (User newUser){

      /*  newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        // Username has to be unique (exception)
        // Make sure that password and confirmPassword match
        // We don't persist or show the confirmPassword
        return userRepository.save(newUser);
       */
        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            //Username has to be unique (exception)
            newUser.setUsername(newUser.getUsername());
            // Make sure that password and confirmPassword match
            // We don't persist or show the confirmPassword
            newUser.setConfirmPassword("");
            return userRepository.save(newUser);

        }catch (Exception e){
            throw new UsernameAlreadyExistsException("Username '"+newUser.getUsername()+"' already exists");
        }

    }

    @Transactional //username and password
    public void updateUser(Long id, String firstName, String lastName, String email, String phone, String abn) {
        User user = userRepository.findById(id).orElseThrow(() ->
                new IllegalStateException("User with Id " + id + " does not exist"));

        if (firstName != null && firstName.length() > 0 && !Objects.equals(user.getFirstName(), firstName)) {
            user.setFirstName(firstName);
        }
        if (lastName != null && lastName.length() > 0 && !Objects.equals(user.getLastName(), lastName)) {
            user.setLastName(lastName);
        }
        if (email != null && email.length() > 0 && !Objects.equals(user.getEmail(), email)) {
            if (userRepository.getByEmail(email).isPresent()) {
                throw new IllegalStateException("Email already in use");
            }
            user.setEmail(email);
        }
        if (phone != null && phone.length() > 0 && !Objects.equals(user.getPhone(), phone)) {
            user.setPhone(phone);
        }
        if (abn != null && abn.length() > 0 && !Objects.equals(user.getAbn(), abn)) {
            user.setAbn(abn);
        }
    }


}
