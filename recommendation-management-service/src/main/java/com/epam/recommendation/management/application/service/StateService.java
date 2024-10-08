package com.epam.recommendation.management.application.service;

import com.epam.recommendation.management.application.dto.StateDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StateService {
   Page<StateDto> getStatesByCountryWithPagination(Long countryId, Pageable pageable);
}
