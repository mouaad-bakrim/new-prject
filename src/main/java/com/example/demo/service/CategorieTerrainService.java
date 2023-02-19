package com.example.demo.service;


import com.example.demo.bean.CategorieTerrain;
import com.example.demo.bean.Redevable;
import com.example.demo.dao.CategorieTerrainDao;
import com.example.demo.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieTerrainService {
    @Autowired
    public CategorieTerrainDao categorieTerrainDao;

    public int save(CategorieTerrain categorieTerrain) {
        if (findByCode(categorieTerrain.getCode()) != null) {
            return -1;
        } else {
            categorieTerrainDao.save(categorieTerrain);
            return 1;
        }
    }

    public CategorieTerrain findByCode(String Code) {
        return categorieTerrainDao.findByCode(Code);
    }

    public int deleteByCode(String Code) {
        return categorieTerrainDao.deleteByCode(Code);
    }

    public List<CategorieTerrain> findAll() {
        return categorieTerrainDao.findAll();
    }
}
