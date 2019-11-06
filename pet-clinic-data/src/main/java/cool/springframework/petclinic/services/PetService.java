package cool.springframework.petclinic.services;

import cool.springframework.petclinic.model.Owner;
import cool.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
