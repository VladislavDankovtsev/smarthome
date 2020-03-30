package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dankovtsev.smarthome.model.SmartHomeClimatControl;

import java.util.UUID;

public interface SmartHomeClimatControlRepository  extends JpaRepository<SmartHomeClimatControl, UUID> {
}
