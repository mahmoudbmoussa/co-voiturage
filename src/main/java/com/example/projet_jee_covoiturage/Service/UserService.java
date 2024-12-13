package com.example.projet_jee_covoiturage.Service;

import com.example.projet_jee_covoiturage.Model.User;
import com.example.projet_jee_covoiturage.dto.RegistrationDto;

public interface UserService {
    User auth(String email, String password);

    void save(RegistrationDto user);

    boolean existsByEmail(String email);
    User getCurrentUser();
}
