package com.zemoga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zemoga.dto.Portfolio;

@Repository
public interface PortfolioRepository extends JpaRepository<Portfolio, Integer>{

}
