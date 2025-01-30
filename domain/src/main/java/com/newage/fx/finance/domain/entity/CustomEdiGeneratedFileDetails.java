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
@Table(name = "nxt_custom_edi_generated_file")
public class CustomEdiGeneratedFileDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file")
    byte[] file;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "custom_edi_id",foreignKey = @ForeignKey(name = "FK_CUSTOM_EDI_ID"))
    private CustomEdiDetails customEdiDetails;

}