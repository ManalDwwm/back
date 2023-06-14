package com.JynInfoConseil.Gestion_Donateurs.dtos;

import com.JynInfoConseil.Gestion_Donateurs.enums.Devise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonateurDTO {
    private Long id;
    private String nom;

    private String prenom;

    private String email;
    private String adresse;

    private Double montant;
    @Enumerated(EnumType.STRING)
    private Devise devise;
    private Date date;
}
