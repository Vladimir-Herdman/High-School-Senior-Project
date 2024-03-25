import java.util.*;

import java.lang.Math.*;

public class Question
{
  Scanner scan = new Scanner(System.in);
  
  private String question1;
  private String question2;
  private String question3;
  
  private static boolean game_over = false;
  
  private int choice;
  private int choice_times;
  private static int choice_times_overall;
  
  private static int good_Points;
  private static int neutral_Points;
  private static int based_Points;
  private static int idiot_Points;
  
  private static boolean Carter_Death = false;
  private static boolean Carter_Damaged = false;
  
  public Question()
  	{
		int apple = 7;
  	}
  public Question(String q1, String q2, String q3, int fake_number_never_mention)
  {
    question1 = q1;
    question2 = q2;
    question3 = q3;
    
    System.out.println("1: " + question1 + "\n2: " + question2 + "\n3: " + question3 + "4: View your game stats!");
    	
   	System.out.print("\nChoice: ");
    	choice = scan.nextInt();
    	choice_times++;
    	choice_times_overall++;
   	
    if (choice == 1)
    	{
			good_Points++;
    	}
    if (choice == 2)
    	{
			neutral_Points++;
    	}
    if (choice == 3)
    	{
			based_Points++;
    	}
    
      	while (choice_times < 3 && (choice != 1 && choice != 2 && choice != 3 && choice != 4))
      	{
          idiot_Points++;
        	if (choice_times == 1)
            	{
              		System.out.print("\nTry again.  It's simple.\n\nChoice: ");
        				choice = scan.nextInt();
        				choice_times++;
            	}
            else if (choice_times == 2)
            	{
              		System.out.print("\nPlease bro.  Just choose something.\n\nChoice: ");
              			choice = scan.nextInt();
        				choice_times++;
            	}
        
    		if (choice == 1)
    			{
					good_Points++;
    			}
    		else if (choice == 2)
    			{
					neutral_Points++;
    			}
    		else if (choice == 3)
    			{
					based_Points++;
    			}
      	}
      if (choice_times == 3 && (choice != 1 && choice != 2 && choice != 3 && choice != 4))
      	{
        	System.out.println("\nYou absolute fool.  You bufoon.  You waste of air on this queenmanless earth.  You don't even get that reference because you haven't played far enough into the game.  \nYou're not a closer.  You've never closed in your life.  I'M THE CLOSER.  They send you into the ninth inning to bat for ME.  You tire out the pitcher so I can \nWALK IN and hit HOMEDINGERS.  I AM THE CLOSER.  You lose.\n\nGAME OVER.\n\n-------------------------------------------------------");
        		idiot_Points++;
        		GAME_OVER();
      	}
  }
  public Question(String q1, String q2, String q3)
  {
    question1 = q1;
    question2 = q2;
    question3 = q3;
    
    System.out.println("1: " + question1 + "\n2: " + question2 + "\n3: " + question3);
    	
   	System.out.print("\nChoice: ");
    	choice = scan.nextInt();
    	choice_times++;
    	choice_times_overall++;
   	
    if (choice == 1)
    	{
			good_Points++;
    	}
    if (choice == 2)
    	{
			neutral_Points++;
    	}
    if (choice == 3)
    	{
			based_Points++;
    	}
    
      	while (choice_times < 3 && (choice != 1 && choice != 2 && choice != 3))
      	{
          idiot_Points++;
        	if (choice_times == 1)
            	{
              		System.out.print("\nTry again.  It's simple.\n\nChoice: ");
        				choice = scan.nextInt();
        				choice_times++;
            	}
            else if (choice_times == 2)
            	{
              		System.out.print("\nPlease bro.  Just choose something.\n\nChoice: ");
              			choice = scan.nextInt();
        				choice_times++;
            	}
        
    		if (choice == 1)
    			{
					good_Points++;
    			}
    		else if (choice == 2)
    			{
					neutral_Points++;
    			}
    		else if (choice == 3)
    			{
					based_Points++;
    			}
      	}
      if (choice_times == 3 && (choice != 1 && choice != 2 && choice != 3))
      	{
        	System.out.println("\nYou absolute fool.  You bufoon.  You waste of air on this queenmanless earth.  You don't even get that reference because you haven't played far enough into the game.  \nYou're not a closer.  You've never closed in your life.  I'M THE CLOSER.  They send you into the ninth inning to bat for ME.  You tire out the pitcher so I can \nWALK IN and hit HOMEDINGERS.  I AM THE CLOSER.  You lose.\n\nGAME OVER.\n\n-------------------------------------------------------");
        		idiot_Points++;
        		GAME_OVER();
      	}
  }
  
