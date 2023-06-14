package com.JynInfoConseil.Gestion_Donateurs.services;

import com.JynInfoConseil.Gestion_Donateurs.dtos.DonateurDTO;
import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;

import java.util.List;

public interface DonateurService {
    Donateur saveDonateur(Donateur donateur);
    Donateur updateDonateur(Donateur donateur);
    void deleteDonateur(Donateur donateur);
    void deleteDonateurById(Long id);
    Donateur getDonateur(Long id);
    List<Donateur> getAllDonateurs();
    List<Donateur> findByNom(String nom);
    List<Donateur> findByNomContains(String nom);
    List<Donateur> findByMontantContains(Double montant);
    List<Donateur> findByOrderByNomAsc();



}
