package code4life;

/**
 * Created by hwang on 13/05/2017.
 */
abstract class Transfer {
    PlayerData player;

    public Transfer(PlayerData player) {
        this.player = player;
    }

    public abstract void apply(Referee refere);

    public abstract Translatable getSummary();
}
