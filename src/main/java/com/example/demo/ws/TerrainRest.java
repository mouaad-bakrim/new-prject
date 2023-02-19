package com.example.demo.ws;

import com.example.demo.bean.Terrain;
import com.example.demo.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api/vi/terrain")
public class TerrainRest {
    @Autowired
    private TerrainService terrainService;
    @PostMapping("/")
    public int save(@RequestBody Terrain terrain) {
        return terrainService.save(terrain);
    }

    @GetMapping("/ref/{ref}")
    public Terrain findByRef(@PathVariable String ref) {
        return terrainService.findByRef(ref);
    }

    @DeleteMapping("/ref/{ref}")
    public int deleteByRef(@PathVariable String ref) {
        return terrainService.deleteByRef(ref);
    }

    @GetMapping("/")
    public List<Terrain> findAll() {
        return terrainService.findAll();
    }
}


