package com.ilrick.springstudy.repository;

import com.ilrick.springstudy.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
