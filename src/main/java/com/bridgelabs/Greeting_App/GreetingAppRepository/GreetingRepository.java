package com.bridgelabs.Greeting_App.GreetingAppRepository;

import com.bridgelabs.Greeting_App.entity.GreetingAppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingAppEntity,Integer> {
    Optional<GreetingAppEntity> findByName(String firstname);
}
