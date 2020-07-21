package util_analysis;

import java.util.HashMap;
import java.util.LinkedList;

public class Environment {

    LinkedList<LinkedList<String>> varScopes = new LinkedList<LinkedList<String>>();
    LinkedList<LinkedList<String>> funScopes = new LinkedList<LinkedList<String>>();

    public void addVariable(String id){
        varScopes.peek().push(id);
    }

    public void addFunction(String id){
        funScopes.peek().push(id);
    }

    public void openScope(){
        varScopes.push(new LinkedList<String>());
        funScopes.push(new LinkedList<String>());
    }

    public void closeScope(){
        varScopes.pop();
        funScopes.pop();
    }

    public boolean containsVariable (String id) {

        for(LinkedList<String> s : varScopes)
            if(s.contains(id))
                return true;


        return false;
    }

    public boolean containsFunction (String id) {

        for(LinkedList<String> s : funScopes)
            if(s.contains(id))
                return true;


        return false;
    }


}
