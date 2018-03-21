import java.util.ArrayList;

public class ObjectPractice05 {
    public static void main(String[] args) {
        ArrayList<Person> person_array = new ArrayList<>();
        person_array.add(new Person("森田","奈良"));
        person_array.add(new Person("木村","埼玉"));
        person_array.add(new Person("高山","東京"));
        person_array.add(new Person("茂木","沖縄"));

        for(int i = 0; i < person_array.size(); i++){
            person_array.get(i).getSelfintroduction();
        }
    }
}
