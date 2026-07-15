package com.clinicappointmentapi.service;

import com.clinicappointmentapi.dto.SpecialtyRequest;
import com.clinicappointmentapi.dto.SpecialtyResponse;

import java.util.List;

public interface SpecialtyService {
    SpecialtyResponse create(SpecialtyRequest request);
    List<SpecialtyResponse> getAll();
    SpecialtyResponse getById(Long id);
    SpecialtyResponse update(Long id, SpecialtyRequest request);
    void delete(Long id);

}
