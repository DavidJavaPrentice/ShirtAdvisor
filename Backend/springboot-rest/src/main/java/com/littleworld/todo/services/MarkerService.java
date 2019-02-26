
package com.littleworld.todo.services;

import com.littleworld.todo.model.Marker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerService extends CrudRepository<Marker, Integer> {

}
