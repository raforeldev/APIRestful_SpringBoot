package com.example.PRUEBA_sp_initializr.service;

import com.example.PRUEBA_sp_initializr.entity.Local;

import java.util.List;

public interface LocalService {
    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocal(Long id);
}
