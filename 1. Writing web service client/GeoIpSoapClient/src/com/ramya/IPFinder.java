package com.ramya;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPFinder {
	public static void main(String[] args) {
		GeoIPService geoIPService = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
		GeoIP geoIp = geoIPServiceSoap.getGeoIP(args[0].trim());
		System.out.println(geoIp.getCountryName());
	}
}