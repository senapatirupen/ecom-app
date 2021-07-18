package com.example.ecom.restaurant.domain.service;

import com.example.ecom.restaurant.domain.repository.Repository;

import java.util.Collection;

/**
 * @param <TE>
 * @param <T>
 * @author Rupen Senapati
 */
public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

  private Repository<TE, T> _repository;

  BaseService(Repository<TE, T> repository) {
    super(repository);
    _repository = repository;
  }

  /**
   * @param entity
   */
  public void add(TE entity) throws Exception {
    _repository.add(entity);
  }

  /**
   *
   * @return
   */
  public Collection<TE> getAll() {
    return _repository.getAll();
  }
}
