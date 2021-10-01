package com.bsafe.bsafe.report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
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
    @PostMapping
    public void registerNewReport(@RequestBody Report report, HttpServletRequest httpServletRequest){
        String ip = httpServletRequest.getRemoteAddr();
        service.addNewReport(report, ip);
    }
    @DeleteMapping(path="{reportId}")
    public void deleteReport(@PathVariable("reportId") Long id){
        service.deleteReport(id);
    }
    @PutMapping(path = "{reportId}")
    public void modifyReport(
            @PathVariable("reportId") Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String description){
        service.updateReport(id, name, description);
    }
}
