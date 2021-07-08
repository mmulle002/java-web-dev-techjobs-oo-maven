package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();  //  unsure if should be just id (not getId)
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId()); //  unsure if should be just id (not getId)
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.

      public String toString() {
        String blankData = "Data not available";

        if (name.isEmpty()) {
            name = blankData;
        }
        if (employer.getValue() == null || employer.getValue().equals("")) {
            employer.setValue(blankData);
        }
        if (location.getValue() == null || location.getValue().equals("")) {
            location.setValue(blankData);
        }
        if (positionType.getValue() == null || positionType.getValue().equals("")) {
            positionType.setValue(blankData);
        }
        if (coreCompetency.getValue() == null || coreCompetency.getValue().equals("")) {
            coreCompetency.setValue(blankData);
        }

          return  "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: "
                  + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + "\n";
      }




    }

