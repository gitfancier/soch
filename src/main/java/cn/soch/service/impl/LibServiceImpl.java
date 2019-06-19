package cn.soch.service.impl;

import cn.soch.dao.LibMaper;
import cn.soch.dao.LibMaper;
import cn.soch.pojo.Lib;
import cn.soch.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("libService")
public class LibServiceImpl implements LibService {
    @Autowired
    private LibMaper libDao;

    public void insertLib(Lib lib) {
        libDao.insertLib(lib);
    }

    public void deleteLibById(int id) {
        libDao.deleteLibById(id);
    }

    public void updateLib(Lib lib) {
        libDao.updateLib(lib);
    }

    public Lib getLibById(int id) {
        return libDao.getLibById(id);
    }

    /*@Select("select * from lib")*/
    public List<Lib> listLibAll() {
        return libDao.listLibAll();
    }


    public List<Lib> listLib(String keyword) {
        return libDao.listLib(keyword);
    }
}
