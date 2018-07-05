package org.tact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tact.model.Tip;
import org.tact.service.TipService;

@RestController
@RequestMapping("/tips")
public class TipsController {

    @Autowired
    private TipService tipService;

    @GetMapping("/id/{tipId}")
    public Tip getTipById(@PathVariable Integer tipId){
        return tipService.getTipById(tipId);
    }

    @DeleteMapping("/delete/{tipId}")
    public void deleteTipById(@PathVariable Integer tipId){
        tipService.deleteTipById(tipId);
    }

    @PutMapping("/update/{tipId}/name/{bookingName}")
    public Tip updateTipById(Integer tipId, String addedBy){
        return tipService.updateTipById(tipId, addedBy);
    }
}
