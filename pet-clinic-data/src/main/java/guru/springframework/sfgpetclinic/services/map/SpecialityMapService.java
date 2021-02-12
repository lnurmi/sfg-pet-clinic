package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(final Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(final Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(final Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(final Long id) {
        return super.findById(id);
    }
}
