package com.example.demo.service;


import com.example.demo.bean.Redevable;
import com.example.demo.dao.RedevableDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RedevableService {
    @Autowired
    public RedevableDao redevableDao;

    public int save(Redevable redevable) {
        if (findByCin(redevable.getCin()) != null) {
            return -1;
        } else {
            redevableDao.save(redevable);
            return 1;
        }
    }

    public Redevable findByCin(String Cin) {
        return redevableDao.findByCin(Cin);
    }

    public int deleteByCin(String Cin) {
        return redevableDao.deleteByCin(Cin);
    }

    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }
}