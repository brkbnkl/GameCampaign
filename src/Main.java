import Adapters.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.CustomerManager;
import Concretes.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1,"Berk","Benkel",1989,"11111111111");
        Game game = new Game(1,"Diablo 3","Roll Playing");
        Campaign campaign = new Campaign("Oyunlarda Bahar Kampanyası","Başlangıç 01.05.2022 - Bitiş 31.05.2022",20);

        MernisServiceAdapter adapter = new MernisServiceAdapter();
        CustomerManager customerManager = new CustomerManager(adapter);
        customerManager.save(customer);

        GameManager gameManager = new GameManager();
        gameManager.save(game);
        gameManager.sellGame(customer,game);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.addCampaign(campaign);

    }
}
