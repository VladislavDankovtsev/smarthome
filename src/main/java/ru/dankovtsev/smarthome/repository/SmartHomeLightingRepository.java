package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dankovtsev.smarthome.model.SmartHomeLighting;

import java.util.UUID;

public interface SmartHomeLightingRepository extends JpaRepository<SmartHomeLighting, UUID> {
}
