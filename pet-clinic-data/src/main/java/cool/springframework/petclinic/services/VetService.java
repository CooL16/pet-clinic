package cool.springframework.petclinic.services;

import cool.springframework.petclinic.model.Owner;
import cool.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
