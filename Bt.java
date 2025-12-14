import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bt {
    public static void main(String[] args) {
        List<Person> list= Arrays.asList(new Person("Alice", 25, 170.5),
                new Person("Bob", 25, 175.0),
                new Person("Charlie", 22, 180.0),
                new Person("David", 25, 175.0),
                new Person("Eve", 22, 165.0));
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.age != p2.age)
                    return p1.age - p2.age;  // 年龄升序
                else if (Double.compare(p1.height, p2.height) != 0)
                    return Double.compare(p2.height, p1.height); // 身高降序
                else
                    return p1.name.compareTo(p2.name); // 姓名升序
            }
        });
        System.out.println(list);
    }
}
