package org.tact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.tact.dao.TipRepository;
import org.tact.model.Tip;

@Service
public class TipService {

    @Autowired
    private TipRepository tipRepository;

    @Cacheable(value = "tipCache",key = "#tipId", unless = "#result==null")
    public Tip getTipById(Integer tipId){
        System.out.println("tip details by Id" + tipId);
        return tipRepository.findOne(tipId);
    }

    @CacheEvict(value = "tipCache", key = "#tipId")
    public void deleteTipById(Integer tipId){
        tipRepository.delete(tipId);
    }

    @CachePut(value = "tipCache", key = "#tipId")
    public Tip updateTipById(Integer tipId, String addedBy){
        Tip booking = tipRepository.findOne(tipId);
        if(null != booking){
            //booking.setBookingName(addedBy);
            return tipRepository.save(booking);
        }
        return null;
    }
}
