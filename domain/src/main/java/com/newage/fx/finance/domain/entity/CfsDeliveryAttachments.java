package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_cfs_delivery_attachments")
public class CfsDeliveryAttachments extends Auditable<String> {

    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_type_id", length = 100)
    private Long documentTypeId;

    @Column(name = "reference_no", nullable = false, length = 100)
    private String referenceNo;

    @Column(name = "name",nullable = true,length = 60)
    private String name;

    @Column(name = "format",nullable = true,length = 200)
    private String format;

    @Column(name = "alfresco_node_id",nullable = true,length = 200)
    private String alfrescoNodeId;

    @Column(name = "document")
//    @Lob
    byte[] document;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne()
    @JoinColumn(name = "delivery_header_id", foreignKey = @ForeignKey(name = "FK_ATTACHMENTS_CFS_DELIVERY"))
    private CfsDeliveryHeaderDetails cfsDeliveryHeaderDetails;
}
