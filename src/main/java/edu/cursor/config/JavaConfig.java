//package edu.cursor.config;
//
//import edu.cursor.repository.UserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@AllArgsConstructor
//@ComponentScan("edu.cursor.repository.*")
//public class JavaConfig {
//
//    @Value("${app.test.url}")
//    private String url = "localhost:8081";
//
//
//    @Qualifier("UserRepositoryImpl2")
//    private final UserRepository userRepository;
//
////    public JavaConfig(UserRepository userRepository) {
////        this.userRepository = userRepository;
////    }
//}
