package com.newage.fx.finance.service.impl;



import com.google.gson.Gson;
import com.newage.fx.finance.domain.entity.WebUserColumn;
import com.newage.fx.finance.domain.repository.WebUserColumnRepository;
import com.newage.fx.finance.domain.util.GsonUtil;
import com.newage.fx.finance.service.WebUserColumnService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service

public class WebUserColumnServiceImpl implements WebUserColumnService {

    private final WebUserColumnRepository webUserColumnRepository;

    public WebUserColumnServiceImpl(WebUserColumnRepository webUserColumnRepository) {
        this.webUserColumnRepository = webUserColumnRepository;
    }

    @Override
    @Transactional
    public WebUserColumn saveOrUpdateUserPreferences(Long serialno, String selectcolumn) {
        log.info("Method saveOrUpdateUserPreferences called for serialno: {}", serialno);

        // Convert comma-separated string to a list of columns
        String[] columns = selectcolumn.split(",");
        List<String> columnList = new ArrayList<>();
        for (String column : columns) {
            columnList.add(column.trim());
        }

        // Serialize the list of columns to a JSON string
        Gson gson = GsonUtil.getGson();
        String jsonPreferences = gson.toJson(columnList);  // Serialize to JSON string

        log.info("Serialized JSON Preferences: {}", jsonPreferences);

        // Check if a record with the given serialno exists
        WebUserColumn existingRecord = webUserColumnRepository.findBySlNo(serialno);
        if (existingRecord != null) {
            // If the record exists, update the columnPreferences field
            log.info("Updating existing record for serialno: {}", serialno);
            existingRecord.setColumnPreferences(jsonPreferences);
            return webUserColumnRepository.save(existingRecord);
        } else {
            // If no record exists, create a new one
            log.info("Creating new record for serialno: {}", serialno);
            WebUserColumn newRecord = new WebUserColumn();
            newRecord.setSlNo(serialno);
            newRecord.setColumnPreferences(jsonPreferences);
            return webUserColumnRepository.save(newRecord);
        }
    }
    @Override
    @Transactional(readOnly = true)
    public WebUserColumn getUserPreferences(Long slNo) {
        log.info("Method getUserPreferences called for slNo: {}", slNo);

        WebUserColumn userColumn = webUserColumnRepository.findBySlNo(slNo);
        if (userColumn != null && userColumn.getColumnPreferences() != null) {
            try {
                // Deserialize JSON to List for validation (optional check)
                Gson gson = GsonUtil.getGson();
                List<String> preferences = gson.fromJson(userColumn.getColumnPreferences(), List.class);

                // Set the preferences list into columnPreferencesList
                userColumn.setColumnPreferencesList(preferences);

                // Convert the list back to a comma-separated string
                String columnPreferencesFormatted = String.join(",", preferences);

                // Set the newly formatted string as the columnPreferences value
                userColumn.setColumnPreferences(columnPreferencesFormatted);

            } catch (Exception e) {
                log.error("Error processing column preferences", e);
            }
        }
        return userColumn;
    }

//    @Override
//    @Transactional(readOnly = true)
//    public WebUserColumn getUserPreferences(Long slNo) {
//        log.info("Method getUserPreferences called for slNo: {}", slNo);
//
//        WebUserColumn userColumn = webUserColumnRepository.findBySlNo(slNo);
//        if (userColumn != null && userColumn.getColumnPreferences() != null) {
//            try {
//                // Deserialize JSON to List for validation (optional check)
//                Gson gson = GsonUtil.getGson();
//                List<String> preferences = gson.fromJson(userColumn.getColumnPreferences(), List.class);
//
//                // Re-serialize to ensure valid JSON format
////                String jsonPreferences = gson.toJson(preferences);
////                log.info("Validated Preferences JSON: {}", jsonPreferences);
////
////                // Set JSON string back to the response format
//                userColumn.setColumnPreferencesList(preferences);
//            } catch (Exception e) {
//                log.error("Error processing column preferences", e);
//            }
//        }
//        return userColumn;
    }






