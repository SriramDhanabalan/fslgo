package com.newage.fx.finance.application.dto.mapper;


import com.newage.fx.finance.application.dto.response.WorkflowResponseDTO;
import com.newage.fx.finance.domain.entity.AttachmentDetail;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.entity.TriggerDetail;
import com.newage.fx.finance.domain.enums.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.stream.Collectors;

@Log4j2
@Component
public class ShipmentPostgresWorkFlowMapper {
    public WorkflowResponseDTO getOrderConfirm(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
        workflowResponseDTO.setValue(shipmentHeader.getShipmentDate());
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getPickUpFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();

        workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
        workflowResponseDTO.setValue(null);
        if (shipmentHeader.getPickUpDeliveryDetail() != null && shipmentHeader.getPickUpDeliveryDetail().getPickupRequired() == YesNo.Yes && shipmentHeader.getPickUpDeliveryDetail().getPlannedPickupDate() != null) {
            workflowResponseDTO.setValue(shipmentHeader.getPickUpDeliveryDetail().getPlannedPickupDate());
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
        }
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getWareHouseFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
        workflowResponseDTO.setValue(null);
        if (shipmentHeader.getPickUpDeliveryDetail() != null && shipmentHeader.getPickUpDeliveryDetail().getPickupRequired() == YesNo.Yes && shipmentHeader.getPickUpDeliveryDetail().getPlannedDeliveryDate() != null) {
            workflowResponseDTO.setValue(shipmentHeader.getPickUpDeliveryDetail().getPlannedDeliveryDate());
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
        }
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getDocumentFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
        workflowResponseDTO.setValue(null);
        if (shipmentHeader.getAttachmentDetail() != null && shipmentHeader.getAttachmentDetail().size() > 0) {
            shipmentHeader.getAttachmentDetail().sort(Comparator.comparing(AttachmentDetail::getLastModifiedDate).reversed());
            workflowResponseDTO.setValue(shipmentHeader.getAttachmentDetail().get(0).getLastModifiedDate());
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
        }
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getOriginCustomerFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
        workflowResponseDTO.setValue(null);
        if (shipmentHeader.getTriggerDetail() != null && shipmentHeader.getTriggerDetail().size() > 0 && shipmentHeader.getTriggerDetail().stream().filter(e -> e.getTriggerTypeName().equalsIgnoreCase("CUSTOMER")).findAny().isPresent()) {
            shipmentHeader.setTriggerDetail(shipmentHeader.getTriggerDetail().stream().filter(e -> e.getTriggerTypeName().equalsIgnoreCase("CUSTOMER")).collect(Collectors.toList()));

            if (shipmentHeader.getTriggerDetail().stream().allMatch(e -> e.getFollowUpCompleted() == YesNo.Yes)) {
                shipmentHeader.getTriggerDetail().sort(Comparator.comparing(TriggerDetail::getCreatedDate).reversed());
                workflowResponseDTO.setValue(shipmentHeader.getTriggerDetail().get(0).getFollowUpDate());
                workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
            }
        }
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getBLDraftFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        if (shipmentHeader.getServiceCode() == TransportMode.Air) {
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
            workflowResponseDTO.setValue(null);
            if (shipmentHeader.getTransportDocumentAir() != null && (shipmentHeader.getTransportDocumentAir().getHawbStatus() == HawbStatus.Draft ||
                    shipmentHeader.getTransportDocumentAir().getHawbStatus() == HawbStatus.Confirmed)) {
                workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
                shipmentHeader.getTransportDocumentAir().setTransportDocumentDetails(shipmentHeader.getTransportDocumentAir().getTransportDocumentDetails().stream().filter(p -> p.getSourceType().equals(TransportDocumentType.HAWB)).collect(Collectors.toList()));
                if (shipmentHeader.getTransportDocumentAir().getTransportDocumentDetails()!= null) {
                    workflowResponseDTO.setValue(shipmentHeader.getTransportDocumentAir().getTransportDocumentDetails().get(0).getDraftDate());
                }
            }
        } else {
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
            workflowResponseDTO.setValue(null);
            if (shipmentHeader.getTransportDocumentOcean() != null && (shipmentHeader.getTransportDocumentOcean().getHblStatus() == HawbStatus.Draft ||
                    shipmentHeader.getTransportDocumentOcean().getHblStatus() == HawbStatus.Confirmed)) {
                workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
                shipmentHeader.getTransportDocumentOcean().setTransportDocumentDetails(shipmentHeader.getTransportDocumentOcean().getTransportDocumentDetails().stream().filter(p -> p.getSourceType().equals(TransportDocumentType.HBL)).collect(Collectors.toList()));
                if (shipmentHeader.getTransportDocumentOcean().getTransportDocumentDetails() != null) {
                    workflowResponseDTO.setValue(shipmentHeader.getTransportDocumentOcean().getTransportDocumentDetails().get(0).getDraftDate());
                }
            }
        }

        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getBLConfirmation(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        if (shipmentHeader.getServiceCode() == TransportMode.Air) {
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
            workflowResponseDTO.setValue(null);
            if (shipmentHeader.getTransportDocumentAir() != null && shipmentHeader.getTransportDocumentAir().getHawbStatus() == HawbStatus.Confirmed) {
                workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
                shipmentHeader.getTransportDocumentAir().setTransportDocumentDetails(shipmentHeader.getTransportDocumentAir().getTransportDocumentDetails().stream().filter(p -> p.getSourceType().equals(TransportDocumentType.HAWB)).collect(Collectors.toList()));
                if (shipmentHeader.getTransportDocumentAir().getTransportDocumentDetails()!= null) {
                    workflowResponseDTO.setValue(shipmentHeader.getTransportDocumentAir().getTransportDocumentDetails().get(0).getConfirmedDate());
                }
            }
        } else {
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
            workflowResponseDTO.setValue(null);
            if (shipmentHeader.getTransportDocumentOcean() != null && shipmentHeader.getTransportDocumentOcean().getHblStatus() == HawbStatus.Confirmed) {
                workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
                shipmentHeader.getTransportDocumentOcean().setTransportDocumentDetails(shipmentHeader.getTransportDocumentOcean().getTransportDocumentDetails().stream().filter(p -> p.getSourceType().equals(TransportDocumentType.HBL)).collect(Collectors.toList()));
                if (shipmentHeader.getTransportDocumentOcean().getTransportDocumentDetails() != null) {
                    workflowResponseDTO.setValue(shipmentHeader.getTransportDocumentOcean().getTransportDocumentDetails().get(0).getConfirmedDate());
                }
            }
        }
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getSignOff(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.Pending);
        workflowResponseDTO.setValue(null);
        shipmentHeader.setSignOff(shipmentHeader.getSignOff().stream().filter(p -> p.getSourceType().equals(SourceType.SHIPMENT)).collect(Collectors.toList()));
        if (shipmentHeader.getRatesDetails() != null && shipmentHeader.getSignOff() != null && !shipmentHeader.getSignOff().isEmpty() && shipmentHeader.getSignOff().get(0).getIsChecked() == YesNo.Yes &&
                shipmentHeader.getSignOff().get(0).getStatusDate() != null) {
            workflowResponseDTO.setValue(shipmentHeader.getSignOff().get(0).getStatusDate());
            workflowResponseDTO.setWorkFlowStatus(WorkFlow.Completed);
        }
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getInvoice(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getLoadingFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getDepatureFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getPreAlertFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getArrivalFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getArrivalNoticeFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getJobClose(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getPODFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getTransportationFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getDOPreparation(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }

    public WorkflowResponseDTO getDestinationCustomsFollowUp(ShipmentHeader shipmentHeader) {
        WorkflowResponseDTO workflowResponseDTO = new WorkflowResponseDTO();
        workflowResponseDTO.setWorkFlowStatus(WorkFlow.NA);
        return workflowResponseDTO;
    }
}
