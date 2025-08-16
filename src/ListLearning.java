import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListLearning {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the 5 element for List");

        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            list.add(sc.nextInt());
        }

//
//        // iterator for list
//        list.forEach(e->{
//            System.out.println(e);
//        });

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.remove(2));
        list.clear();
        System.out.println(list);
    }
}
