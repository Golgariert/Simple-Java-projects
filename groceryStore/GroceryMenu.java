
import java.util.ArrayList;


public class GroceryMenu {
    
    ArrayList<String> menu = new ArrayList<>();
    
    public void addMenuList(String item){
        menu.add(item);
        
    }
    
    public void printMenuList(){
        System.out.println("You have " + menu.size() + " stuff in it.");
        for(int i = 0; i < menu.size(); i++){
        System.out.println((i+1) + ". " + menu.get(i));
        }
    }
    
    public void printMenuListTwo(){
        System.out.println("You have " + menu.size() + " items in your list:");
        for(int i = 0; i < menu.size(); i++){
        System.out.println((i+1) + ". " + menu.get(i));
        }
    }    
    
    public void removeMenu (int position){
        menu.remove(position-1);
    }
    
    public void modifyItem(int position, String item){
        menu.set(position, item);
        System.out.println("The position has been modified: " + (position+1));
        
    }
    
    
}
