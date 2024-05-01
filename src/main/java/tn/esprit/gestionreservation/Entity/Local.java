package tn.esprit.gestionreservation.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idLocal;
    Boolean Availability;
    Integer Capacity;
    Integer total_group_study = 0;
    @ManyToMany(mappedBy = "locals")
    private Set<User> users;
    @ManyToMany(mappedBy = "locals")
    private  Set<Studygroup> studygroups;
}
