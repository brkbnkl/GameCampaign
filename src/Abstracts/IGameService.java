package Abstracts;

import Entities.Customer;
import Entities.Game;

public interface IGameService {
    void save(Game game);

    void sellGame(Customer customer,Game game);
}
