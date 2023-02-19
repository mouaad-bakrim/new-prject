package com.example.demo.service;

import com.example.demo.bean.CategorieTerrain;
import com.example.demo.dao.CategorieTerrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TauxTaxeTnbService {
    @Autowired

    public TauxTaxeTnbDao TauxTaxeTnbDao;

    public int save(TauxTaxeTnb tauxTaxeTnb) {
        if (findByAnneeAndTerrain(tauxTaxeTnb.getAnneeAndTerrain()) != null) {
            return -1;
        } else {
            TauxTaxeTnbDao.save(tauxTaxeTnb);
            return 1;
        }
    }


}
