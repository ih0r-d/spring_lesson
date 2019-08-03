package edu.cursor.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl2 implements UserRepository {

    @Override
    public List<String> findAllNames() {
        return List.of("Ivan", "Bogdan");
    }

    @Override
    public String getOne() {
        return "Ivan";
    }
}
