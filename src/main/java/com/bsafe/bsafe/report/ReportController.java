package com.bsafe.bsafe.report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/report")
public class ReportController {
    private final ReportService service;

    @Autowired
    public ReportController(ReportService service) {
        this.service = service;
    }

    @GetMapping("/ip")
    public String getDeviceList(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getRemoteAddr();
    }
    @GetMapping
    public List<Report> getReports(){
        return service.getReports();
    }

}
