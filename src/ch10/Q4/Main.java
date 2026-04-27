package ch10.Q4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서 (오름차순)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                // s1과 s2를 비교 -> true / false 리턴
                return s1.compareTo(s2); // s1이 더 클 때 양수가 리턴되고, 위치가 바뀌게 됨 -> 큰 게 뒤로 가게 됨 => 오름차순
            }
        }); // Comparator 객체를 넣어줘야 함 (Comparator 인터페이스를 구현한 객체)
        System.out.println(list);

        list.sort((s1, s2) -> s1.compareTo(s2)); // 람다식 (functional interface이므로 한줄로도 가능)

        // 사전순으로 큰 순서 (내림차순)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // s2가 더 클 때 양수가 리턴되고, 위치가 바뀌게 됨 -> 큰 게 앞으로 가게 됨 => 내림차순
            }
        });
        System.out.println(list);

        list.sort((s1, s2) -> s2.compareTo(s1)); // 람다식
    }
}
