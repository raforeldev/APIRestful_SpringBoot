package com.example.PRUEBA_sp_initializr.service;

import com.example.PRUEBA_sp_initializr.entity.Local;
import com.example.PRUEBA_sp_initializr.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LocalServiceImpl implements LocalService{
    //inyectar el repositorio automaticamente
    @Autowired
    LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals() {
        return localRepository.findAll();
    }

    @Override
    public Local saveLocal(Local local) {
        return localRepository.save(local);
    }

    @Override
    public Local updateLocal(Long id, Local local) {
        Local localDB = localRepository.findById(id).get();
        if(Objects.nonNull(local.getCode()) && !"".equalsIgnoreCase(local.getCode())){
            localDB.setCode(local.getCode());
        }
        if(Objects.nonNull(local.getFloor()) && !"".equalsIgnoreCase(local.getFloor())){
            localDB.setFloor(local.getFloor());
        }
        if(Objects.nonNull(local.getName()) && !"".equalsIgnoreCase(local.getName())){
            localDB.setName(local.getName());
        }
        return localRepository.save(localDB);
    }

    @Override
    public void deleteLocal(Long id) {
        localRepository.deleteById(id);
    }
}
