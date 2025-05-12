package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Han", 2, 90),
                new Student("Hoon", 3, 90),
                new Student("Ha", 3, 89)
        );

        // 1단계: 학년별로 학생들을 그룹화해라
        Map<Integer, List<Student>> collect1_1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade, // 그룹화 기준 : 학년
                        Collectors.toList()
                ));

        System.out.println("collect1_1 = " + collect1_1);


        // 다운스트림에서 toList() 생략 가능
        Map<Integer, List<Student>> collect1_2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade
                ));

        // 2단계: 학년별로 학생들의 이름을 출력해라
        Map<Integer, List<String>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName // 다운스트림1: 학생 -> 이름 변환
                                , Collectors.toList()) // 다운스트림2: 변환된 값(이름)을 list로 수집
                ));

        System.out.println("collect2 = " + collect2);

        // 3단계: 학년별로 학생들의 수를 출력해라
        Map<Integer, Long> collect3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.counting()
                ));
        System.out.println("collect3 = " + collect3);

        // 4단계: 학년별로 학생들의 평균성적을 출력해라
        Map<Integer, Double> collect4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.averagingInt(Student::getScore)
                ));

        System.out.println("collect4 = " + collect4);
    }

}
