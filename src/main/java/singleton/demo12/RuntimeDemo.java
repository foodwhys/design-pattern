package singleton.demo12;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version v1.0
 * @ClassName: RuntimeDemo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 *
 * public class Runtime {
 *     // 是恶汉式（静态属性）
 *     private static Runtime currentRuntime = new Runtime();
 *     public static Runtime getRuntime() {
 *         return currentRuntime;
 *     }
 *     private Runtime() {}
 * }
 *
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        //调用runtime的方法exec, 参数要的是一个命令
        Process process = runtime.exec("ipconfig");
        //调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        //读取数据
        int len = is.read(arr);//返回读到的字节的个数
        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
