package com.freeankit.firebaserealtimedatabase.dataObject;

import java.util.List;

/**
 * Created by J6673234 on 31/07/2017.
 */

public class CustomObject {
    private String name;
    private String jobTitle;
    private String currentLocation;
    private List<String> experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public List<String> getExperience() {
        return experience;
    }

    public void setExperience(List<String> experience) {
        this.experience = experience;
    }
}
