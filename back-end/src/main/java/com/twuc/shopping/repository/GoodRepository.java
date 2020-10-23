package com.twuc.shopping.repository;

import com.twuc.shopping.domain.Good;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends JpaRepository<Good, Long> {
}
