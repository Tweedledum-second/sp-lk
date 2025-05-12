package ru.bgpu.splk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.bgpu.splk.models.Status;

public interface StatusRepositories extends CrudRepository<Status, Long> {
}
