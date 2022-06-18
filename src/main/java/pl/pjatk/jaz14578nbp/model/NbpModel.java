package pl.pjatk.jaz14578nbp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="value")
@ApiModel(value = "rate", description = "average rate of gold from nbp database")
public class NbpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "The unique identifier of the ask rate", required = true)
    private Integer id;
    @ApiModelProperty(value = "gold", required = true)
    private Enum gold;
    @ApiModelProperty(value = "start date of gold rate", required = true)
    private String startDate;
    @ApiModelProperty(value = "end date of gold rate", required = true)
    private String endDate;
    @ApiModelProperty(value = "average rate of gold beetwen your enter data", required = true)
    private double rate;
    @ApiModelProperty(value = "date of the ask", required = true)
    private String askDate;


    public NbpModel(Integer id, Enum gold, String startDate, String endDate, double rate, String askDate) {
        this.id = id;
        this.gold = gold;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rate = rate;
        this.askDate = askDate;
    }



    public NbpModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Enum getGold() {
        return gold;
    }

    public void setGold(Enum gold) {
        this.gold = gold;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public String getAskDate() {
        return askDate;
    }

    public void setAskDate(String askDate) {
        this.askDate = askDate;
    }
}




