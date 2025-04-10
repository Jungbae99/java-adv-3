package lambda.ex2;

/**
 * 문자열을 변환하는 함수 두 개 (MyTransformer 타입)을 받아서, f1 적용 -> f2 적용하는 새로운함수를 반환하는 compose 메서들르 만들어보자. ex) f2(f1(x))
 */
public class ComposeExampleEx1 {

    public static void main(String[] args) {
        MyTransformer f1 = s1 -> s1.toUpperCase();
        MyTransformer f2 = s2 -> "**" + s2 + "**";

        String s = myTransformerTransform(f1, f2, "hello");
        System.out.println("s = " + s);

        String transform = compose(f1, f2).transform("hello");
        System.out.println("transform = " + transform);
    }

    public static String myTransformerTransform(MyTransformer f1, MyTransformer f2, String s) {
        return f1.transform(f2.transform(s));
    }

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
        return s -> f2.transform(f1.transform(s));
    }
}
