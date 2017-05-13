package code4life;

/**
 * Created by hwang on 13/05/2017.
 */
enum MoleculeType {
    A(0), B(1), C(2), D(3), E(4);

    int index;

    private MoleculeType(int index) {
        this.index = index;
    }
}
