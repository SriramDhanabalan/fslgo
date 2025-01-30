package com.newage.fx.finance.service.exception;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@ToString
@Log4j2
public enum ServiceErrors {

    CHART_NOT_EXISTS("FINANCE-2000", "chart.not.found"),
    ACCOUNT_NOT_EXISTS("FINANCE-2001", "account.not.found"),
    ACCOUNT_TYPE_NOT_EXISTS("FINANCE-2002", "accounttype.not.found"),
    HEAD_NOT_EXISTS("FINANCE-2003", "head.not.found"),
    GROUP_NOT_EXISTS("FINANCE-2004", "group.not.found"),
    SUBGROUP_NOT_EXISTS("FINANCE-2005", "subgroup.not.found"),
    GL_ACCOUNT_NOT_EXISTS("FINANCE-2006", "glaccount.not.found"),
    CHART_COMPANY_NOT_EXISTS("FINANCE-2007", "chart.company.not.found"),

    ACCOUNT_NAME_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2008", "account.name.should.not.be.null.or.empty"),
//    ACCOUNT_CODE_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2009", "account.name.should.not.be.null.or.empty"),

    HEAD_NAME_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2012", "head.name.should.not.be.null.or.empty"),
    HEAD_CODE_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2013", "head.code.should.not.be.null.or.empty"),
    HEAD_CODE_SHOULD_BE_DIGITS("FINANCE-2014", "head.code.should.be.digits"),
    HEAD_ACCOUNT_SHOULD_NOT_NULL("FINANCE-2015", "head.account.should.not.be.null.or.empty"),

    GROUP_NAME_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2016", "group.name.should.not.be.null.or.empty"),
    GROUP_CODE_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2017", "group.code.should.not.be.null.or.empty"),
    GROUP_CODE_SHOULD_BE_DIGITS("FINANCE-2018", "group.code.should.be.digits"),
    GROUP_HEAD_SHOULD_NOT_NULL("FINANCE-2019", "group.head.should.not.be.null.or.empty"),

    SUBGROUP_NAME_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2020", "subgroup.name.should.not.be.null.or.empty"),
    SUBGROUP_CODE_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2021", "subgroup.code.should.not.be.null.or.empty"),
    SUBGROUP_CODE_SHOULD_BE_DIGITS("FINANCE-2022", "subgroup.code.should.be.digits"),
    SUBGROUP_GROUP_SHOULD_NOT_NULL("FINANCE-2023", "subgroup.group.should.not.be.null.or.empty"),

    GLACCOUNT_NAME_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2024", "glaccount.name.should.not.be.null.or.empty"),
    GLACCOUNT_CODE_SHOULD_NOT_NULL_OR_EMPTY("FINANCE-2025", "glaccount.code.should.not.be.null.or.empty"),
    GLACCOUNT_CODE_SHOULD_BE_DIGITS("FINANCE-2026", "glaccount.code.should.be.digits"),
    GLACCOUNT_SUBGROUP_SHOULD_NOT_NULL("FINANCE-2027", "glaccount.subgroup.should.not.be.null.or.empty"),
    GLACCOUNT_CURRENCY_SHOULD_NOT_NULL("FINANCE-2028", "glaccount.currency.should.not.be.null.or.empty"),
    GLACCOUNT_COMPANY_SHOULD_NOT_NULL("FINANCE-2029", "glaccount.company.should.not.be.null.or.empty"),
    GLACCOUNT_ACCOUNT_SHOULD_NOT_NULL("FINANCE-2030", "glaccount.account.should.not.be.null.or.empty"),
    GLACCOUNT_HEAD_SHOULD_NOT_NULL("FINANCE-2031", "glaccount.head.should.not.be.null.or.empty"),
    GLACCOUNT_GROUP_SHOULD_NOT_NULL("FINANCE-2032", "glaccount.group.should.not.be.null.or.empty"),

    RECORD_DELETE_RESTRICTED("FINANCE-2900", "record.delete.restricted"),

    CHARTACCOUNTS_NOT_DEFINED("FINANCE-3000", "chartaccounts.not.defined"),

    USER_NOT_DEFINED("FINANCE-4000", "user.not.defined"),
    UPDATED_DATE_NOT_DEFINED("FINANCE-4001", "updated.date.not.defined"),
    UPDATED_DATE_DO_NOT_MATCH("FINANCE-4002", "updated.date.do.not.match"),

    PARTY_IS_NOT_MAPPED_WITH_ACCOUNT("FINANCE-4003", "party.is.not.mapped.with.any.account"),
    SERVICE_CHARGE_NOT_MAPPED_WITH_ACCOUNT("FINANCE-4004", "service.charge.is.not.mapped.with.account"),
    VESSEL_ID_NOT_FOUND("FINANCE-4005", "vessel.id.not.found"),
    SAILING_SCHEDULE_ID_NOT_FOUND("FINANCE-4006","schedule.id.not.found" );


    public final String CODE;
    public final String KEY;

    ServiceErrors ( String code, String key ) {
        this.CODE = code;
        this.KEY = key;
    }

    public static void validateDuplicates () {

        ServiceErrors[] errorCodes = ServiceErrors.values();
        Set<String> codes = new HashSet<>();
        Set<String> keys = new HashSet<>();

        Set<ServiceErrors> duplicateKeys = Arrays.stream(errorCodes)
                .filter(n -> !codes.add(n.CODE))
                .collect(Collectors.toSet());

        Set<ServiceErrors> duplicateCodes = Arrays.stream(errorCodes)
                .filter(n -> !keys.add(n.KEY))
                .collect(Collectors.toSet());

        if (!CollectionUtils.isEmpty(duplicateKeys) || !CollectionUtils.isEmpty(duplicateCodes)) {
            if (!CollectionUtils.isEmpty(duplicateCodes))
                log.error("Found Duplicate Error Code : {} ", duplicateCodes);
            if (!CollectionUtils.isEmpty(duplicateKeys))
                log.error("Found Duplicate Error Key : {} ", duplicateKeys);
            throw new RuntimeException("Found Duplicate Error Codes");
        }
    }

    public static Set<String> getMessageKeys () {
        return Arrays.stream(ServiceErrors.values())
                .map(n -> n.KEY)
                .collect(Collectors.toSet());
    }
}
