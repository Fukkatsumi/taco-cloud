package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
