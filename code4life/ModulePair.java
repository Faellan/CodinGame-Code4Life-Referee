package code4life;

import java.util.HashSet;

/**
 * Created by hwang on 13/05/2017.
 */
class ModulePair {
    HashSet<Module> set;

    public ModulePair(Module a, Module b) {
        set = new HashSet<>();
        set.add(a);
        set.add(b);
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ModulePair other = (ModulePair) obj;
        return set.equals(other.set);
    }
}
