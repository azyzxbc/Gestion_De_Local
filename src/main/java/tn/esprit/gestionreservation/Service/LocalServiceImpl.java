package tn.esprit.gestionreservation.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionreservation.Entity.Local;
import tn.esprit.gestionreservation.Repository.LocalRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        l.setAvailability(Boolean.TRUE);
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
            if (local.getAvailability() == Boolean.TRUE){
                locals_avaliables.add(local);
            }
        }
        return locals_avaliables;
    }


    public Map<String,Integer> getstatsalle() {
        Map<String, Integer> stats = new HashMap<>();
        List<Local> locals = LocalRepository.findAll();
        for (Local local : locals) {
            stats.put(local.getName(), local.getTotal_group_study());
        }
        return stats;
    }

    @Override
    public Map<String, Integer> getavaliablesstats() {
        int dispo = 0;
        int not_dispo = 0;
        Map<String, Integer> stats = new HashMap<>();
        List<Local> locals = LocalRepository.findAll();
        for (Local local : locals) {
            if(local.getAvailability() == Boolean.TRUE)
                dispo++;
            else
                not_dispo++;
        }
        stats.put("available",dispo);
        stats.put("not available",not_dispo);
        return stats;
    }
    @Override
    public int getTotalNumberOfLocals() {
        return LocalRepository.findAll().size();
    }

    @Override
    public List<String> GetAllNames() {
        List<String> names = new ArrayList<>();
        names = LocalRepository.findAllNames();
        return names;
    }

}
