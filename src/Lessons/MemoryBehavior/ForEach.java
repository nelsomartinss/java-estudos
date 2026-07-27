package Lessons.MemoryBehavior;

import java.util.SequencedSet;

public class ForEach {
    void main(){
        // Syntax that instantiates the array with some values
        String[] vect = new String[] {"Nelson", "Maria", "Levi", "Amélie"};

        // Conventional Approach
        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-----------------------------------");

        // Enhanced Approach (ForEach)
        for(String names : vect){
            System.out.println(names);
        }
    }
}
