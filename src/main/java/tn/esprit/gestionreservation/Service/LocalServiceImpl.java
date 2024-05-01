package tn.esprit.gestionreservation.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionreservation.Entity.Local;
import tn.esprit.gestionreservation.Repository.LocalRepository;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class LocalServiceImpl implements ILocalService{
    LocalRepository LocalRepository;

    @Override
    public List<Local> GetAll() {
        return LocalRepository.findAll();
    }

    @Override
    public Local GetOne(Long idLocal) {
        return LocalRepository.findById(idLocal).get();
    }

    @Override
    public Local Add(Local l) {
        return LocalRepository.save(l);
    }

    @Override
    public void Delete(Long idLocal) {
        LocalRepository.deleteById(idLocal);
    }

    @Override
    public Local Update(Local Local) {
        return LocalRepository.save(Local);
    }


    @Override
    public List<Local> AllAvliableLocal() {
        List<Local> locals = LocalRepository.findAll();
        List<Local> locals_avaliables = new ArrayList<>();
        for (Local local : locals) {
            if (local.getTotal_group_study() < 4){
                locals_avaliables.add(local);
            }
        }
        return locals_avaliables;
    }

}
