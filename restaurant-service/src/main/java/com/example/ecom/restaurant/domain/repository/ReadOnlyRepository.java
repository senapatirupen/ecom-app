package com.example.ecom.restaurant.domain.repository;

import java.util.Collection;

/**
 * @param <TE>
 * @param <T>
 * @author Rupen Senapati
 */
public interface ReadOnlyRepository<TE, T> {

  //long Count;

  /**
   * @param id
   */
  boolean contains(T id);

  /**
   * @param id
   */
  TE get(T id);

  /**
   *
   * @return
   */
  Collection<TE> getAll();
}
