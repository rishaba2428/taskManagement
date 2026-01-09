

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        User[] userArray=new User[5];
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("welcome to task manager");
            System.out.println("enter your username");
            boolean isExistingUser=false;
            int currentUserPosition=0;
            String username=sc.nextLine();
            for(int count=0;count<userArray.length;count++){
                if(userArray[count] == null){
                    continue;
                }
                User user=userArray[count];
                String name=user.getUsername();
                if(name.equals(username)){
                    isExistingUser=true;
                    currentUserPosition=count;
                    break;
                }
            }
            User currentUser;
            if(isExistingUser == false){
                currentUser=new User(username);
                for(int count=0;count<userArray.length;count++)
                {
                   if (userArray[count]!=null)
                   {
                       continue;
                   }
                   userArray[count]=currentUser;
                   break;
                }


            }
            else{
                currentUser=userArray[currentUserPosition];
            }

            Integer choice=0; //autoboxing
            while(choice!=2){ //unboxing
                System.out.println("welcome ");
                System.out.println(currentUser.getUsername());
                System.out.println("1.AddTask");
                System.out.println("2.list all my task");
                System.out.println("3.ExitTask");
                System.out.println("enter your choice");
                choice=new Integer(sc.nextLine());
                if(choice==1){
                    System.out.println("enter your description");
                    String taskdescription=sc.nextLine();
                    Task usertask=new Task(taskdescription);
                 for(int count=0; count < currentUser.getTaskArray().length;count++)
                 {
                    if(currentUser.getTaskArray()[count]==null)
                    {
                        currentUser.getTaskArray()[count]=usertask;
                        break;
                    }
                 }

                    System.out.println("task added successfully");
                }
                else if(choice==2)
                {
                    for(int count=0;count<currentUser.getTaskArray().length;count++)
                    {
                       String taskDescrption=currentUser.getTaskArray()[count].getTaskdiscription();
                        System.out.println(taskDescrption);
                    }
                }
                else if(choice==3){
                    System.out.println("Tnxs for using!");
                }







            }
        }}}
