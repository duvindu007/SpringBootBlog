package services;

import exception.BlogExceptions;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUpdateUser(User user) throws BlogExceptions {
        Optional<User> users = userRepository.findById(user.getUser_id());
    }


}
