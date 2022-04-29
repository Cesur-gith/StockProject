package fr.afpa.projetStock.service;

import fr.afpa.projetStock.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
}
