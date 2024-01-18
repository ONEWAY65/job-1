package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.EngateService;
import com.example.demo.service.MainfastService;
import com.example.demo.service.Order1Service;

@Controller
public class controller {

    @Autowired
    private EngateService engateService;

    @Autowired
    private MainfastService mainfastService;

    @Autowired
    private Order1Service order1Service;

    @GetMapping("/api/excel/upload")
    public String uploadExcelData(Model model) {
        // Engate 엔터티 데이터 처리
        engateService.processExcel("path/to/engate/excel/file.xlsx");
        model.addAttribute("engateData", engateService.getAllExcelData());

        // Mainfast 엔터티 데이터 처리
        mainfastService.processExcel("path/to/mainfast/excel/file.xlsx");
        model.addAttribute("mainfastData", mainfastService.getAllExcelData());

        // Order1 엔터티 데이터 처리
        order1Service.processExcel("path/to/order1/excel/file.xlsx");
        model.addAttribute("order1Data", order1Service.getAllExcelData());

        return "excel-data";
    }
}