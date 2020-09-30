package redis_springboot_demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoApplication implements CommandLineRunner {
    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User Hasan = new User("Hasan");
        User Oğulcan = new User("Oğulcan");
        User Ferhat = new User("Ferhat");
        userRepository.save(Hasan);
        userRepository.save(Oğulcan);
        userRepository.save(Ferhat);

    }

    @Autowired
    public DemoApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
