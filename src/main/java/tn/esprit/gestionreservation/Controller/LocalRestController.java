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

    @GetMapping("")
    public List<Local> GetAll() {
        List<Local> listLocal = LocalService.GetAll();
        return listLocal;
    }

    @GetMapping("/{Local-id}")
    public Local GetOne(@PathVariable("Local-id") Long LId) {
        Local Local = LocalService.GetOne(LId);
        return Local;
    }

    @PostMapping("")
    public Local Add(@RequestBody Local l) {
        Local Local = LocalService.Add(l);
        return Local;
    }

    @DeleteMapping("/{Local-id}")
    public void Delete (@PathVariable("Local-id") Long LId) {
        LocalService.Delete(LId);
    }
    @PutMapping("/update")
    public Local Update(@RequestBody Local l) {
        Local Local = LocalService.Update(l);
        return Local;
    }

    @GetMapping("/avliables")
    public List<Local> AllAvliableLocal() {
        List<Local> listLocal = LocalService.AllAvliableLocal();
        return listLocal;
    }
}
