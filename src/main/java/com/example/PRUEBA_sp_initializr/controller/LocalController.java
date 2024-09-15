package com.example.PRUEBA_sp_initializr.controller;

import com.example.PRUEBA_sp_initializr.entity.Local;
import com.example.PRUEBA_sp_initializr.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class LocalController {

    @Autowired
    LocalService localService;

    @GetMapping("/findAllLocals")
    public List<Local> findAllLocal() {
        return localService.findAllLocals();
    }

    @PostMapping ("/saveLocal")
    public Local saveLocal(@RequestBody Local local){
        return localService.saveLocal(local);
    }

    @PutMapping("/updateLocal/{id}")
    public Local updateLocal(@PathVariable Long id, @RequestBody Local local){
        return localService.updateLocal(id, local);
    }

    @DeleteMapping("/deleteLocal/{id}")
    public String deleteLocal(@PathVariable Long id) {
        localService.deleteLocal(id);
        return "Successfully deleted";
    }

}
