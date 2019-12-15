package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers extends Appliance{
    private int POWER_CONSUMPTION;
    private int NUMBER_OF_SPEAKERS;
    private String FREQUENCY_RANGE;
    private int CORD_LENGTH;

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getNUMBER_OF_SPEAKERS() {
        return NUMBER_OF_SPEAKERS;
    }

    public void setNUMBER_OF_SPEAKERS(int NUMBER_OF_SPEAKERS) {
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
    }

    public String getFREQUENCY_RANGE() {
        return FREQUENCY_RANGE;
    }

    public void setFREQUENCY_RANGE(String FREQUENCY_RANGE) {
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
    }

    public int getCORD_LENGTH() {
        return CORD_LENGTH;
    }

    public void setCORD_LENGTH(int CORD_LENGTH) {
        this.CORD_LENGTH = CORD_LENGTH;
    }

    @Override
    public void populateFromCriteria(Criteria criteria) {
        this.CORD_LENGTH = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Speakers.CORD_LENGTH.toString()).toString());
        this.POWER_CONSUMPTION = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()).toString());
        this.NUMBER_OF_SPEAKERS = Integer.parseInt(criteria.getCriteria().get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()).toString());
        this.FREQUENCY_RANGE = criteria.getCriteria().get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString()).toString();
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
                ", CORD_LENGTH=" + CORD_LENGTH +
                '}';
    }
}
