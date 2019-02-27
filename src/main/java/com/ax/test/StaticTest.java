package com.ax.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class TestClass {
    public static void hello() {
        System.out.println("hello");
    }
}

public class StaticTest {

    public  static  void testStatic() {
        System.out.println("Hello");

    }

    public static  void main(String[] args) {
        TestClass test=new TestClass();
        test.hello();
        TestClass.hello();
    }

    @Test
    public void test() {
        int leetCode = firstUniqChar("leetCode");

        System.out.println(leetCode);
    }
        public int firstUniqChar(String s) {
            //想要找到第一个不重复的字符，理论上需要辅助空间
            //此处应当校验，参数s
            if(s.length() == 1) {
                return 0;
            }
            HashMap<Character,Integer> hashMap = new HashMap<>();

            //循环遍历字符串
            for(int i = 0;i<s.length();i++){
                if(!hashMap.containsKey(s.charAt(i))) {
                    hashMap.put(s.charAt(i),i);
                }else{
                    hashMap.put(s.charAt(i),-1);
                }
            }

            int index = -1;
            Set<Map.Entry<Character,Integer>> entrySet =  hashMap.entrySet();
            for(Map.Entry<Character,Integer> entry : entrySet) {
                int temp = entry.getValue();
                if(temp >=0 && (temp<index || index < 0)){
                    index = temp;
                }

            }


            return index;
        }

}
