package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dankovtsev.smarthome.model.SmartHomeElevator;

import java.util.UUID;

public interface SmartHomeElevatorRepoitory extends JpaRepository<SmartHomeElevator, UUID> {
}
