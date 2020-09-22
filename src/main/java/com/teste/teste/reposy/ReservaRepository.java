/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.teste.reposy;

import com.teste.teste.modelo.Reserva;
import com.teste.teste.modelo.Residencia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
}
