package impl;

import com.example.projet_jee_covoiturage.Model.User;
import com.example.projet_jee_covoiturage.Repository.UserRepository;
import com.example.projet_jee_covoiturage.Service.UserService;
import com.example.projet_jee_covoiturage.dto.RegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User auth(String email, String password) {
        return userRepository.findByEmailAndMotDePasse(email, password).orElse(null);
    }

    @Override
    public void save(RegistrationDto user) {
        User u = new User();
        u.setEmail(user.getEmail());
        u.setMotDePasse(user.getMotDePasse());
        u.setNom(user.getNom());
        u.setMotDePasse(user.getMotDePasse());
        u.setRole(user.getRole());
        u.setNoteMoyenne(user.getNoteMoyenne());
        u.setId(user.getId());
        userRepository.save(u);
    }

    @Override
    public boolean existsByEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    @Override
    public User getCurrentUser() {
        return userRepository.findByEmail("<EMAIL>").orElse(null);
    }
}
