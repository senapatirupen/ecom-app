package com.example.ecom.user.domain.service;

import com.example.ecom.user.domain.model.entity.Entity;
import com.example.ecom.user.domain.model.entity.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Rupen Senapati
 */
public interface UserService {

  /**
   * @param user
   */
  public void add(User user) throws Exception;

  /**
   * @param user
   */
  public void update(String id, User user) throws Exception;

  /**
   * @param id
   */
  public void delete(String id) throws Exception;

  /**
   * @param id
   */
  public User findById(String id) throws Exception;

  /**
   * @param name
   */
  public Collection<User> findByName(String name) throws Exception;

  /**
   * @param name
   */
  public Collection<User> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
