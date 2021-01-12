package cn.com.hth.interface1.invoke1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/12 21:25
 */
public class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler() {
    }

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("."+method.getName()+"(");
        if(args != null){
            for (int i = 0; i <args.length ; i++) {
                System.out.print(args[i]);
                if(i<args.length-1){
                    System.out.print("===,");
                }

            }
        }
        System.out.print(")");
        System.out.println();
        return method.invoke(target,args);
    }
}
