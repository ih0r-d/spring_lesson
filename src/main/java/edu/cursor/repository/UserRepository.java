package edu.cursor.repository;

import java.util.List;

public interface UserRepository {
    List<String> findAllNames();
    String getOne();
}
