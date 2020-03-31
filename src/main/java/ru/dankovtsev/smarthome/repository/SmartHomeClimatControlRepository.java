package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dankovtsev.smarthome.model.SmartHomeClimatControl;

import java.util.UUID;
@Repository
public interface SmartHomeClimatControlRepository  extends JpaRepository<SmartHomeClimatControl, UUID> {
}
