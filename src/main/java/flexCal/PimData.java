package flexCal;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PimData {
    private String item;
    private Integer duration;
    private String repeat;
    private LocalDate date;
    private LocalDateTime start;
    private LocalDateTime end;
    private Boolean businessHours;
    private Boolean split;
    private LocalDate deadLineDate;

    public PimData(){

    }

    public PimData(String item, Integer duration, String repeat, LocalDate date, LocalDateTime start,
                   LocalDateTime end, Boolean businessHours, Boolean split, LocalDate deadLineDate) {
        this.item = item;
        this.duration = duration;
        this.repeat = repeat;
        this.date = date;
        this.start = start;
        this.end = end;
        this.businessHours = businessHours;
        this.split = split;
        this.deadLineDate = deadLineDate;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Boolean getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(Boolean businessHours) {
        this.businessHours = businessHours;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
    }
}
