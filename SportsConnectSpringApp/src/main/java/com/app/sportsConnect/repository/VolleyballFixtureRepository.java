package com.app.sportsConnect.repository;

import com.app.sportsConnect.entity.VolleyballFixture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolleyballFixtureRepository extends JpaRepository<VolleyballFixture, Long> {

}
