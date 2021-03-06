package cn.soch.service;

import cn.soch.pojo.Lib;

import java.util.List;

public interface LibService {
    public void insertLib(Lib lib);
    public void deleteLibById(int id);
    public void updateLib(Lib lib);
    public Lib getLibById(int id);
    /*@Select("select * from lib")*/
    public List<Lib> listLibAll();
    public List<Lib> listLib(String keyword);
}
