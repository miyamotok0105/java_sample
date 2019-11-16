package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import stream.Person;

public class Stream1 {

    public static void main(String[] args) {



        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("adam", true, 11));
        persons.add(new Person("tom", true, 16));
        persons.add(new Person("maery", false, 22));
        persons.add(new Person("cas", false, 2));

        // 未成年が存在するかどうかを判定する
        // //http://enterprisegeeks.hatenablog.com/entry/2014/10/20/085500
        System.out.println(existsInfant(persons));
        System.out.println(existsInfant2(persons));

        // 女性かどうか
        // http://enterprisegeeks.hatenablog.com/entry/2015/06/15/081117
        System.out.println(countBabyGirls(persons));
        System.out.println(countBabyGirls2(persons));


        //http://enterprisegeeks.hatenablog.com/entry/2015/11/30/081118
        //todo：mapの途中から
        List<String> names = new PersonUtil().collectNamesStartsWith(persons, "t");
        for (String name : names) {
            System.out.println(name);
        }

        List<String> names2 = new PersonUtil().collectNamesStartsWith2(persons, "t");
        for (String name : names2) {
            System.out.println(name);
        }


    }

    // 未成年が存在するかどうかを判定する
    public static boolean existsInfant(List<Person> persons) {
        System.out.println("未成年が存在するかどうかを判定する");
        System.out.println("ダサいコード");
        for (Person person : persons) {
            if (person.getAge() < 20) {
                return true;
            }
        }
        return false;
    }

    public static boolean existsInfant2(List<Person> persons) {
        System.out.println("いい感じのコード");
        // streamはjava8が提供する集合データ。既存のListやSetとは違う。
        // streamが呼ばれた時点で内部にpersonsを持ってる。
        // p->の部分はラムダ式。pは宣言しなくてもstreamに入ってる。
        // 型を明示しなくても良いコンパイラが型を持つ仕組みを型推論という。
        // anyMatchは関数型インターフェースを持ってる。java固有の仕組み。
        return persons.stream().anyMatch(p->p.getAge()<20);
    }

    //
    public static long countBabyGirls(List<Person> persons) {
        long count = 0;
        for (Person person : persons) {
            if (!person.isMale() && person.getAge() <= 2) {
                count++;
            }
        }
        return count;
    }

    public static long countBabyGirls2(List<Person> persons) {
        return persons.stream() //生成操作
                .filter(p -> !p.isMale() && p.getAge() <= 2) //中間操作
                .count(); //終端操作
    }



}
