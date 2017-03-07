package fan.Collection;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fanjiangqi on 2017/3/3.
 * 测试Collections.sort方法的使用
 */
public class TestCollectionsSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fanjiangqi");
        list.add("liulu");
        list.add("lulu");
        list.add("xiaozhang");
        list.add("penghua");
       // String fan = "fan";
       // list.sort(fan);
        Collections.sort(list);
        System.out.println(list);
        List<Name> listName = new ArrayList<>();
        listName.add(new Name("fan","jiangqi"));
        listName.add(new Name("fan","kk"));
        listName.add(new Name("liu","lu"));
        listName.add(new Name("fan","a"));
        listName.sort(new LastNameComparator());
        for(Name k : listName)
         System.out.println(k);

    }
}
class Name implements Comparator{
     String firstName;
   String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
        Name p1 = (Name) o1;
        Name p2 = (Name) o2;
       int firstCom = p1.firstName.compareTo(p2.firstName);
        return firstCom != 0? firstCom : (p1.lastName.compareTo(p2.lastName));

    }
}
class LastNameComparator implements Comparator<Name>{
    @Override
    public int compare(Name o1, Name o2) {
        int lastCom = o1.lastName.compareTo(o2.lastName);
        return lastCom != 0? lastCom : (o1.firstName.compareTo(o2.firstName));
    }
}
