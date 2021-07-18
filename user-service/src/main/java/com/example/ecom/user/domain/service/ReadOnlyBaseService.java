package com.example.ecom.user.domain.service;

import com.example.ecom.user.domain.repository.ReadOnlyRepository;

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
