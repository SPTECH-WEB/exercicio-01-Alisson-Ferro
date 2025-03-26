package com.fatura.apifatura.Repository;

import com.fatura.apifatura.Model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Integer> {
}
