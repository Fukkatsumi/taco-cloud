package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findById(String id);

    Ingredient save(Ingredient ingredient);

}
