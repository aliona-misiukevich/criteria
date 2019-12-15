package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance{
    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int FREEZER_CAPACITY;
    private int OVERALL_CAPACITY;
    private int HEIGHT;
    private int WIDTH;

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(int WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public int getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public void setFREEZER_CAPACITY(int FREEZER_CAPACITY) {
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
    }

    public int getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public void setOVERALL_CAPACITY(int OVERALL_CAPACITY) {
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public void populateFromCriteria(Criteria criteria) {
        this.FREEZER_CAPACITY = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()).toString());
        this.HEIGHT = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Refrigerator.HEIGHT.toString()).toString());
        this.OVERALL_CAPACITY = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()).toString());
        this.POWER_CONSUMPTION = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()).toString());
        this.WEIGHT = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Refrigerator.WEIGHT.toString()).toString());
        this.WIDTH = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Refrigerator.WIDTH.toString()).toString());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
