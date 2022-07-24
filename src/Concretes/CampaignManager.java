package Concretes;

import Abstracts.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya Eklendi: " + campaign.getCampaignName());
    }

    @Override
    public void removeCampaign(Campaign campaign) {
        System.out.println("Kampanya bitti: " + campaign.getCampaignName());
    }

    @Override
    public void upgradeCampaign(Campaign campaign) {
        System.out.println("Kampanya bilgileri güncellendi: " + campaign.getCampaignName());
    }
}
