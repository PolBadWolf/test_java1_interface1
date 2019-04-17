package ru.polbadwolf.test.interfaces.remoteRMI;

import java.io.Serializable;
import java.rmi.*;

public interface RemoteInterface extends Remote {
    public String retStatus();
    public class BlockData implements Serializable {
        public String[] name;
        public int[] content;

        public BlockData() {
            name = new String[0];
            content = new int[0];
        }

        public BlockData(String[] name, int[] content) {
            this.name = name;
            this.content = content;
        }

    }
}
