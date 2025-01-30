package com.newage.fx.finance.application.dto.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DTOMapper<Entity, RequestDTO, ResponseDTO> {

    ResponseDTO convertEntityToResponseDTO(Entity entity);

    Entity convertCreateRequestToEntity(RequestDTO dto);

    void convertUpdateRequestToEntity(RequestDTO dto, Entity entity);

    Page<ResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<Entity> entityPage);


}
