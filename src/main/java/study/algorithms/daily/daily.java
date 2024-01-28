package study.algorithms.daily;

import java.util.Scanner;

public class daily {

    /** daily 1 */

    /**
     * step1
     * 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
     * 1 ≤ str의 길이 ≤ 1,000,000
     * str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
     */
    public static void step1() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        System.out.println(a);
    }

    /**
     * step2
     * 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요
     */
    public static void step2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * 문자열 str과 정수 n이 주어집니다.
     * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
     */
    public static void step3() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        System.out.println(str.repeat(n));
//        for (int i = 0; i < n; i++) {
//            System.out.printf(str);
//        }
    }

    /**
     * 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
     * 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
     */
    public static void step4() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();

        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        StringBuilder converted = new StringBuilder();
//
//        for (char ch : a.toCharArray()) {
//            if (Character.isUpperCase(ch)) {
//                converted.append(Character.toLowerCase(ch));
//            } else if (Character.isLowerCase(ch)) {
//                converted.append(Character.toUpperCase(ch));
//            } else {
//                // 알파벳이 아닌 경우 그대로 추가
//                converted.append(ch);
//            }
//        }
//        System.out.println(converted);
    }

    /**
     * 다음과 같이 출력하도록 코드를 작성해 주세요.
     * !@#$%^&*(\'"<>?:;
     */
    public static void step5() {
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }

    /** daily 2 */

    /**
     * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
     * 입력 : 4 5
     * 출력 : 4 + 5 = 9
     */
    public static void step6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));

        //System.out.printf("%d + %d = %d",a,b,a+b);

//        String c = String.format("%d + %d = %d", a, b, a+b);
//        System.out.println(c);

//        System.out.println(String.format("%d + %d = %d", a, b, a+b));
    }


}
