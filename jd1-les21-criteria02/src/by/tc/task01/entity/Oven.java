package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance{
    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int CAPACITY;
    private int DEPTH;
    private double HEIGHT;
    private double WIDTH;

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

    public int getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public int getDEPTH() {
        return DEPTH;
    }

    public void setDEPTH(int DEPTH) {
        this.DEPTH = DEPTH;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public void populateFromCriteria(Criteria criteria) {
        this.CAPACITY = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Oven.CAPACITY.toString()).toString());
        this.DEPTH = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Oven.DEPTH.toString()).toString());
        this.HEIGHT = Double.parseDouble(criteria.getCriteria().get(SearchCriteria.Oven.HEIGHT.toString()).toString());
        this.POWER_CONSUMPTION = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()).toString());
        this.WEIGHT = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Oven.WEIGHT.toString()).toString());
        this.WIDTH = Double.parseDouble(criteria.getCriteria().get(SearchCriteria.Oven.WIDTH.toString()).toString());
    }

    @Override
    public String toString() {
        return "Oven{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", CAPACITY=" + CAPACITY +
                ", DEPTH=" + DEPTH +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}
