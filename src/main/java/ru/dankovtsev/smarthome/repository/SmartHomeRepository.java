package ru.dankovtsev.smarthome.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import ru.dankovtsev.smarthome.model.SmartHome;

import java.util.UUID;

public interface SmartHomeRepository extends JpaRepository<SmartHome, UUID> {
}
