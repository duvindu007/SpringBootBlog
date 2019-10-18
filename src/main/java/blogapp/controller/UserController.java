package blogapp.controller;

import blogapp.exception.BlogExceptions;
import blogapp.model.Greeting;
import blogapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import blogapp.services.UserService;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    UserService service;

    @PostMapping("/addnew")
    public ResponseEntity<User> createUpdateUser(User user) throws BlogExceptions {
        User updated = service.createUpdateUser(user);
        return new ResponseEntity<User>(updated, new HttpHeaders(), HttpStatus.OK);
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @GetMapping("/userall")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> userList = service.getAllUser();
        return new ResponseEntity<List<User>>(userList, new HttpHeaders(), HttpStatus.OK);

    }

}
