package com.example.demo.service;


import com.example.demo.bean.Terrain;
import com.example.demo.dao.TerrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TerrainService {
    @Autowired
    public TerrainDao terrainDao;

    public int save(Terrain Terrain) {
        if (findByRef(Terrain.getRef())!=null){
            return -1;
        }else {
            com.example.demo.bean.Terrain terrain = null;
            terrainDao.save(terrain);
            return 1;
        }
    }

    public Terrain findByRef(String ref) {
        return terrainDao.findByRef(ref);
    }

    public int deleteByRef(String ref) {
        return terrainDao.deleteByRef(ref);
    }

    public List<Terrain> findAll() {
        return terrainDao.findAll();
    }
}

