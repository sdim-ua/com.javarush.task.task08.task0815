


import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap <String, String> map = new HashMap<String, String>();
        map.put ("Иванов", "Иван");
        map.put ("Петров", "Виктор");
        map.put ("Сидоров", "Александр");
        map.put ("Антонов", "Юрий");
        map.put ("Павлов", "Виталий");
        map.put ("Козлов", "Иван");
        map.put ("Иванов", "Виктор");
        map.put ("Иванов", "Никита");
        map.put ("Антонов", "Роман");
        map.put ("Крючков", "Иван");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countName = 0;
        
    
          for (String s : map.values())
            if (s.equals(name))
                countName ++;
                
                
            return countName;   
            
            

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        
        
        int countLastName = 0;
        
        
        for (String s : map.keySet())
            if (s.equals(lastName))
                countLastName ++;

            return countLastName;   
        
         
    }

    public static void main(String[] args) {
        
         HashMap <String, String> hm = createMap ();
         
         
        
         

    }
}
