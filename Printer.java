// println() 메소드는 매개값을 콘솔에 출력합니다.
// println() 메소드의 매개값으로는 int, boolean, double, String 타입 값을
// 줄 수 있습니다. 다음 조건과 예제 코드를 보고 Printer 클래스에서
// println() 메소드를 오버로딩하여 선언해보세요.

// 리턴 타입 void
// 메소드 이름 logout
// 매개변수 value

import javax.print.DocFlavor.STRING;

/**
 * thisisjava
 */
public class Printer{
    public void println(int value){
        System.out.println(value);
    }

    public void println(boolean value){
        System.out.println(value);
    }

    public void println(double value){
        System.out.println(value);
    }

    public void println(String value){
        System.out.println(value);
    }
}