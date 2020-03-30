package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dankovtsev.smarthome.model.SmartHomeSecurity;

import java.util.UUID;

public interface SmartHomeSecurityRepository extends JpaRepository<SmartHomeSecurity, UUID> {
}
