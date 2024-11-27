package com.utch.JoseHernandez.repository;

import com.utch.JoseHernandez.Entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepo extends JpaRepository<ProductoEntity, Integer> {
}
