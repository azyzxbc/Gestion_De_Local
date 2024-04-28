package tn.esprit.gestionreservation.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionreservation.Entity.Local;
import tn.esprit.gestionreservation.Service.ILocalService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Local")
public class LocalRestController {
    ILocalService LocalService;
    // http://localhost:8087/Gestion-Local/Local/retrieve-all-Locales
    @GetMapping("/retrieve-all-Locales")
    public List<Local> getLocales() {
        List<Local> listLocal = LocalService.retrieveAllLocales();
        return listLocal;
    }
    // http://localhost:8087/Gestion-Local/Local/retrieve-Local/1
    @GetMapping("/retrieve-Local/{Local-id}")
    public Local retrieveLocal(@PathVariable("Local-id") Long LId) {
        Local Local = LocalService.retrieveLocal(LId);
        return Local;
    }
    // http://localhost:8087/Gestion-Local/Local/add-Local
    @PostMapping("/add-Local")
    public Local addLocal(@RequestBody Local l) {
        Local Local = LocalService.addLocal(l);
        return Local;
    }
    // http://localhost:8087/Gestion-Local/Local/remove-Local/{Local-id}
    @DeleteMapping("/remove-Local/{Local-id}")
    public void removeLocal(@PathVariable("Local-id") Long LId) {
        LocalService.removeLocal(LId);
    }
    // http://localhost:8087/Gestion-Local/Local/modify-Local
    @PutMapping("/modify-Local")
    public Local modifyLocal(@RequestBody Local l) {
        Local Local = LocalService.modifyLocal(l);
        return Local;
    }

}
