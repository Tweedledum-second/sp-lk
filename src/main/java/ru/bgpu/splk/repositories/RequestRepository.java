package ru.bgpu.splk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.bgpu.splk.models.Request;

public interface RequestRepository extends CrudRepository<Request, Long> {
}
