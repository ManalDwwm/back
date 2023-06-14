package com.JynInfoConseil.Gestion_Donateurs.web;

import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import com.JynInfoConseil.Gestion_Donateurs.services.DonateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiDonateurs")
@CrossOrigin("*")
public class DonateurRESTController {
    @Autowired
    DonateurService donateurService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Donateur> getAllDonateurs() {
        return donateurService.getAllDonateurs();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Donateur getDonateurById(@PathVariable("id") Long id) {
        return donateurService.getDonateur(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Donateur createDonateur(@RequestBody Donateur donateur) {
        return donateurService.saveDonateur(donateur);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Donateur updateDonateur(@RequestBody Donateur donateur) {
        return donateurService.updateDonateur(donateur);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteDonateur(@PathVariable("id") Long id)
    {
        donateurService.deleteDonateurById(id);
    }


    @RequestMapping(value="/donasByName/{nom}",method = RequestMethod.GET)
    public List<Donateur> findByNomContains(@PathVariable("nom") String nom) {
        return donateurService.findByNomContains(nom);
    }


}
