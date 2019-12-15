package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC extends Appliance{
    private int BATTERY_CAPACITY;
    private int DISPLAY_INCHES;
    private int MEMORY_ROM;
    private int FLASH_MEMORY_CAPACITY;
    private String COLOR;

    public int getBATTERY_CAPACITY() {
        return BATTERY_CAPACITY;
    }

    public void setBATTERY_CAPACITY(int BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }

    public int getDISPLAY_INCHES() {
        return DISPLAY_INCHES;
    }

    public void setDISPLAY_INCHES(int DISPLAY_INCHES) {
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }

    public int getMEMORY_ROM() {
        return MEMORY_ROM;
    }

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }

    public int getFLASH_MEMORY_CAPACITY() {
        return FLASH_MEMORY_CAPACITY;
    }

    public void setFLASH_MEMORY_CAPACITY(int FLASH_MEMORY_CAPACITY) {
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
    }

    public String getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }


    @Override
    public void populateFromCriteria(Criteria criteria) {
        this.BATTERY_CAPACITY = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()).toString());
        this.DISPLAY_INCHES = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()).toString());
        this.MEMORY_ROM = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.TabletPC.MEMORY_ROM.toString()).toString());
        this.FLASH_MEMORY_CAPACITY = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()).toString());
        this.COLOR = criteria.getCriteria().get(SearchCriteria.TabletPC.COLOR.toString()).toString();
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR=" + COLOR +
                '}';
    }
}
