package com.example.ecom.booking.domain.service;

import com.example.ecom.booking.domain.repository.ReadOnlyRepository;

/**
 * @param <TE>
 * @param <T>
 * @author Rupen Senapati
 */
public abstract class ReadOnlyBaseService<TE, T> {

  private ReadOnlyRepository<TE, T> repository;

  ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
    this.repository = repository;
  }
}
