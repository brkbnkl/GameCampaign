package Concretes;

import Abstracts.IGameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameService {
    @Override
    public void save(Game game) {
        System.out.println("Oyun Kaydedildi: " + game.getGameName());
    }

    @Override
    public void sellGame(Customer customer, Game game) {
        System.out.println(game.getGameName() + " isimli oyun " + customer.getFirstName() +" " + customer.getLastName() + " tarafından satın alındı ");
    }


}
