package com.JynInfoConseil.Gestion_Donateurs;

import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import com.JynInfoConseil.Gestion_Donateurs.enums.Devise;
import com.JynInfoConseil.Gestion_Donateurs.repository.DonateurRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class GestionDonateursApplicationTests {
	@Autowired
	 private DonateurRepository donateurRepository;

	@Test
	public void testCreateDonateur() {
		Donateur donateur;
		donateur = new Donateur(null, "Istam", "Julie", "julie@gg.com", "Turquie", 3000.00, Devise.Livre_Turque, new Date());
		donateurRepository.save(donateur);
	}

	@Test
	public void testFindDonateur() {
		Donateur donateur = donateurRepository.findById(1L).get();
		System.out.println(donateur);
	}

	@Test
	public void testUpdateDonateur() {
		Donateur donateur = donateurRepository.findById(1L).get();
		donateur.setMontant(2000.0);
		donateurRepository.save(donateur);
	}

	@Test
	public void testDeleteDonateur() {
		donateurRepository.deleteById(3L);
		;
	}

	@Test
	public void testListerTousDonateurs() {
		List<Donateur> donateurs = donateurRepository.findAll();
		for (Donateur donateur : donateurs) {
			System.out.println(donateur);
		}

	}
	@Test
	public void testFindByNom()
	{
		List<Donateur> donateurs = donateurRepository.findByNom("Louna");
		for (Donateur donateur: donateurs)
		{
			System.out.println(donateur);
		}
	}
	@Test
	public void testFindByNomContains ()
	{
		List<Donateur> donateurs = donateurRepository.findByNomContains("Lou");
		for (Donateur donateur: donateurs)
		{
			System.out.println(donateur);
		}
	}

	@Test
	public void testfindByNomMontant()
	{
		List<Donateur> donateurs = donateurRepository.findByNomMontant("lo", 2000.0);
		for (Donateur donateur : donateurs)
		{
			System.out.println(donateur);
		}
	}
	@Test
	public void testfindByOrderByNomAsc()
	{
		List<Donateur> donateurs =
				donateurRepository.findByOrderByMontantAsc();
		for (Donateur donateur: donateurs)
		{
			System.out.println(donateur);
		}
	}


}
