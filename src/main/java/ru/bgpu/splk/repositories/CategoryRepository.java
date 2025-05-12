package ru.bgpu.splk.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.bgpu.splk.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
