package prom.it.service;

import prom.it.entity.Profession;

import java.util.List;

public interface ProfessionService {

    Profession addProfession(Profession profession);
    Boolean deleteProfession(Long id);
    Profession getById(Long id);
    Profession updateProfession(Profession profession);
    List<Profession> getAll();

}
