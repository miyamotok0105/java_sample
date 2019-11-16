package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonUtil {

    public List<String> collectNamesStartsWith(List<Person> persons,
                                               String prefix) {
        List<String> names = new ArrayList<>();
        for (Person person : persons) {
            String name = person.getName();
            if (name.startsWith(prefix)) {
                names.add(name);
            }
        }
        return names;
    }

    public List<String> collectNamesStartsWith2(List<Person> persons,
                                                String prefix) {

        //Collectors.toList()を使ってる。
        //Streamの処理結果を他のクラスに変換するには、Stream#collectメソッドを使う。
        return persons.stream()
                .map(p -> p.getName()) //mapは変換。
                .filter(s -> s.startsWith(prefix))
                .collect(Collectors.toList());
    }
}