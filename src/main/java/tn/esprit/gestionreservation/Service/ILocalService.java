package tn.esprit.gestionreservation.Service;

import tn.esprit.gestionreservation.Entity.Local;

import java.util.List;

public interface ILocalService {
    public List<Local> retrieveAllLocales();

    public Local retrieveLocal(Long idLocal);

    public Local addLocal(Local l);

    public void removeLocal(Long idLocal);

    public Local modifyLocal(Local Local);
}
