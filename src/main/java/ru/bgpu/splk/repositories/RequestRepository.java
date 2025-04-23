package ru.bgpu.splk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bgpu.splk.models.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
