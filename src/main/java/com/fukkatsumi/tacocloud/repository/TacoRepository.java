package com.fukkatsumi.tacocloud.repository;

import com.fukkatsumi.tacocloud.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
