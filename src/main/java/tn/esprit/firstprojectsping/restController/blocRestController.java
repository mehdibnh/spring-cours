package tn.esprit.firstprojectsping.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstprojectsping.entities.Bloc;
import tn.esprit.firstprojectsping.entities.Foyer;
import tn.esprit.firstprojectsping.services.interfaces.IBlocService;
import tn.esprit.firstprojectsping.services.interfaces.IFoyerService;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc-rest-controller")
public class blocRestController {
    IBlocService blocService;

    @PutMapping(path="/bloc/{id-foyer}")
    Bloc desaffecterBlocAFoyer(@PathVariable("id") long idFoyer){
        return blocService.desaffecterBlocAFoyer(idFoyer);
    }

    @PutMapping("/{blocId}/foyer/{foyerId}")
    public Bloc affecterBlocAFoyer(@PathVariable Long blocId, @PathVariable Integer foyerId) {
        return blocService.affecterBlocAFoyer(blocId, foyerId);
    }


}
