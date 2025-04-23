package ru.bgpu.splk.repositories;

import ru.bgpu.splk.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
