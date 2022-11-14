import java.util.Collections;
import java.util.LinkedList;

public class PRACTICE {
    public static void main(String[] args) {
        LinkedList<String>name = new LinkedList<String>();
        name.add("ccVolvo");
        name.add("zBMW");
        name.add("bFord");
        name.add("aMazda");
//        name.addFirst("sujan");    //addFirst add
//        name.addLast("prodhan");      //addLast
//        name.removeFirst();       //remove First
//        name.removeLast();          //remove  last
//        System.out.println(name.size());           //size();
//        System.out.println(name.getFirst());          //getFirst
//        System.out.println(name.getLast());    //getLast

//        Collections.sort(name);            //SORT array

        for(int i=0;i<name.size();i++)
        {
            System.out.println(name.get(i));
        }
//        for(String s :name)
//        {
//            System.out.println(s);        //print output
//        }


    }
}
