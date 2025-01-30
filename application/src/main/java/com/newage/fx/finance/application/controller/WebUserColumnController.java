package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.response.ResponseDTO;
import com.newage.fx.finance.domain.entity.WebUserColumn;
import com.newage.fx.finance.service.WebUserColumnService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Log4j2
@RequestMapping(value = "/api")
@Tag(name = "Web User Column", description = "Web User Column Management APIs")
public class WebUserColumnController {

    private final WebUserColumnService webUserColumnService;

    public WebUserColumnController(WebUserColumnService webUserColumnService) {
        this.webUserColumnService = webUserColumnService;
    }

    @Operation(summary = "Save or update user column preferences")
    @PostMapping(value = "/user-preferences/save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> saveOrUpdatePreferences(
            @RequestParam Long sl_no,
            @RequestParam String sselectcolumn) {
        log.info("Method saveOrUpdatePreferences called for Sl_no: {}", sl_no);

        WebUserColumn savedPreferences = webUserColumnService.saveOrUpdateUserPreferences(sl_no, sselectcolumn);


        Map<String, Object> responseData = new HashMap<>();
        responseData.put("id", savedPreferences.getId());
        responseData.put("ssl_no", savedPreferences.getSlNo());
        responseData.put("sselectcolumn", savedPreferences.getColumnPreferences());


        ResponseDTO response = new ResponseDTO(
                HttpStatus.OK.value(),
                Boolean.TRUE,
                responseData,  // Return the customized response
                null
        );

        log.info("Method saveOrUpdatePreferences completed successfully");
        return ResponseEntity.ok(response);
    }

    @Operation(summary = "Get user column preferences")
    @GetMapping(value = "/user-preferences/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getUserPreferences(@RequestParam Long Sl_no) {
        log.info("Method getUserPreferences called for slNo: {}", Sl_no);


        WebUserColumn preferences = webUserColumnService.getUserPreferences(Sl_no);


        Map<String, Object> responseData = new HashMap<>();
        responseData.put("sserialno", preferences.getSlNo());
        responseData.put("sselectcolumn", preferences.getColumnPreferencesList());

        ResponseDTO response = new ResponseDTO(
                HttpStatus.OK.value(),
                Boolean.TRUE,
                responseData,
                null
        );

        log.info("Method getUserPreferences completed successfully");
        return ResponseEntity.ok(response);
    }


}