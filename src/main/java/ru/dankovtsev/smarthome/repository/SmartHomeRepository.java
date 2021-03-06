package ru.dankovtsev.smarthome.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dankovtsev.smarthome.model.SmartHome;

import java.util.UUID;

@Repository
public interface SmartHomeRepository extends JpaRepository<SmartHome, UUID> {
}
