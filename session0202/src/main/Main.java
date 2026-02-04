package main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Asian a = new Asian();
        Euro e = new Euro();

        ArrayList<Person> arr = new ArrayList<>();
        arr.add(a);
        arr.add(e);

    };

    LoveTipSpecial ls = new LoveTipSpecial() {
        @Override
        public void xyz(String s, int y) {

        }
    };

    LoveTipSpecial lss = (s, y)->{

    };
    ArrayList<Integer> arrs = new ArrayList<>();
    arrs.stream().filter(i->i>0).map(i->i<10).toArray();
    }
}
