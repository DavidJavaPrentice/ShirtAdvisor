
package com.littleworld.todo.services;

import com.littleworld.todo.model.Rating;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RatingService extends CrudRepository<Rating, Integer> {


    @Query(value = "select * from rating where user_id = :id", nativeQuery=true)

    List<Rating> findByUseridNativeQuery(int id);
}