package redis_springboot_demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/a")
public class UserController {
    @Autowired
    private  UserRepository userRepository;


    @Cacheable(value = "users")
    @GetMapping
    public List<User> getUser() {
        System.out.println("geldii");
        return userRepository.findAll();
    }
}
