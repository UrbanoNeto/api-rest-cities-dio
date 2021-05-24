package com.github.urbanoneto.countries.repositories;

import com.github.urbanoneto.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
