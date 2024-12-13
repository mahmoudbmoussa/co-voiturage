package com.example.projet_jee_covoiturage.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegistrationDto {
    private Long id;
    private String nom;
    private String email;
    private String motDePasse;
    private String role;
    private Double noteMoyenne;
}
