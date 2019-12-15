package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance{
    private double BATTERY_CAPACITY;
    private String OS;
    private int MEMORY_ROM;
    private int SYSTEM_MEMORY;
    private double CPU;
    private int DISPLAY_INCHS;



    public double getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(double BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public int getSYSTEM_MEMORY() {
        return SYSTEM_MEMORY;
    }

    public void setSYSTEM_MEMORY(int SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    public int getDISPLAY_INCHS() {
        return DISPLAY_INCHS;
    }

    public void setDISPLAY_INCHS(int DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    @Override
    public void populateFromCriteria(Criteria criteria) {
        String stringValue = criteria.getCriteria().get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()).toString();
        this.BATTERY_CAPACITY = Double.parseDouble(stringValue);
        this.OS = criteria.getCriteria().get(SearchCriteria.Laptop.OS.toString()).toString();
        this.CPU = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Laptop.CPU.toString()).toString());
        this.MEMORY_ROM = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Laptop.MEMORY_ROM.toString()).toString());
        this.SYSTEM_MEMORY = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()).toString());
        this.DISPLAY_INCHS = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()).toString());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", OS='" + OS + '\'' +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                ", CPU=" + CPU +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                '}';
    }
}
