package org.example.spring.repo;

import org.example.spring.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepo extends CrudRepository<Place, Long> {
}
