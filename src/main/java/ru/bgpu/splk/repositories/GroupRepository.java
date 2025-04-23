package ru.bgpu.splk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bgpu.splk.models.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
