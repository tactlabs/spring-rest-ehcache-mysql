package org.tact.dao;

import org.springframework.data.repository.CrudRepository;
import org.tact.model.Tip;

public interface TipRepository extends CrudRepository<Tip,Integer> {
}
