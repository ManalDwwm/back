package com.JynInfoConseil.Gestion_Donateurs.services;
import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import com.JynInfoConseil.Gestion_Donateurs.repository.DonateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DonateurServiceImpl implements DonateurService {
    @Autowired
     DonateurRepository donateurRepository;
    @Override
    public Donateur saveDonateur(Donateur donateur) {
        return donateurRepository.save(donateur);
    }
    @Override
    public Donateur updateDonateur(Donateur donateur) {
        return donateurRepository.save(donateur);
    }
    @Override
    public void deleteDonateur(Donateur donateur) {donateurRepository.delete(donateur);}
    @Override
    public void deleteDonateurById(Long id) {donateurRepository.deleteById(id);}
    @Override
    public Donateur getDonateur(Long id) {
        return donateurRepository.findById(id).get();
    }
    @Override
    public List<Donateur> getAllDonateurs() {
        return donateurRepository.findAll();
    }
    @Override
    public List<Donateur> findByNomContains(String nom) {
        return donateurRepository.findByNomContains(nom);
    }
    @Override
    public List<Donateur> findByMontantContains(Double montant) {
        return donateurRepository.findByMontantContains(montant);
    }
    @Override
    public List<Donateur> findByNom(String nom) {
        return donateurRepository.findByNom(nom);
    }
    @Override
    public List<Donateur> findByNomContainingIgnoreCase(String nom) {
        return donateurRepository.findAllByNomContainingIgnoreCase(nom);
    }
    @Override
    public List<Donateur> findByOrderByNomAsc() {
        return  donateurRepository.findByOrderByMontantAsc();
    }
}

