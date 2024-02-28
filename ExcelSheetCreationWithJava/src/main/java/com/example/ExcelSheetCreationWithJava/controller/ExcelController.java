package com.example.ExcelSheetCreationWithJava.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@PostMapping("/upload")
public ResponseEntity<String> uploadExcelFile(@RequestBody MultipartFile file, @RequestHeader FileType fileType) {


    //its for only setting the excel cells regex and only for one call
    //excelFileValidationConfigService.saveConfig();
    try {
        excelSheetFileService.processExcelFile(file, fileType);
        return ResponseEntity.ok("File uploaded successfully.");
    } catch (IOException e) {
        logger.error("Failed to upload file: {}", e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Failed to upload file: " + e.getMessage());
    }


