package util_analysis;

import java.util.HashMap;
import java.util.LinkedList;

public class Environment {

    LinkedList<LinkedList<String>> scopes = new LinkedList<LinkedList<String>>();

    public void add(String id){
        scopes.peek().push(id);
    }


    public void openScope(){
        scopes.push(new LinkedList<String>());
    }

    public void closeScope(){
        scopes.pop();
    }

    public boolean contains (String id) {


        if(scopes.peek().contains(id))
            return true;


        return false;
    }


}
