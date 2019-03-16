package prototypeTest;

import com.gupaoedu.pattern.prototype.DeepPrototype.QiTianDaSheng;

public class DeepPrototypeTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng1 = new QiTianDaSheng();
        QiTianDaSheng qiTianDaSheng2 = null;
        try {
            qiTianDaSheng2 = (QiTianDaSheng) qiTianDaSheng1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(qiTianDaSheng1);
        System.out.println(qiTianDaSheng2);
        System.out.println(qiTianDaSheng1.birthday);
        System.out.println(qiTianDaSheng2.birthday);
        System.out.println(qiTianDaSheng1.getJinGuBang() == qiTianDaSheng2.getJinGuBang());
    }
}
