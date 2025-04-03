package lambda.start;

public class Ex0RefMain {

    public static void main(String[] args) {
        hello("hello java");
        hello("hello spring");
    }

    private static void hello(String str) {
        System.out.println("프로그램 시작");
        // 변하지 않는 부분 시작
        System.out.println(str);
        // 변하지 않는 부분 종료
        System.out.println("프로그램 종료");
    }

}
