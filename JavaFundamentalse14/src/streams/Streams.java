package streams;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,5,3,6,8,9,2);

//        list.stream()
//                .filter(x -> x%2==0)
//                .forEach(System.out::println);

//      ------------- 2 -------------

        Stream<Integer> s1 = Stream.empty();

        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9);
//        s2.forEach(x -> System.out.println(x));

//      ------------- 3 -------------

        Supplier<Integer> sup = () -> new Random().nextInt();
        Stream<Integer> s3 = Stream.generate(sup); // inifinite

//        s3.limit(10)
//          .forEach(x -> System.out.println(x));

//      ------------- 4 -------------

        Stream<Integer> s4 = Stream.iterate(1, i -> i+1); //infinite

//        s4.limit(10)
//           .forEach(x -> System.out.println(x));

//      ------------- 5 -------------

        Stream<Integer> s5 = Stream.iterate(1,
                                             i -> i<=10,
                                             i -> i+1);

//        s5.forEach(System.out::println);

//      ------------- 6 -------------

        boolean b1 = list.stream()
                         .anyMatch(x -> x%2==0);  //true
        boolean b2 = list.stream()
                         .allMatch(x -> x%2==0);  //false
        boolean b3 = list.stream()
                         .noneMatch(x -> x%2==0);  //false

        //System.out.println(b1+" "+b2+" "+b3);

        Stream<Integer> s61 = Stream.iterate(1, i -> i + 1); // 1 2 3 4 5 6 ...
        Stream<Integer> s62 = Stream.iterate(1, i -> i + 2); // 1 3 5 7 9 11 ...

//      ------------- 7 -------------

//        try {
//            list.stream()
//                    .forEach( x -> m(x));
//        } catch (Exception e) {
//
//        }
        // NU MERTE TRATAT ASA, EXCEPTIA TREBUIE TRATATA LA NIBELUL STREAMULUI

//      ------------- 8 -------------

        // java.util.function -> Function<T,R>
        // Function<T,T>  --> UnaryOperator<T>
        // Function<T,Boolean> --> Predicate<T>

        List<String> slist= List.of("abcd","efgh","ijkly");

        Integer rez1 = slist.stream() // "abcd","efgh","ijkl"
                            .map(s -> s.length()) //4, 4, 5
                            .reduce(0, (a,b) -> a+b);
                            // 0 + 4 = 4
                            // 4 + 4 = 8
                            // 8 + 5 = 13
        System.out.println(rez1);

//      ------------- 9 -------------

//        slist.stream()
//             .map(s -> new StringBuilder(s).reverse().toString())
//             .forEach(s -> System.out.println(s));

//      ------------- 10 -------------

        var rez2 = slist.stream() // "abcd","efgh","ijkl"
                        .mapToInt(s -> s.length()) //4, 4, 5  Stream -> IntStream
                        .sum();

//        System.out.println(rez2);

//      ------------- 11 -------------

        List<List<Integer>> listo = List.of(
                List.of(1,2,3,4,5),
                List.of(4,5,6),
                List.of(1,3)
        );

        var sum1 =
                listo.stream() // List<Integer> [1,2,3,4,5], [4,5,6], [1,3]
                        .flatMap(q -> q.stream()) // Integers [1,2,3,4,5,4,5,6,1,3]
                        .reduce(0, (a,b) -> a + b);

        //System.out.println(sum1);

//      ------------- 12 -------------

        List<String> list1 = List.of("ab4n3kdk4", "2n3n2nnm", "mko","102a");

        String digits = "0123456789";

        var count1 =
            list1.stream() // "ab4n3kdk4", "2n3n2nnm", "mko","102a"
                    .flatMap(s -> Arrays.stream(s.split(""))) // "a", "b", "4", "n", "3" ...
                    .filter(s -> digits.contains(s)) // "4", "3"
                    .count();

        //System.out.println(count1);

//      ------------- 13 -------------

        List<Integer> list13 = List.of(3,5,2,7,9,8,2,1,5,4);

//        list.stream()
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

//      ------------- 14 -------------

        Comparator<Integer> c = Collections.reverseOrder();
//        list.stream()
//                .distinct()
//                .sorted(c)
//                .forEach(System.out::println);

//      ------------- 15 -------------

        Stream<Cat> sc = Stream.of(
                new Cat(3),
                new Cat(1),
                new Cat(5),
                new Cat(4),
                new Cat(2)
        );

//        sc.sorted()
//         .forEach(x -> System.out.println(x.getAge()));

//      ------------- 16 -------------

        Stream<Dog> sd = Stream.of(
                new Dog(3),
                new Dog(5),
                new Dog(8),
                new Dog(2),
                new Dog(1),
                new Dog(5)
        );

        Comparator<Dog> comp = (d1, d2) -> d1.getAge() - d2.getAge();
//        sd.sorted(comp)
//         .forEach(x -> System.out.println(x.getAge()));

//      ------------- 17 -------------

        List<Integer> list17 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

//        list17.stream()
//                .filter(n -> n%2==0)
//                .skip(4)
//                .forEach(System.out::println);

//      ------------- 18 -------------

//        list17.stream()
//                .peek(n -> System.out.println(n))
//                .filter(n -> n%2==0)
//                .forEach(System.out::println);

//      ------------- 19 -------------

        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        List<Integer> output = new ArrayList<>();

//        input.stream()
//                .filter(n -> n%2==0)
//                .peek(n -> output.add(n))
//                .forEach(System.out::println);
//
//        System.out.println(output);

//      ------------- 20 -------------

        List<Integer> input20 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

        List<Integer> output20 =
                input20.stream()
                       .filter(n -> n%2==0)
                       .collect(Collectors.toList());

//        System.out.println(output20);

//      ------------- 21 -------------

//        input20.stream()
//                .takeWhile(n -> n<=10)
//                .forEach(System.out::println);

//      ------------- 21 -------------

//        input20.stream()
//                .dropWhile(n -> n<=10)
//                .forEach(System.out::println);

//      ------------- 22 -------------

        List<Integer> res =
            Stream.of(1,2,3,4,5,6,7,8,9,8,1)
                    .map(n -> 2*n)
                    .collect(Collectors.toList());

        System.out.println(res);

//      ------------- 23 -------------

        Set<Integer> res23 =
                Stream.of(1,2,3,4,5,6,7,8,9,5,1,9)
                        .map(n -> 2*n)
                        .collect(Collectors.toSet());

        System.out.println(res23);


    }

    static void m(int x) {
        if(x%2==0){
            throw new RuntimeException("m");
        }
        System.out.println("!");
    }
}
