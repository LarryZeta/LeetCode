package me.zly.definition;

import java.util.Random;

/**
 * Implementation the isBadVersion API @_278.FirstBadVersion
 */

public class VersionControl {

    int n;

    int version = new Random().nextInt() % n;

    public VersionControl(int n) {
        this.n = n;
    }

    public boolean isBadVersion(int version) {

        if (version < n) return false;
        else return true;

    }

}
