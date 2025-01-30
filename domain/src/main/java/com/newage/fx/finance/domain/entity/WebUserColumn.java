package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_user_column")
public class WebUserColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sl_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long slNo;

    @Column(name = "column_preferences", columnDefinition = "jsonb")

    private String columnPreferences;
     @Transient
    private List< String> columnPreferencesList;

}