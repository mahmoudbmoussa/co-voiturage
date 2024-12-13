package com.example.projet_jee_covoiturage.Repository;

import com.example.projet_jee_covoiturage.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndMotDePasse(String email, String motDePasse);
}
