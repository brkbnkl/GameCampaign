package Entities;

public class Campaign {
    private String campaignName;
    private String periodOfValidity;
    private int discount;

    public Campaign(String campaignName, String periodOfValidity, int discount) {
        this.campaignName = campaignName;
        this.periodOfValidity = periodOfValidity;
        this.discount = discount;
    }

    public Campaign () {

    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getPeriodOfValidity() {
        return periodOfValidity;
    }

    public void setPeriodOfValidity(String periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
