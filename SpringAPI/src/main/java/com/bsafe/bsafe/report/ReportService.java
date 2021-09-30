package com.bsafe.bsafe.report;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service
public class ReportService {

    private final ReportRepository reportRepository;
    private DatabaseReader dbReader;

    @Autowired
    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public List<Report> getReports(){
        return reportRepository.findAll();
    }

    public void addNewReport(Report report, String ip) {
        report.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
        try {
            this.RawDBDemoGeoIPLocationService();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(getLocation(ip) != null){
            report.setIp(ip);
            report.setLocation(getLocation(ip));
        }
        else{
            throw new IllegalStateException("Location Not Found");
        }
        reportRepository.save(report);
    }

    public void deleteReport(Long id) {
        Boolean exists = reportRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Report with ID: " + id + " Not Found");
        }
        reportRepository.deleteById(id);
    }

    @Transactional
    public void updateReport(Long id, String name, String description) {
        Report report = reportRepository.findById(id).orElseThrow(() -> new IllegalStateException("Report With ID: " + id + ", Does Not Exist"));
        if (report.getDescription() != null && description != null) {
            if (report.getDescription().equals(description)) {
                throw new IllegalStateException("Report Description Cannot be set to:" + description + ", Description is already set to this.");
            }
            System.out.println(description);
            report.setDescription(description);
            report.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
            reportRepository.save(report);
        }
        if(report.getName() != null && name != null){
            if(report.getName().equals(name)){
                throw new IllegalStateException("Report Name Cannot be set to:" + description + ", Name is already set to this.");
            }
            System.out.println(name);
            report.setName(name);
            report.setTimeStamp(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()));
            reportRepository.save(report);
        }
    }


    public void RawDBDemoGeoIPLocationService() throws IOException {
        File database = new File("/api/bSafe/SpringAPI/src/main/resources/maxmind/GeoLite2-City.mmdb");
        dbReader = new DatabaseReader.Builder(database).build();
    }

    @SneakyThrows
    public String getLocation(String ip)  {
        InetAddress ipAddress = InetAddress.getByName(ip);
        CityResponse response = dbReader.city(ipAddress);
        String Location = "";
        Location += response.getLocation().getLatitude().toString();
        Location += " " + response.getLocation().getLongitude().toString();
        return Location;
    }


}
