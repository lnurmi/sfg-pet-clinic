package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialityServiceSDJpa implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceSDJpa(final SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(final Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(final Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(final Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(final Long id) {
        specialityRepository.deleteById(id);
    }
}
