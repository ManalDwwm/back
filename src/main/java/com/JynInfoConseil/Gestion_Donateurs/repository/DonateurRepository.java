package com.JynInfoConseil.Gestion_Donateurs.repository;
import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
@RepositoryRestResource (path = "rest")
public interface DonateurRepository extends JpaRepository<Donateur, Long> {

    //select * from Donateur where nom = 'lounadi'
    List<Donateur> findByNom(String nom);
    List<Donateur> findByNomContains(String nom);

    //select * from Donateur where nom ilike 'loun'
    List<Donateur> findAllByNomContainingIgnoreCase(String nom);
    List<Donateur> findByMontantContains(Double montant);
// tri selon le montant du plus petit au plus grand montant
    List<Donateur> findByOrderByMontantAsc();
//tri
    @Query("select d from Donateur d where d.nom like %:nom and d.montant > :montant")
    List<Donateur> findByNomMontant (@Param("nom") String nom, @Param("montant") Double montant);


}
