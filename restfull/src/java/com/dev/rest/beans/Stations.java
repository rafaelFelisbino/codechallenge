/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dev.rest.beans;

/**
 *
 * @author Felisbino
 */
public class Stations {
    
    private Integer id;
    private Double latitude;
    private Double longitude;
    private String name;
    private String display_name;
    private Integer zone;
    private Integer total_lines;
    private Integer rail;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the display_name
     */
    public String getDisplay_name() {
        return display_name;
    }

    /**
     * @param display_name the display_name to set
     */
    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    /**
     * @return the zone
     */
    public Integer getZone() {
        return zone;
    }

    /**
     * @param zone the zone to set
     */
    public void setZone(Integer zone) {
        this.zone = zone;
    }

    /**
     * @return the total_lines
     */
    public Integer getTotal_lines() {
        return total_lines;
    }

    /**
     * @param total_lines the total_lines to set
     */
    public void setTotal_lines(Integer total_lines) {
        this.total_lines = total_lines;
    }

    /**
     * @return the rail
     */
    public Integer getRail() {
        return rail;
    }

    /**
     * @param rail the rail to set
     */
    public void setRail(Integer rail) {
        this.rail = rail;
    }
    
    
    
    
}
