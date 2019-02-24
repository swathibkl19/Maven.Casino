package io.zipcoder.casino.utilities.CasinoGame;

public class CrapsPlayer implements GamblingPlayer {

    String name;
    Integer balance;
    public CrapsPlayer(Player player) {
        this.name = player.getName();
        this.balance = player.getBalance();
    }

    public Integer placeBet() {
        
        return null;
    }

    public void recieveWinnings(Integer winnings) {
        balance += winnings;
    }
}
