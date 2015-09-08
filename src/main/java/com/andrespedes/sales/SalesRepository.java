package com.andrespedes.sales;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<SalesOrder, Integer> {

}
