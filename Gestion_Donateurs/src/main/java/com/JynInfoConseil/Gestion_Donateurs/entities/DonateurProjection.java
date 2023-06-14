package com.JynInfoConseil.Gestion_Donateurs.entities;

import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;

@Projection(name = "p", types = { Donateur.class })

public interface DonateurProjection {
    public String getNom();
    public Double getMontant();
    public  String getDevise();
    public  String getType();
    public Date getDate();
}
