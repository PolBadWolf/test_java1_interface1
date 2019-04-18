package ru.polbadwolf.test.interfaces.remoteRMI;

import java.io.Serializable;
import java.rmi.*;
import java.util.ArrayList;

public interface RemoteInterface extends Remote {
    public String retStatus() throws RemoteException;
    public void putMessage(String string) throws RemoteException;
    public void putData(BlockData data) throws RemoteException;
    public void putData(BlockData[] data) throws RemoteException;

    public class BlockData implements Serializable {
        public String name;
        public int content;

        public BlockData() {
            name = null;
            content = 0;
        }

        public BlockData(String name, int content) {
            this.name = name;
            this.content = content;
        }

        @Override
        public String toString() {
            return name + ": \"" + Integer.toString(content) + "\"";
        }
    }

}
