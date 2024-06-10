package tn.esprit.firstprojectsping.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.services.FoyerService;
import tn.esprit.firstprojectsping.services.interfaces.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer-rest-controller")
public class foyerRestController {
    IFoyerService foyerService;
    @PostMapping(path="/foyer/")
    Foyer ajouterFoyer(@RequestBody Foyer foyer){
        return foyerService.ajouterFoyer(foyer);
    }
    @DeleteMapping(path="/foyer/")
    Foyer supprimerFoyer(@RequestBody Foyer foyer){
        return foyerService.supprimerFoyer(foyer);
    }
    @GetMapping(path="/foyer/{id-foyer}")
    Foyer récupérerFoyer(@PathVariable("id-foyer") Integer idFoyer){
        return foyerService.récupérerFoyer(idFoyer);
    }
    @GetMapping(path="/foyers/")
    List<Foyer> récupérerListeFoyers(){
        return foyerService.récupérerListeFoyers();
    }
    @PutMapping(path="/foyer/{id-foyer}")
    Foyer modifierFoyer(@PathVariable("id-foyer") Integer idFoyer, @RequestBody Foyer foyer){
        return foyerService.modifierFoyer(idFoyer,foyer);
    }
    @PostMapping(path="/foyer/{nom-foyer}")
    Foyer affecterFoyerABloc(@PathVariable("nom-foyer") String nomFoyer, @RequestBody Bloc bloc){
        return foyerService.affecterFoyerABloc(nomFoyer, bloc);
    }




}
