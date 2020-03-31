package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dankovtsev.smarthome.model.SmartHomeLighting;

import java.util.UUID;

@Repository
public interface SmartHomeLightingRepository extends JpaRepository<SmartHomeLighting, UUID> {
}
