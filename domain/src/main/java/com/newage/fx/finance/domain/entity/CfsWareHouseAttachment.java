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
@Table(name = "efs_cfs_warehouse_attachment",  uniqueConstraints = {
        @UniqueConstraint(columnNames = {"document_ref_no", "header_details_id"}, name = "UK_CFS_ATTACHMENT_REF")
})
public class CfsWareHouseAttachment extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "document_ref_no", length = 100)
    String documentRefNo;

    @Column(name = "document_name", length = 100)
    private String documentName;

    /*Document Type Master*/
    @Column(name = "document_type_Id", length = 100)
    private Long documentTypeId;

    @Column(name = "file_attached")
//    @Lob
    private byte[] file;

    @Column(name = "alfresco_node_id",nullable = true,length = 200)
    private String alfrescoNodeId;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne()
    @JoinColumn(name = "header_details_id",foreignKey = @ForeignKey(name="FK_CFS_WAREHOUSE_ATTACHMENT"))
    CfsWareHouseHeaderDetails headerDetails;

}
