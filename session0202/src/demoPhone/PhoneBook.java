package demoPhone;

import java.util.ArrayList;
import java.util.Comparator;

public class PhoneBook extends Phone{
    ArrayList<PhoneNumber> phoneList = new ArrayList<>();


    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p: phoneList ){
            if(p.getName().equals(name)){
                if(!p.getPhones().contains(phone)){
                    p.getPhones().add(phone);
                    return;
                }

            }
        }
        phoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
//        for(PhoneNumber p : phoneList){
//            if(p.getName().equals(name)){
//                p.
//            }
//        }
        phoneList.removeIf(p->p.getName().equals(name));

    }

    @Override
    public void updatePhone(String name, String newPhone) {
        boolean flag = false;

        for(PhoneNumber p: phoneList ) {
            if (p.getName().equals(name)) {
                p.getPhones().clear();
                p.getPhones().add(newPhone);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Không tìm thấy số");
        }
    }

    @Override
    public void searchPhone(String name) {
        for(PhoneNumber p: phoneList ){
            if(p.getName().equals(name)){
                System.out.println("tìm thấy người dùng : "+name);
                return;
            }
        }
        System.out.println("ko thấy người dùng");

    }

    @Override
    public void sort() {
    //phoneList.sort(Comparator.comparing(PhoneNumber::getName));
        for (int i = 0; i<phoneList.size()-1;i++){
            for(int j = 0; j< phoneList.size()-i-1;j++){
                if(phoneList.get(j).getName().compareTo(phoneList.get(j+1).getName())>0){
                    PhoneNumber p = phoneList.get(j);
                    phoneList.set(j,phoneList.get(j+1));
                    phoneList.set(j+1,p);
                }
            }
        }
    }
}
