package com.example.demo.dao;

import com.example.demo.bean.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerrainDao extends JpaRepository<Terrain,Long> {
    Terrain findByRef(String ref);
    int deleteByRef(String ref);


  List<Terrain> findByRedevable(String cin);
}
