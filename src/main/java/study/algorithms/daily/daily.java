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

    /**
     * 입력 : apple pen
     * 출력 : applepen
     */
    public static void step7() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String c = a + b;
        System.out.println(c.trim());
    }

    /**
     * 입력 : abcde
     * 출력 :
     * a
     * b
     * c
     * d
     * e
     */
    public static void step8() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

//        for (int i = 0; i < a.length(); i++) {
//            System.out.println(a.charAt(i));
//        }

        for (char ch : a.toCharArray())
            System.out.println(ch);
    }

    /**
     * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요
     */
    public static void step9() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a % 2 == 0) ? a + " is even" : a + " is odd");
    }

    /**
     * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
     * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
     * 문자열 overwrite_string으로 바꾼 문자열을return 하는 solution 함수를 작성해 주세요.
     */
    public static String step10(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }

    /** daily 3 */

    /**
     * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
     * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
     */
    public static String step11(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        return answer;
    }

    /**
     * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
     */
    public static String step12(String[] arr) {
        String answer = "";
        for (String a: arr) {
            answer += a;
        }
        return answer;
        //return String.join("", arr);
    }

    /**
     * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
     */
    public static String step13(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
        //return my_string.repeat(k);
    }

    /**
     * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
     *
     * 12 ⊕ 3 = 123
     * 3 ⊕ 12 = 312
     * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
     *
     * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
     */
    public static int step14(int a, int b) {
        int answer = 0;

        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        answer = Math.max(Integer.parseInt(ab), Integer.parseInt(ba));
        return answer;
    }

    /**
     * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
     *
     * 12 ⊕ 3 = 123
     * 3 ⊕ 12 = 312
     * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
     *
     * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
     */
    public static int step15(int a, int b) {
        int answer = 0;

        String ab = String.valueOf(a) + String.valueOf(b);
        int ba = 2 * a * b;

        answer = Math.max(Integer.parseInt(ab), ba);
        return answer;
    }
}
