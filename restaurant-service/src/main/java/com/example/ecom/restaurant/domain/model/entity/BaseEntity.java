package com.example.ecom.restaurant.domain.model.entity;

/**
 * @param <T>
 * @author Rupen Senapati
 */
public abstract class BaseEntity<T> extends Entity<T> {

  private boolean isModified;

  /**
   * @param id
   * @param name
   */
  public BaseEntity(T id, String name) {
    super.id = id;
    super.name = name;
    isModified = false;
  }

  /**
   *
   * @return
   */
  public boolean isIsModified() {
    return isModified;
  }

}
