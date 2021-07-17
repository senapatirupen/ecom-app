package com.example.ecom.user.domain.repository;

import com.example.ecom.user.common.UserNotFoundException;
import java.util.Collection;

/**
 * @param <TE>
 * @param <T>
 * @author Sourabh Sharma
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
  TE get(T id) throws UserNotFoundException;

  /**
   *
   * @return
   */
  Collection<TE> getAll();
}
