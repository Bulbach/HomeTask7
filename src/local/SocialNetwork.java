package local;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SocialNetwork {

    private static final HashMap<String,String> members;


    static {
        members=new HashMap<>();
    }

    public static void registerMember(String nickName,String name){
        if (!members.containsKey(nickName)){
            upMembers(nickName,name);
            System.out.println("Создан член клуба ник: " + nickName);
        }
        else {
            System.out.println("Член клуба с таким ником " + nickName +"существует");
        }
    }

    public static void unRegisterMember(String nickName){
        if (members.containsKey(nickName)){
            delMembers(nickName);
            System.out.println("Удален член клуба ник: "+ nickName);
        }
        else {
            System.out.println("Члена клуба с таким ником : " + nickName + "не существует");
        }
    }


   public static HashMap<String,String> getMembers(){
        return members;
   }
   public static void upMembers(String nickName,String name){
        members.putIfAbsent(nickName,name);
   }
   public static void delMembers(String nickName){
        members.remove(nickName);
   }

}
