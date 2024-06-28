package nikitaivanov.gestione_dispositivi.dipendenti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dipendenti")
public class DipendentiController {

    @Autowired
    DipendentiService dipendentiService;

    //Creazione Dipendenti
    @PostMapping
    public Dipendenti saveDipendente(@RequestBody @Validated DipendentiDTO dipendente){
        return dipendentiService.saveDipendente(dipendente);
    }

    //Modifica Dipendenti
    @PutMapping("/{id}")
    public Dipendenti updateDipendente(@RequestBody @Validated DipendentiDTO dipendente, @PathVariable long id){
        return dipendentiService.findByIdAndUpdate(id, dipendente);
    }

    //Lista di tutti i Dipendenti
    @GetMapping
    public Page<Dipendenti> findAllDipendenti(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "20") int size){
        return dipendentiService.findAllDipendenti(page, size);
    }

    //Cerca Dipendente per ID
    @GetMapping("/{id}")
    public Dipendenti findById(@PathVariable long id){
        return dipendentiService.findById(id);
    }

    //Elimina Dipendente
    @DeleteMapping("/{id}")
    public void  deleteDipendente(@PathVariable long id){
        dipendentiService.findByIdAndDelete(id);
    }

}
