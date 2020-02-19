package service;

import dao.RainManageDao;
import entity.RainQuality;

import java.util.List;

/**
 * @Author:Michelle
 * @Description:
 * @Date:Created in 2020/2/18 17:37
 * @Modified By:
 */
public class RainManagerService {
    private RainManageDao rainManageDao = new RainManageDao();
    public List<RainQuality> getAllInfo(){
        return rainManageDao.getAllInfo();
    }
}
