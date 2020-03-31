package ru.dankovtsev.smarthome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dankovtsev.smarthome.model.SmartHomeElevator;

import java.util.UUID;

@Repository
public interface SmartHomeElevatorRepoitory extends JpaRepository<SmartHomeElevator, UUID> {
}
