package tn.esprit.gestionreservation.Service;

import tn.esprit.gestionreservation.Entity.Studygroup;

import java.util.List;

public interface IStudygroupService {
    Studygroup addStudyGroup(Studygroup studygroup);

    List<Studygroup> getAllStudyGroup();

    Studygroup getStudygroupById(long idStudyGroup);

    void deleteStudyGroup(long isStudygroup);

    Studygroup updateStudygroup(Studygroup studygroup);
}
