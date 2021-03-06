package com.example.ecom.booking.domain.repository;

import java.util.Collection;

/**
 * @param <Booking>
 * @param <String>
 * @author Rupen Senapati
 */
public interface BookingRepository<Booking, String> extends Repository<Booking, String> {

  /**
   * @param name
   */
  boolean containsName(String name);

  /**
   * @param name
   */
  public Collection<Booking> findByName(String name) throws Exception;
}
