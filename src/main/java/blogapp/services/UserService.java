package blogapp.services;

import blogapp.exception.BlogExceptions;
import blogapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import blogapp.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUpdateUser(User user) throws BlogExceptions {
        Optional<User> users = userRepository.findById(user.getUser_id());
        if (users.isPresent()) {
            User newuser = users.get();
            newuser.setEmail(user.getEmail());
            newuser.setUser_name(user.getUser_name());
            newuser.setImage_file(user.getImage_file());

            newuser = userRepository.save(newuser);
            return newuser;

        } else {

            user = userRepository.save(user);
            return user;
        }

    }

    public List<User> getAllUser() {
        List<User> userList = userRepository.findAll();

        if (userList.size() > 0) {
            return userList;
        } else {
            return new ArrayList<User>();
        }
    }


}
