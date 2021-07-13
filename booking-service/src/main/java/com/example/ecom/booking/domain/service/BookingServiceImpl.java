package com.example.ecom.booking.domain.service;

import com.example.ecom.booking.common.DuplicateBookingException;
import com.example.ecom.booking.common.InvalidBookingException;
import com.example.ecom.booking.domain.model.entity.Booking;
import com.example.ecom.booking.domain.model.entity.Entity;
import com.example.ecom.booking.domain.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author Sourabh Sharma
 */
@Service("bookingService")
public class BookingServiceImpl extends BaseService<Booking, String>
    implements BookingService {

  private BookingRepository<Booking, String> bookingRepository;

  /**
   * @param bookingRepository
   */
  @Autowired
  public BookingServiceImpl(BookingRepository<Booking, String> bookingRepository) {
    super(bookingRepository);
    this.bookingRepository = bookingRepository;
  }

  @Override
  public void add(Booking booking) throws Exception {
    if (bookingRepository.containsName(booking.getName())) {
      Object[] args = {booking.getName()};
      throw new DuplicateBookingException("duplicateBooking", args);
    }

    if (booking.getName() == null || "".equals(booking.getName())) {
      Object[] args = {"Booking with null or empty name"};
      throw new InvalidBookingException("invalidBooking", args);
    }
    super.add(booking);
  }

  /**
   * @param name
   */
  @Override
  public Collection<Booking> findByName(String name) throws Exception {
    return bookingRepository.findByName(name);
  }

  /**
   * @param booking
   */
  @Override
  public void update(Booking booking) throws Exception {
    bookingRepository.update(booking);
  }

  /**
   * @param id
   */
  @Override
  public void delete(String id) throws Exception {
    bookingRepository.remove(id);
  }

  /**
   * @param id
   */
  @Override
  public Entity findById(String id) throws Exception {
    return bookingRepository.get(id);
  }

  /**
   * @param name
   */
  @Override
  public Collection<Booking> findByCriteria(Map<String, ArrayList<String>> name) throws Exception {
    throw new UnsupportedOperationException(
        "Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}