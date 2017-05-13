package code4life;

/**
 * Created by hwang on 13/05/2017.
 */
class ProductionTransfer extends Transfer {
    Sample sample;

    public ProductionTransfer(PlayerData player, Sample sample) {
        super(player);
        this.sample = sample;
    }

    @Override
    public void apply(Referee referee) {
        player.tray.remove(sample);

        for (int i = 0; i < MoleculeType.values().length; ++i) {
            int toPay = Math.max(0, sample.cost[i] - player.expertise[i]);
            player.storage[i] -= toPay;
            MoleculeType type = MoleculeType.values()[i];
            referee.molecules.put(type, referee.molecules.get(type) + toPay);
        }

        player.score += sample.life;
        if (sample.expertise != null) {
            player.expertise[sample.expertise.index]++;
        }
    }

    @Override
    public Translatable getSummary() {
        if (sample.expertise == null) {
            return new Translatable("productionNoGain", player.index, sample.id, sample.life);
        }
        return new Translatable("production", player.index, sample.id, sample.life, sample.expertise.name());
    }
}
