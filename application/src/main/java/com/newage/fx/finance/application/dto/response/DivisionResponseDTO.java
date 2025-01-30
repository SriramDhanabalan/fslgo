package com.newage.fx.finance.application.dto.response;

import lombok.Generated;

public class DivisionResponseDTO {

    private Long id;
    private String code;
    private String name;

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setCode(final String code) {
        this.code = code;
    }

    @Generated
    public void setName(final String name) {
        this.name = name;
    }

    @Generated
    public DivisionResponseDTO(final Long id, final String code, final String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    @Generated
    public DivisionResponseDTO() {
    }



}
