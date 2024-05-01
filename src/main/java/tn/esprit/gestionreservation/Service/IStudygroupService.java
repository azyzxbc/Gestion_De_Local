package tn.esprit.gestionreservation.Service;

import tn.esprit.gestionreservation.Entity.Status;
import tn.esprit.gestionreservation.Entity.Studygroup;

import java.util.List;

public interface IStudygroupService {
    Studygroup Add(Studygroup studygroup);

    List<Studygroup> GetAll();

    Studygroup GetOne(long idStudyGroup);

    void Delete (long isStudygroup);

    Studygroup Update (Studygroup studygroup);

    void Affecter_studygroup(Long id_studygroup, Long id_local);
    void Reterive_studygroup(Long id_studygroup, Long id_local, Status status);

    public List<Studygroup> GetAllByStatus(Status status);
}
