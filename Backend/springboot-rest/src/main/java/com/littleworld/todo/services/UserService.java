
package com.littleworld.todo.services;

import com.littleworld.todo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService extends CrudRepository<User, Integer > {
    Iterable<User> findByUsernameAndPassword(String username, String password);
    Iterable<User> findByUsername(String username);
}