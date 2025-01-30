package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

//@Entity
@Getter
@Setter

@AllArgsConstructor

public class ContainerPack  extends Auditable<String>
{

    private String statuscode;
    private String statusmessage;
    private List<Pack> packageList;
    private List<Type> container_type;

    public ContainerPack() {
        this.statuscode = "200";
        this.statusmessage = "Success";
        this.packageList = new ArrayList<>();
        this.container_type = new ArrayList<>();

        // Prepopulate package list
        Pack pkg = new Pack("PKG", "PACKAGE(s)", "PACKAGE(s)");
        packageList.add(pkg);


        // Prepopulate container types
        this.container_type.add(new Type("22G0", "20 GENERAL PURPOSE", "20 GENERAL PURPOSE"));
        this.container_type.add(new Type("42G0", "40 GENERAL PURPOSE", "40 GENERAL PURPOSE"));
        this.container_type.add(new Type("45G0", "40 HIGH CUBE", "40 HIGH CUBE"));

    }


    // Getters and Setters
    public String getStatuscode() {
        return statuscode;
    }

    public String getStatusmessage() {
        return statusmessage;
    }

    public List<Pack> getPackageList() {
        return packageList;
    }

    public List<Type> getContainer_type() {
        return container_type;
    }
}

// public class Pack {
//    private String code;
//    private String label;
//    private String value;
//
//    public Pack(String code, String label, String value) {
//        this.code = code;
//        this.label = label;
//        this.value = value;
//    }
//
//    // Getters
//    public String getCode() {
//        return code;
//    }
//
//    public String getLabel() {
//        return label;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//}

//public class Type {
//    private String code;
//    private String label;
//    private String value;
//
//    public Type(String code, String label, String value) {
//        this.code = code;
//        this.label = label;
//        this.value = value;
//    }
//
//    // Getters
//    public String getCode() {
//        return code;
//    }
//
//    public String getLabel() {
//        return label;
//    }
//
//    public String getValue() {
//        return value;
//    }
//}


















