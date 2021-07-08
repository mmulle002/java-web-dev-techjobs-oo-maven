package com.company;

import java.util.Objects;

public class PositionType {
    private static int nextId = 1;

    private int id;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }


    @Override
    public String toString() { //added
        return this.value;
    }

    @Override
    public boolean equals(Object o) { //added
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return id == that.id && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {   //added
        return Objects.hash(id, value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when their id fields match.

    // Getters and Setters:

    public int getId() { return this.id; };

    public String getValue() { return this.value; }

    public void setValue(String value) { this.value = value; }
}
