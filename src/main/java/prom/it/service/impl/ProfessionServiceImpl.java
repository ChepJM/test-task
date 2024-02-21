package prom.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prom.it.entity.Employee;
import prom.it.entity.Profession;
import prom.it.repository.ProfessionRepository;
import prom.it.service.ProfessionService;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessionServiceImpl implements ProfessionService {

    @Autowired
    private ProfessionRepository professionRepository;

    @Override
    public Profession addProfession(Profession profession) {
        return professionRepository.saveAndFlush(profession);
    }

    @Override
    public Boolean deleteProfession(Long id) {
        try {
            professionRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Profession getById(Long id) {
        Optional<Profession> profession = professionRepository.findById(id);
        return profession.orElseGet(Profession::new);
    }

    @Override
    public Profession updateProfession(Profession profession) {
        return professionRepository.saveAndFlush(profession);
    }

    @Override
    public List<Profession> getAll() {
        return professionRepository.findAll();
    }
}
