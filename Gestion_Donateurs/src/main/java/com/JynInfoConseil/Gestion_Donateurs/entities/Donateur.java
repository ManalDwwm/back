package com.JynInfoConseil.Gestion_Donateurs.entities;

import com.JynInfoConseil.Gestion_Donateurs.enums.Devise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Donateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
