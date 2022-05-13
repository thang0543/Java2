package edu.poly.Thangdtph27626;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

abstract public class DAO<Entity> {

    protected List<Entity> list = new ArrayList<>();

    public void add(Entity entity) {
        list.add(entity);
    }

    public void remove(Entity entity) {
        list.remove(entity);
    }

    abstract public void update(Entity entity);

    abstract public Entity find(Serializable id);

    public List<Entity> getList() {
        return list;
    }

    public  void store(String path) {
        ObjectInputStream ois;
        try {
             ois = new ObjectInputStream(new FileInputStream(path));
            list = (List<Entity>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void load(String path) {
        ObjectOutputStream ous;
        try {
             ous = new ObjectOutputStream(new FileOutputStream(path));
            ous.writeObject(list);
            ous.close();
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
    
    public void ou(){
        for(Entity p : list){
            System.out.println(p);
        }
    }
}
