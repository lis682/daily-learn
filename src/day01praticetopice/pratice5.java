package day01praticetopice;

public class pratice5{
    public static void main(String[] args) {
        /**浮点数的默认基本数据类型是double
         * 在定义float变量是要注意相关数据类型的转变
         * 例如：
         * float num1 = 3.14;
         * 此种情况相当于把double类型的3.14赋值给float类型的num1出现了大转小的现象此时系统会报错
         * 解决方法：
         * 1.float num1 = -3.14F;
         * 2.float num2 = 3.14f;
         * 3.float num3 = (float) 3.14
         *解决方法一和解决方法二虽然f的大小写不一样但是结果上等价
         */

        // 定义2个 float类型变量,分别赋值,并输出在控制台.
        float num1 = -3.14F;
        float num2 = 3.14f;
        float num3 = (float) 3.14;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        // 定义2个 double,分别赋值,并输出在控制台.
        double num4 = -3.4;
        double num5 = 3.4;
        System.out.println(num4);
        System.out.println(num5);
    }
}
