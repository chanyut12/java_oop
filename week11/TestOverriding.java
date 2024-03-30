package week11;


class testBOverriding {
    public void p(double i){
        System.out.println(i *2);
    }
}
class testAOverriding extends testBOverriding{
    public void p(int i){
        System.out.println(i);
    }
}

public class TestOverriding {
    public static void main(String[] args) {
        testAOverriding a = new testAOverriding();
        a.p(10);
        a.p(10.0);
    }
}

// ง่ายๆคือถ้าค่า parameter ที่มันรับนั้นเป็นค่าชนิดตัวแปรเดียวกันมันจะคิด class ที่ interited 
// แต่ถ้ารับค่า parameter ืที่มีชนิดต่างกันก็คิดตามตัวได้เลยว่าตัวไหนรับค่า parameter เป็น data type ไหน
