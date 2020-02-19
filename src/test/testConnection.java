package test;

import dao.BaseDao;
import dao.RainManageDao;
import service.RainManagerService;

/**
 * @Author:Michelle
 * @Description:
 * @Date:Created in 2020/2/18 10:17
 * @Modified By:
 */
public class testConnection {
    public static void main(String[] args) {
        RainManagerService service = new RainManagerService();
        System.out.println(service.getAllInfo().size());
    }
}
