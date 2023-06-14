package com.JynInfoConseil.Gestion_Donateurs.mappers;

import com.JynInfoConseil.Gestion_Donateurs.dtos.DonateurDTO;
import com.JynInfoConseil.Gestion_Donateurs.entities.Donateur;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DonateurMapper {
    private ModelMapper modelMapper=new ModelMapper();

    public DonateurDTO from(Donateur donateur){
        return modelMapper.map(donateur,DonateurDTO.class);
    }

    public Donateur from(DonateurDTO donateurDTO){
        return modelMapper.map(donateurDTO,Donateur.class);

    }
}
