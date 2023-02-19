package com.example.demo.dao;

import com.example.demo.bean.CategorieTerrain;
import com.example.demo.bean.TauxTaxeTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxTaxeTnbDao extends JpaRepository<TauxTaxeTnb,Long> {

    TauxTaxeTnb findByCategorieTerrainCode(String Code);
}
