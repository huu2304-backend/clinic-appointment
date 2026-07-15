package com.clinicappointmentapi.service.impl;

import com.clinicappointmentapi.dto.SpecialtyRequest;
import com.clinicappointmentapi.dto.SpecialtyResponse;
import com.clinicappointmentapi.exception.DuplicateResourceException;
import com.clinicappointmentapi.repository.SpecialtyRepository;
import com.clinicappointmentapi.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SpecialtyServiceImpl implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;
    @Override
    public SpecialtyResponse create(SpecialtyRequest request) {
        if(specialtyRepository.existsByName(request.getName())) {
            throw new DuplicateResourceException("Specialty with name " + request.getName() + " already exists.");
        }
        return null;
    }

    @Override
    public List<SpecialtyResponse> getAll() {
        return List.of();
    }

    @Override
    public SpecialtyResponse getById(Long id) {
        return null;
    }

    @Override
    public SpecialtyResponse update(Long id, SpecialtyRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