  public static void GAME_OVER()				// Initiates end of game - Points dictate end screen
  	{
      		System.out.println("\nThese are your end game stats!\n\nGood Points: " + good_Points + "\nNeutral Points: " + neutral_Points + "\nBased Points: " + based_Points + "\nIdiot Points: " + idiot_Points);
    				System.out.println("\nYou played in " + Encounter.getNumEncounters() + " different encounters");
    			System.out.print("\nYou bore witness to: ");
    		if (choice_times_overall == 1)
            {
              System.out.print(choice_times_overall + " choice. You didn't even make it over the first choice bro.  Do better \nnext time, you only have yourself to blame.\n\nYour points say you were: ");
            }
    		else
            {
              System.out.print(choice_times_overall + " choices. \n\nYour points say you were: ");
            }
    
    
      	if (good_Points == based_Points && good_Points == neutral_Points && good_Points == idiot_Points && good_Points != 0) //All end
        	{
          		System.out.print("A based, good, neutral, idiot.  What are you.  WHAT ARE YOU?!?");
        	}
    	else if (good_Points == based_Points && good_Points == neutral_Points && good_Points != idiot_Points && good_Points != 0) 										// Good Neutral Idiot end
        	{
          		System.out.print("Good, based, and neutral.  You selected all three options equally.  You're weird, choose a path.  Still love you through :3");
        	}
      	else if (good_Points > neutral_Points && good_Points > based_Points && good_Points > idiot_Points) 																// Good guy end
            {
				System.out.print("Good.  A goody two-shoes nerd that likes helping others.  Like a nerd");
            }
      	else if (neutral_Points > good_Points && neutral_Points > based_Points && neutral_Points > idiot_Points) 														// neutral guy End
        	{
          		System.out.print("Neutral.  You were a true neutral.  You did what served you, and you alone.");
        	}
      	else if (based_Points > good_Points && based_Points > neutral_Points && based_Points > idiot_Points) 															// Based guy end
        	{
          		System.out.print("Based.  You were a real one.  Thats right.  Based.  You were based.  You win.");
        	}
    	else if (idiot_Points > based_Points && idiot_Points > neutral_Points && idiot_Points > good_Points) 															// Idiot End
        	{
          		System.out.print("An idiot.  F@$& you.  You're not a closer.  Press the correct numbers next time.");
          			System.exit(1);
       	 	} 
      	else if (good_Points == neutral_Points && good_Points != 0 && good_Points != based_Points && good_Points != idiot_Points) 										// Good and neutral end
        	{
          		System.out.print("Both good and neutral.  You helped others and yourself.");
        	}
      	else if (good_Points == based_Points && good_Points != 0 && good_Points != neutral_Points && good_Points != idiot_Points) 										// Good and Based end
        	{
          		System.out.print("Both good and based.  Your interesting.  Stay golden, Ponyboy.");
        	}
      	else if (neutral_Points == based_Points && neutral_Points != 0 && neutral_Points != 0) 																			// Neutral and based end
        	{
        		System.out.print("A neutral based.  A path of rude apathy.");
        	}
    	else if (idiot_Points == good_Points && idiot_Points != 0) 																										// Good idiot end
        	{
          		System.out.print("A good idiot.  Good boooy, good booooy.  Does dummy want a treat? Yes he does... yes he does!");
        	}
    	else if (idiot_Points == neutral_Points && idiot_Points != 0) 																									// Neutral idiot
        	{
          		System.out.print("A neutral idiot.  Dumb and lazy much?");
        	}
    	else if (idiot_Points == based_Points && idiot_Points != 0) 																									//Based idiot
        	{
          		System.out.print("A based idiot.  An oxyMORON is what you are.");
        	}
    
    System.out.println("\n\nThanks for playing my game, donations go a long way to supporting me as a creator and allow me the freedom to create more projects like\n this one!  Here's the link to my goFundMe and Patreon if you feel like donating\n\n\t\twww.Don'tEverContactMe.com");
    System.exit(1);
  }
  
  			// Choice section //
  
  public int getChoice()											// Returns the choice an individiual made for a specific question
  	{
    	return choice;
  	}
  
  			// Points Section //
  
  public int getGood_Points()
  	{
    	return good_Points;
  	}
  public void addGood_Point()
  	{
    	good_Points++;	
  	}
  
  public int getNeutral_Points()
  	{
    	return neutral_Points;
  	}
  public void addNeutral_Point()
  	{
    	neutral_Points++;
  	}
  
  public int getBased_Points()
  	{
    	return based_Points;
  	}
  public void addBased_Point()
  	{
    	based_Points++;
  	}
  
  public int getIdiot_Points()
  	{
    	return idiot_Points;
  	}
  public void addIdiot_Point()
  	{
    	idiot_Points++;
  	}
  
  			// Random Section //
  
  public int random(int x)											// Random number generator --> Returns from 1 to given number (1 through x)
  	{
  		  return ((int) (Math.random() * x)) + 1;
	}
  
  
}