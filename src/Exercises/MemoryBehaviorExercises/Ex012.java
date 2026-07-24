package Exercises.MemoryBehaviorExercises;

import Exercises.MemoryBehaviorExercises.Entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rooms[] arrayRooms = new Rooms[9];
        int numberOfStudents, roomNumberStudentChoice;
        String studentName, studentEmail;

        System.out.print("\nHow many rooms will be rented? : ");
        numberOfStudents = sc.nextInt();
        sc.nextLine();

        if(numberOfStudents <= 10){
            for(int i = 0; i < numberOfStudents; i++){
                System.out.printf("%nRent #%d%n", i + 1);

                System.out.print("Name: ");
                studentName = sc.nextLine();

                System.out.print("Email: ");
                studentEmail = sc.nextLine();

                System.out.print("Room: ");
                roomNumberStudentChoice = sc.nextInt();
                sc.nextLine();

                arrayRooms[roomNumberStudentChoice] = new Rooms(studentName, studentEmail, roomNumberStudentChoice);
            }
        } else {
            System.out.println("\nWe only have 10 rooms available!");
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < arrayRooms.length; i++){
            if (arrayRooms[i] != null){
                System.out.printf("%d: %s, %s\n", arrayRooms[i].getRoom(), arrayRooms[i].getName(), arrayRooms[i].getEmail());
            }
        }

        sc.close();
    }
}
