package methodref;

import lambda.lambda5.mystream.MyStreamV3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRefEx5 {

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Kim"),
                new Person("Part"),
                new Person("Lee")
        );

        List<String> result1 = MyStreamV3.of(personList)
                .map(person -> person.introduce())
                .map(str -> str.toUpperCase())
                .toList();
        System.out.println("result1 = " + result1);

        List<String> result2 = MyStreamV3.of(personList)
                .map(Person::introduce)
                .map(String::toUpperCase)
                .toList();
        System.out.println("result2 = " + result2);
    }

}
