package com.github.urbanoneto.staties.repositories;

import com.github.urbanoneto.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
