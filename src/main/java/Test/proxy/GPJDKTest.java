package proxy;

import com.gupaoedu.pattern.proxy.dynamicproxy.Man;
import com.gupaoedu.pattern.proxy.dynamicproxy.Person;
import com.gupaoedu.pattern.proxy.gpproxy.GPMeiPo;
import com.gupaoedu.pattern.proxy.gpproxy.GPProxy;

public class GPJDKTest {
    public static void main(String[] args) {
        GPMeiPo meipo = new GPMeiPo();
        Person person = null;
        try {
            person = (Person) meipo.getInstance(new Man());
        } catch (Exception e) {
            e.printStackTrace();
        }
        person.findLove();
    }
}
