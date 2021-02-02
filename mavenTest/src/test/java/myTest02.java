/*
@Author:南柯一梦
@Contact:2890241339@qq.com
@Date:2021/2/2
*/

//import java.util.Scanner;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
public class myTest02 {

    @Test
    public void fun(){
        System.out.println("hello");
        DruidDataSourceFactory druidDataSourceFactory = new DruidDataSourceFactory();
        System.out.println(druidDataSourceFactory);

    }

}
