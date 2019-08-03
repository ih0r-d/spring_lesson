package edu.cursor.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<String> findAllNames() {
        return List.of("Ivan", "Nazar");
    }

    @Override
    public String getOne() {
        return "Nazar";
    }
}
