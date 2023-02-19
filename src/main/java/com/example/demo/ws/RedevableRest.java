package com.example.demo.ws;

import com.example.demo.bean.Redevable;
import com.example.demo.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/redevable")

public class RedevableRest {
    @Autowired
    private RedevableService redevableService;

    @PostMapping("/")
    public int save(@RequestBody Redevable redevable) {
        return redevableService.save(redevable);
    }

    @GetMapping("/cin/{cin}")
    public Redevable findByCin(@PathVariable String cin) {
        return redevableService.findByCin(cin);
    }

    @DeleteMapping("/cin/{cin}")
    public int deletByCin(@PathVariable String cin) {
        return redevableService.deleteByCin(cin);
    }

    @GetMapping("/")
    public List<Redevable> findAll() {
        return redevableService.findAll();
    }
}
