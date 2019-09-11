/**
 * @Author: liuwei
 * @Date: 2019/9/11 0011 15:34
 */
public class test01 {
    public static void main(String[] args) {
// 向上转型
        Animal a = new Cat();
        a.eat(); // 调用的是 Cat 的 eat
// 向下转型
        if (a instanceof Cat){
            Cat c = (Cat)a;
            c.catchMouse(); // 调用的是 Cat 的 catchMouse
        } else if (a instanceof Dog){
            Dog d = (Dog)a;
            d.watchHouse(); // 调用的是 Dog 的 watchHouse
        }
    }

}
