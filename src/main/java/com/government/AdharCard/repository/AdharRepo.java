package com.government.AdharCard.repository;

import com.government.AdharCard.entity.AdharUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdharRepo extends JpaRepository<AdharUsers,Integer> {
}
