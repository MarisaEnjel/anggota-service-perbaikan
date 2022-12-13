/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.anggotaservice.Sevice;

import com.marisaenjel.anggotaservice.Entity.Anggota;
import com.marisaenjel.anggotaservice.Repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository anggotaRepository;
    
    public Anggota saveAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }
    
    public Anggota findAnggotaById(Long anggotaId){
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
}
