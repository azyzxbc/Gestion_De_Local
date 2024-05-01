package tn.esprit.gestionreservation.Service;

import tn.esprit.gestionreservation.Entity.Local;

import java.util.List;

public interface ILocalService {
    public List<Local> GetAll();

    public Local GetOne(Long idLocal);

    public Local Add(Local l);

    public void Delete(Long idLocal);

    public Local Update(Local Local);

    public List<Local> AllAvliableLocal();
}
