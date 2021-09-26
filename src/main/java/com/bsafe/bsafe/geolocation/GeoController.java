package com.bsafe.bsafe.geolocation;

import com.maxmind.geoip2.exception.GeoIp2Exception;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class GeoController {

    private final GeoIPLocationService geoIPLocationService;

    public GeoController(GeoIPLocationService geoIPLocationService) {
        this.geoIPLocationService = geoIPLocationService;
    }

    @GetMapping("/geoIP")
    public GeoIP getLocation(HttpServletRequest request) throws IOException, GeoIp2Exception {
        return geoIPLocationService.getIpLocation(request.getRemoteAddr(), request);
    }
}