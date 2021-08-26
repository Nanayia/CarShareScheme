package PP1S22021.FRI1030PMGroup5.CarShareScheme.validator;

import PP1S22021.FRI1030PMGroup5.CarShareScheme.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        User user = (User) object;

        if(user.getPassword().length() <6){
            errors.rejectValue("password","Length", "Password must be at least 6 characters");
            System.out.println("PASSWORD IS TOO SHORT. MUST BE OVER 6");
        }

        if(!user.getPassword().equals(user.getConfirmPassword())){
            errors.rejectValue("confirmPassword","Match", "Passwords must match");
            System.out.println("PASSWORDS DO NOT MATCH");
        }

        //confirmPassword

    }
}
