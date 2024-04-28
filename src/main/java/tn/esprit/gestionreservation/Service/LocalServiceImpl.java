package tn.esprit.gestionreservation.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionreservation.Entity.Local;
import tn.esprit.gestionreservation.Repository.LocalRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class LocalServiceImpl implements ILocalService{
    LocalRepository LocalRepository;

    public List<Local> retrieveAllLocales() {
        return LocalRepository.findAll();
    }
    public Local retrieveLocal(Long idLocal) {
        return LocalRepository.findById(idLocal).get();
    }

    public Local addLocal(Local l) {
        return LocalRepository.save(l);
    }
    public void removeLocal(Long idLocal) {
        LocalRepository.deleteById(idLocal);
    }
    public Local modifyLocal(Local Local) {
        return LocalRepository.save(Local);
    }
}
