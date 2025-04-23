package ru.bgpu.splk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bgpu.splk.models.Status;

public interface StatusRepositories extends JpaRepository<Status, Long> {
}
