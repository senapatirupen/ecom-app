package com.example.ecom.booking.domain.repository;

/**
 * @param <TE>
 * @param <T>
 * @author Rupen Senapati
 */
public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

  /**
   * @param entity
   */
  void add(TE entity);

  /**
   * @param id
   */
  void remove(T id);

  /**
   * @param entity
   */
  void update(TE entity);
}
