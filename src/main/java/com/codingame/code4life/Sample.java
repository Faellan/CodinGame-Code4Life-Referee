package com.codingame.code4life;

/**
 * Created by hwang on 13/05/2017.
 */
class Sample {
    public static int ENTITY_COUNT = 0;

    MoleculeType expertise;
    int life;
    int[] cost;
    int id, rank;
    private boolean discovered;
    PlayerData discoveredBy;

    public Sample(int[] cost, int life, MoleculeType gain) {
        this.expertise = gain;
        this.life = life;
        this.cost = cost;
    }

    public void setDiscovered(boolean discovered) {
        this.discovered = discovered;

    }

    public boolean isDiscovered() {
        return discovered;

    }

    public Sample clone() {
        return new Sample(cost, life, expertise);
    }

    public String getGainChar() {
        return (expertise == null) ? "0" : expertise.name();
    }
}
