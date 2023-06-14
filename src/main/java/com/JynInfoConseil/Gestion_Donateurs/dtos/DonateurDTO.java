package com.JynInfoConseil.Gestion_Donateurs.dtos;

import com.JynInfoConseil.Gestion_Donateurs.enums.Devise;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonateurDTO {
    private Long id;
    @NotEmpty
    @Size(min = 2, message = "2 characters minimum")
    private String nom;

    private String prenom;
    @NotEmpty
    @Email

    private String email;
    private String adresse;

    private Double montant;
    @Enumerated(EnumType.STRING)
    private Devise devise;
    private Date date;
}
