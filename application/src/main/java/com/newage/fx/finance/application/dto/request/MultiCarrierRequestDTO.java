package com.newage.fx.finance.application.dto.request;

import lombok.Generated;

public class MultiCarrierRequestDTO
{

    private Long id;
    private Long containerId;
    private String containerName;
    private Long sell;
    private Long cost;

    public MultiCarrierRequestDTO()
    {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getContainerId() {
        return this.containerId;
    }

    @Generated
    public String getContainerName() {
        return this.containerName;
    }

    @Generated
    public Long getSell() {
        return this.sell;
    }

    @Generated
    public Long getCost() {
        return this.cost;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setContainerId(final Long containerId) {
        this.containerId = containerId;
    }

    @Generated
    public void setContainerName(final String containerName) {
        this.containerName = containerName;
    }

    @Generated
    public void setSell(final Long sell) {
        this.sell = sell;
    }

    @Generated
    public void setCost(final Long cost) {
        this.cost = cost;
    }

}
