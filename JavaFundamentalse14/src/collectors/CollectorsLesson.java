package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsLesson {

    public static void main(String[] args) {

        //      ------------- 1 -------------

        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        List<String> res1 =
                list.stream()
                        .collect(Collectors.toList());

        Set<String> res2 =
                list.stream()
                        .collect(Collectors.toSet());

        TreeSet<String> res3 =
                list.stream()
                        .collect(Collectors.toCollection(() -> new TreeSet<>()));


        //      ------------- 2 -------------

        Map<String, Integer> map1 =
            list.stream()
                    .collect(Collectors.toMap(
                            s -> s, //cheie
                            s -> s.length(),  //valoare
                            (a,b) -> a+b, //pentru chei duplicate
                            () -> new TreeMap<>() // tipul de date
                    ));

        System.out.println(map1);


        //      ------------- 2 -------------

        String res4 =
                list.stream()
                        .collect(Collectors.joining(",","{","}"));

        System.out.println(res4);


        //      ------------- 3 -------------

        var res5 =
                list.stream()
                        .collect(Collectors.teeing(
                                Collectors.counting(), // Long
                                Collectors.joining(), // String
                                (a,b) -> List.of(a,b)
                        ));

        System.out.println(res5);


        //      ------------- 4 -------------

        var res6 =
            list.stream()
                    .collect(Collectors.mapping(
                            s -> s.length(),
                            Collectors.toList()
                    ));

        System.out.println(res6);


        //      ------------- 5 -------------

        List<Integer> res7 =
                list.stream()
                        .collect(Collectors.mapping(
                                s -> s.length(),
                                Collectors.filtering(n -> n % 2 == 0,
                                Collectors.toList()
                                )));

        System.out.println(res7);

        //VARIANTA MAI BUNA
        List<Integer> res8 =
                list.stream()
                        .map(s -> s.length())
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());

        System.out.println(res8);


        //      ------------- 5 -------------

        Map<Boolean, Set<String>> map2 =
            list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0,
                        Collectors.toSet()));

        System.out.println(map2);


        //      ------------- 6 -------------

        Map<Integer, List<String>> map3 =
                list.stream()
                        .collect(
                                Collectors.groupingBy(s -> s.length()));

        System.out.println(map3);

        Map<Integer, String> map4 =
                list.stream()
                        .collect(
                                Collectors.groupingBy(s -> s.length(),
                                        Collectors.mapping(s -> String.valueOf(s.length()),
                                                Collectors.joining())));

        System.out.println(map4);


        //      ------------- 7 -------------

        int res71 =
                list.stream() // ["AAA", "BB", "C", "DDDDDD", "E"]
                        .mapToInt(s -> s.length())    // [3,2,1,6,1]
                        .sum();

        int res72 =
                list.stream()
                        .collect(Collectors.summingInt(s -> s.length()));


        System.out.println(res71);
        System.out.println(res72);


        //      ------------- 8 -------------

        double res81 =
                list.stream()
                        .collect(Collectors.averagingInt(s -> s.length()));

        System.out.println(res81);


        //      ------------- 9 -------------

        IntSummaryStatistics res91 =
                list.stream()
                        .mapToInt(s -> s.length())
                        .summaryStatistics();

        System.out.println(res91);


        //      ------------- 10 -------------




    }

}
