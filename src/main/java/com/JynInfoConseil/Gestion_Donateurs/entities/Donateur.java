package com.JynInfoConseil.Gestion_Donateurs.entities;
import com.JynInfoConseil.Gestion_Donateurs.enums.Devise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Donateur extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotNull
    @NotEmpty
    @Size(min = 2, message = "minimum 2 lettres pour le nom")
    private String nom;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 2, message = "minimum 2 lettres pour le prenom")
    private String prenom;
    @Email
    private String email;
    @NotNull
    @NotBlank
    @NotEmpty
    @Size(min = 2, message = "minimum 2 lettres pour l'adresse ")
    private String adresse;
    @Positive
    private Double montant;
    @Enumerated(EnumType.STRING)
    private Devise devise;
}
