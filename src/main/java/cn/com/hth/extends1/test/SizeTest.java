package cn.com.hth.extends1.test;

import cn.com.hth.extends1.enums.Size;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/5 22:56
 */
public class SizeTest {
    public static void main(String[] args) {
        System.out.println(Size.SMALL.getDeclaringClass());

        Size[] values = Size.values();
        for (Size size:
             values) {
            System.out.println(size.ordinal());
        }

    }


}
