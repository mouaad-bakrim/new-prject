package com.example.demo.dao;

import com.example.demo.bean.CategorieTerrain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieTerrainDao extends JpaRepository<CategorieTerrain, Long> {
    CategorieTerrain findByCode(String Code);
    int deleteByCode(String Code);
}
