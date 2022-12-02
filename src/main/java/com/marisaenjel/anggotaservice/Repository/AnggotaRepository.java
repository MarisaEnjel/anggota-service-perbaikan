/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.marisaenjel.anggotaservice.Repository;

import com.marisaenjel.anggotaservice.Entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Long>{

    public Anggota findByAnggotaId(Long anggotaId);
    
}