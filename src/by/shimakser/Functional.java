package by.shimakser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Functional {
    protected ArrayList<User> sortList = new ArrayList<>();

    public void addUser(User user) {
        sortList.add(user);
    }

    public ArrayList<User> sortByAlphabet() {
        ArrayList<User> list = new ArrayList<>(sortList);
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User usr1, User usr2) {
                return usr1.getName().compareToIgnoreCase(usr2.getName());
            }
        });
        return list;
    }

    public ArrayList<User> userWithInternationalCalls(double longDistanceCalls) {
        ArrayList<User> list = new ArrayList<>();
        for (User usr : this.sortList) {
            if (usr.getLongDistanceCalls() > longDistanceCalls) {
                list.add(usr);
            }
        }
        return list;
    }

    public ArrayList<User> userWithBigValueLocalCalls(double urbanTimeCalls) {
        ArrayList<User> list = new ArrayList<>();
        for (User usr : this.sortList) {
            if (usr.getUrbanTimeCalls() > urbanTimeCalls) {
                list.add(usr);
            }
        }
        return list;
    }
}
