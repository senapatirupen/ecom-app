package com.example.ecom.booking.domain.service;

import com.example.ecom.booking.domain.model.entity.Booking;
import com.example.ecom.booking.domain.model.entity.Entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Sourabh Sharma
 */
public interface BookingService {

  /**
   * @param booking
   */
  public void add(Booking booking) throws Exception;

  /**
   * @param booking
   */
  public void update(Booking booking) throws Exception;

  /**
   * @param id
   */
  public void delete(String id) throws Exception;

  /**
   * @param id
   */
  public Entity findById(String id) throws Exception;

  /**
   * @param name
   */
  public Collection<Booking> findByName(String name) throws Exception;

  /**
   * @param name
   */
  public Collection<Booking> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
