package com.newage.fx.finance.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDTO {
    private String document_type;
    private String id;
    private String file_name;
    private String document_name;
    private String document_date;
    private String link;
}