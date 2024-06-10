package tn.esprit.firstprojectsping.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.entities.Universite;
import tn.esprit.firstprojectsping.services.interfaces.IFoyerService;
import tn.esprit.firstprojectsping.services.interfaces.IUniversiteService;

@RestController
@AllArgsConstructor
@RequestMapping("/univ-rest-controller")
public class universiteRestController {
    IUniversiteService universiteService;
    @PostMapping(path="/affecter-foyer")
    public Universite affecterFoyerAUniversite(@RequestParam Integer idFoyer, @RequestParam String nomUniversite) {
        return universiteService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }


}
