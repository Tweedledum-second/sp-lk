package ru.bgpu.splk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bgpu.splk.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
