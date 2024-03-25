import java.util.*;

class Main {
public static void main(String[] args) {
  
  Scanner scan = new Scanner(System.in);
  	String pause = "";								// Pause variable lets me stop flow of code printed to make easier, smoother reading, instead of one huge block of text appearing
  
  					// Title //
  
  System.out.println("           __    ___        __________         ____     __          ________          ___            ___         __________         ____     __             ");
  System.out.println("          |  |  /  /       |___   ____|       |    \\   |  |        /  _____ \\        |   \\          /   |       |   ____   |       |    \\   |  |             ");
  System.out.println("          |  | /  /            |  |           |  |\\ \\  |  |       |  |    |__|       |    \\        /    |       |  |____|  |       |  |\\ \\  |  |              ");
  System.out.println("          |  |/  /             |  |           |  | \\ \\ |  |       |  |               |     \\      /     |       |   ____   |       |  | \\ \\ |  |                     ");  
  System.out.println("          |  |   \\             |  |           |  |  \\ \\   |       |  |   ____        |  |\\  \\    /  /|  |       |  |    |  |       |  |  \\ \\   |               ");
  System.out.println("          |  |\\   \\         ___|  |___        |  |   \\ \\  |       |  \\__|__  |       |  | \\  \\__/  / |  |       |  |    |  |       |  |   \\ \\  |                          ");
  System.out.println("          |__| \\___\\       |__________|       |__|    \\___|       \\__________/       |__|  \\______/  |__|       |__|    |__|       |__|    \\___|                                ");
  System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");            
               
  					// Pre-Game:  Ask Questions //
  
  System.out.println("\n\t\t\t\tHey!  Welcome to the game!\n\nThis is a text based game in which you will encounter different situations and make choices to determine the outcome of those situations (just\n like in real life!)\n\nDepending on your actions, your players favorite person will get stat bonuses or debuffs that will come into play in the endgame, but\n don't worry, play the game how you want to!\n\nSometimes, you'll come across an \"enter button to continue\" situation in which you'll simply have to press a button and hit enter to\n continue the flow of text, this is done to make the game feel more smooth and not just dump paragraghs of text at you all at once, so\n lets try one now!\n\nEnter button to continue intro: ");
  pause = scan.nextLine();
  System.out.println("\nSee, that wasn't so bad!\n\nNow to get started, lets ask a simple few questions that will hold no importance whatsoever to the rest of the game *wink wink* (I'm\n winking because it could hold slight importance)");
  System.out.println("\nGive me a name of the most handsome, intelligent, fiendish, charming guy you know, someone really good-looking: ");
  	String first_Name = scan.nextLine();
  
  Carter carter = new Carter(first_Name, false); // Sets up Carter person
  Carter mary = new Carter(first_Name, true);	// sets up Mary Sue person for if original Carter dies
  
  		if (first_Name.toLowerCase().equals("carter") || first_Name.toLowerCase().equals("carter mitchell betts") || first_Name.toLowerCase().equals("carter betts"))
        {
			System.out.println("\nReally?  That's who you thought of?  That guy?  I mean, all the power to you, but good luck in the end game with that guy, let me tell you...\n\n");
          	carter.setCool(true);
          	mary.setCool(true);
        }
  		else if (first_Name.toLowerCase().equals("nathan") || first_Name.toLowerCase().equals("nathan naples") || first_Name.toLowerCase().equals("nighthawk") || first_Name.toLowerCase().equals("night hawk") || first_Name.toLowerCase().equals("night-hawk"))
        {
          System.out.println("\nThis guys pretty good at chess, and he lifts, so props to you\n\n");
          carter.setBuff(true);
          mary.setBuff(true);
        }
  		else if (first_Name.toLowerCase().equals("ethan") || first_Name.toLowerCase().equals("ethan vaughn") || first_Name.toLowerCase().equals("vaughn"))
        {
          System.out.println("\nThis guy is really smart, like insanely smart.  He believes in himself and is ready for any mission (or 2 mile)\n\n");
          carter.setBrain(true);
          mary.setBrain(true);
        }
  		else
        {
          System.out.println("\nAwesome name!  I couldn't have picked one better myself, and I'm The Machine! (for legal purposes, I am not The Machine).\n");
        }
  
  System.out.println("Just one more question, and then we'll start!\n\nWhen searching for a significant other, someone to spend the rest of your life with, what trait do you look for most?\n");
  boolean answeredWithAnswer = false;
  System.out.println("1: Intelligence - A think, thank, thunker\n2: Strength - Lift big rock make look pretty\n3: Wealth - I like money.  That's it...\n4: Someone who can eat a lot of hot dogs - Someone who can eat a very large amount of hot dogs");
  while (answeredWithAnswer == false)
  {
    int numAnswer = scan.nextInt();
    if (numAnswer == 1)
    {
      carter.setBrain(true);
      mary.setBrain(true);
      answeredWithAnswer = true;
      System.out.print("\nA smart guy, eh?");
    }
    else if(numAnswer == 2)
    {
      carter.setBuff(true);
      mary.setBuff(true);
      answeredWithAnswer = true;
      System.out.print("\nA strong guy, huh?");
    }
    else if (numAnswer == 3)
    {
      carter.setWealth(true);
      mary.setWealth(true);
      answeredWithAnswer = true;
      System.out.print("\nSome rich man, yeah?");
    }
    else if (numAnswer == 4)
    {
      carter.setHotDog(true);
      mary.setHotDog(true);
      answeredWithAnswer = true;
      System.out.print("\nI don't understand you.");
    }
    else
    {
      System.out.println("Don't try to brake my game this early, please just choose one of the given numbers...");
    }
    
    System.out.print("  Allright, good luck!");
    
    System.out.println("\n\nEnter button to start game: ");
    pause = scan.nextLine();
    pause = scan.nextLine();
      System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");            
  }
  					// Day 0  -  Beginning //

  System.out.println("\n\n" + carter.getName() + ": \"My Kingman!  My Kingman!  The TRAVESTY of a CENTURY is upon us!\"\n");
  
  Question q1 = new Question("Get out of bed", "Stay in bed", "Tell your concubine to leave\n", 2);
  	int c1 = q1.getChoice();
  	if (c1 == 1)
    	{
      		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      		System.out.println("\nYou get out of bed and ask what your favorite concubine " + carter.getName() + " needs.\n\n" + carter.getName() + ": \"Milord, your wife the QueenMan is dead, and no longer can she reign over our lands.  YOU must take power now and lead us to safety!\n For the sake of these lands and the people of Nohose, YOU MUST LEAD!\"\n");
    	}
  	else if (c1 == 2)
    	{
      		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      		int r1 = q1.random(20);
      		if (r1 >= 1 && r1 <= 16)
            {
				System.out.println("\nYou fall back to sleep after leaving your babe unanswered.  After a restful three minutes, he throws you out of bed with the fervor of\n a male concubine.  To be honest, its not that fervent, and you rolled out of bed to make him feel better, as if he was actually pushing you around.\n\n" + carter.getName() +": \"Milord, your wife the QueenMan is dead, and no longer can she reign over our lands.  YOU must take power now and lead us to safety!\n For the sake of these lands and the people of Nohose, YOU MUST LEAD!\"\n");
            }
      		else if (r1 >= 17)
            {
              System.out.println("He never loved you.  Quite frankly, he was waiting for the day you'd ignore him and go back to sleep.  " + carter.getName() +" knew he was\n always your favorite concubine, and he knew it well.  Laying peacefully in bed, you have no idea.  He reaches for a nearby letter-opener\n and pounces on you.  The blade slides between your ribs like butter through a fat mans arteries, reaching your heart.  You die, and he\n takes over as KingMan.");
              System.out.println("\nEnter button to continue:  ");
              pause = scan.nextLine();
              Question.GAME_OVER();
            }
    	}
  	else if (c1 == 3)
    	{
      		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      		System.out.println("\nYou tell the skank to leave the premises.  When he obviously says \"What, my KingMan?\" you call the guards on him and have " + carter.getName() +" taken to the dungeons\n for intense disobedience.  After the interrogation to find out if he disobeyed your orders, you meet up with Carter in the dungeons to ask what he wanted.\n\n" + carter.getName() +": \"I forgive you my KingMan --- *cough gurgle cough* ---  for I know every decision you make --- *blood spills from his mouth* --- is for the peoples benefit.\n What I wanted to tell you earlier --- *His arm falls off* --- was that your wife, the Queenman, has died, making you the ruler of these lands.  My KingMan, YOU MUST LEAD!\"\n");
    	}
  else if (c1 == 4) 
    	{
      		if (c1 == 4)
    	{
      		System.out.println("\nStats are for nerds.  I'm talking to you Carter.  This is not a joke.  Carter (REDACTED FOR PRIVACY) who lives on\n (REDACTED FOR PRIVACY).  You lose for trying to press stats.  Never do it again. L\n\nHit and enter a button nerd, see what happens:  ");
              pause = scan.nextLine();
				Print_Carter_Face first_ever_face = new Print_Carter_Face();	
                q1.addIdiot_Point();
              System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      			Question.GAME_OVER();
      			System.exit(1);
    	}
		}
  
  Question q2 = new Question("Yes, I must lead this kingdom to safety!", "Do I have to?", "no");
     int c2 = q2.getChoice();
      System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    if (c2 == 1 && (c1 == 1 || c1 == 2))
     	{
        	System.out.println("Of course you'll lead the Kingdom to safety.  You've been ready since the day you married into the royal family, and now is your time to help\n the people and save the lands of Nohose from certain, unstoppable, palpable DOOM.  You go back to sleep in your bedchamber for eighteen hours, as\n a good KingMan is a well rested KingMan.");
      	}
  	if (c2 == 1 && c1 == 3)
     	{
        	System.out.println(carter.getName() + " is elated, nay, boisterous.  He is downrighted animated.  He jumps up out of his shackles.  He has two arms again, he's made a full recovery instantly through the\n power of friendship.  Or courtship, he's a concubine.\n\n" + carter.getName() + ": \"Oh glory be!  Hallelujah!  Man has smiled upon me today.  Thank you my KingMan, oh thank you!\"\n\nYou return to your bedchamber and make lay with haste, then you sleep for 12 hours.  Tomorrow you will lead from the throne a KingMan amongst the peopleMen.");
      	}
  	if (c2 == 2 && c1 != 3)
    	{
			System.out.println(carter.getName() + " does a double take like a cartoon character with his eyes bulging out of his head, awoogas, then sips a cup of water only to do a spit take.\n He then collects himself and the past moments erase themselves from history out of sheer cringe.\n\n" + carter.getName() + ": \"You jest my KingMan, you simply are a JOKESTER.  Sleep on this revelation and be prepared for tomorrow, as you will lead the kingdom into the ANNALS of HISTORY!\"");
    	}
  	if (c2 == 2 && c1 == 3)
    	{
		int r2 = q2.random(3);
      	if (r2 >= 1 && r2 <= 2)
        	{
				System.out.println(carter.getName() + " is a little shaken and his other arm falls off, but hes ok.  You call in a mage and they heal " + carter.getName() + ".  He makes a full recovery.\n\n" + carter.getName() + ": \"It is allright my KingMan, you jest.  Sleep on this, for tomorrow, YOU will lead this kingdom into HISTORY!\"");
        	}
      	if (r2 == 3)
        	{
          		System.out.println(carter.getName() + " dies.  Concubine \"Mary Sue\" shows up, who will now be refernced as \"" + carter.getName() + "\" for further engagements due to ease of not caring.\nMary Sue is also able to eat 37 hotdogs in under 5 minute.  This will never come back or matter.\n\n" + carter.getName() + ": \"Oh KingMan, you jokester, you funny KingMan.  Sleep over what has happened today, for tomorrow, YOU will lead us to prosperity!\""); // Remember when I said this will never come back or matter?  I lied. //
          			carter.setDead(true);
        	}
    	}
  	if (c2 == 3 && c1 == 3)
    	{
      		System.out.println(carter.getName() + " dies.  Concubine \"Mary Sue\" shows up, who will now be refernced as \"" + carter.getName() + "\" for further engagements due to ease of not caring.\nMary Sue is also able to eat 37 hotdogs in under 5 minute.  This will never come back or matter.\n\n" + carter.getName() + ": \"Oh KingMan, you jokester, you funny KingMan.  Sleep over what has happened today, for tomorrow, YOU will lead us to prosperity!\""); // Remember when I said this will never come back or matter?  I lied. //
      			carter.setDead(true);
    	}
  	if (c2 == 3 && c1 != 3)
    	{
			System.out.print(carter.getName() + ": \"You don't have a choice.\"\n\nYou try to push past " + carter.getName() + " and escape, and his weak noodle arms can do nothing.  You feel bad for him though, and you stay in your room.\n\n" + carter.getName() + ": \"Sleep on it my KingMan, for tomorrow, You will lead this kingdom to its GLORY!\"");
    	}
  
  				// Day 1  -->  7 encounters, 1 more possible, then battle //
  
  System.out.println("\n\nContinue? Just enter a button:  ");
  	pause = scan.nextLine();
  System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
  System.out.print("After a good nights rest, you start your first dqy.  I know I misspelled, stay mad.  You leave your bed ");
 	if (c2 == 1)
    	{
			System.out.print("feeling ready for the challenge.  You've been \n preparing for this day for years, and now's the time to show what you're made of.  ");
    	}
  	if (c2 == 2)
    	{
			System.out.print("unsure of your goals and what you want.  \"Why should \nI lead the peopleMen?\" you wonder,  \"Why should I even care?  I'm just a KingMan, not a KingLeaderMan.\"  ");
    	}
  	if (c2 == 3)
    	{
			System.out.print("and beat up a concubine.  She thanks you \n for the privelege.  You'll get your job done as KingMan, but you'll do it your way.  ");
    	}
  System.out.print("\n\n" + carter.getName() + ": \"My KingMan, the throne awaits!  Take your seat as ruler and let this lowly bine of yours be an advisor on your Council.\"\n\nYou take your seat and prepare for your first visitor of the day, an experience that will surely be valuable, serious, and hold meaning\n to the Kingdom of Nohose.");
  
  System.out.println("\nEnter a button to start first encounter:  ");
  	pause = scan.nextLine();
        System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");            

  int r1 = q1.random(16);  
  while (r1 == 7 || r1 == 3 || r1 == 13 || r1 == 14)
  	{
    	r1 = q1.random(16);
  	}
  int r2 = q1.random(16);
  while (r2 == r1 || r2 == 7 || r2 == 3 || r2 == 13 || r2 == 14)
  	{
		r2 = q1.random(16);
  	}
  int r3 = q1.random(16);
  while (r3 == r1 || r3 == 2 || r3 == 14)
  	{
		r3 = q1.random(16);
  	}
  int r4 = q1.random(16);
  while (r4 == r1 || r4 == r2 || r4 == r3 || r4 == 14)
  	{
		r4 = q1.random(16);
  	}
  int r5 = q1.random(16);
  while (r5 == r1 || r5 == r2 || r5 == r3 || r5 == r4 || r5 == 14)
  	{
		r5 = q1.random(16);
  	}
  int r6 = q1.random(16);
  while (r6 == r1 || r6 == r2 || r6 == r3 || r6 == r4 || r6 == r5 || r6 == 14)
  	{
		r6 = q1.random(16);
  	}
  int r7 = q1.random(16);
  while (r7 == r1 || r7 == r2 || r7 == r3 || r7 == r4 || r7 == r5 || r7 == r6 || r7 == 14)
  	{
		r7 = q1.random(16);
  	}
  
  if (carter.getDead() == true)
  {
  Encounter e1 = new Encounter(r1, mary);
  Encounter e2 = new Encounter(r2, mary);
  Encounter e3 = new Encounter(r3, mary);
  Encounter e4 = new Encounter(r4, mary);
  Encounter e5 = new Encounter(r5, mary);
  Encounter e6 = new Encounter(r6, mary);
  Encounter e7 = new Encounter(r7, mary);
  if ((r1 != 7 && r2 != 7 && r3 != 7 && r4 != 7 && r5 != 7 && r6 != 7 && r7 != 7))
  {
  	Encounter ethan = new Encounter(7, mary);
  }
  int rshop = q1.random(2);
    if ((r1 != 3 && r2 != 3 && r3 != 3 && r4 != 3 && r5 != 3 && r6 != 3 && r7 != 3) && rshop == 1)
    {
    	Encounter potions = new Encounter(3, mary);
    }
  }
  else
  {
  Encounter e1 = new Encounter(r1, carter);
  Encounter e2 = new Encounter(r2, carter);
  Encounter e3 = new Encounter(r3, carter);
  Encounter e4 = new Encounter(r4, carter);
  Encounter e5 = new Encounter(r5, carter);
  Encounter e6 = new Encounter(r6, carter);
    Encounter e7 = new Encounter(r7, carter);
    if ((r1 != 7 && r2 != 7 && r3 != 7 && r4 != 7 && r5 != 7 && r6 != 7 && r7 != 7))
    {
    	Encounter ethan = new Encounter(7, carter);
    }
    int rshop = q1.random(2);
    if ((r1 != 3 && r2 != 3 && r3 != 3 && r4 != 3 && r5 != 3 && r6 != 3 && r7 != 3) && rshop == 1)
    {
    	Encounter potions = new Encounter(3, carter);
    }
  }
  
  				// Day 2  ->  Carter fights Queenmans champion 
  
  if (carter.getDead() == true)
  {
	Encounter last = new Encounter(17, mary);
  }
  else
  {
	Encounter LAST = new Encounter(17, carter);
  }
  
  System.out.println("\nEnter button to see end game stats!: ");
  pause = scan.nextLine();
  
  System.out.println("\nCarter, when will you learn... Stats are for nerds.  Now get on and see those stats you've waited the whole game for, buddy...");
  
  System.out.println("Enter a final button to see these juicy end game stats: ");
  pause = scan.nextLine();
  
  Question.GAME_OVER();
  
  
}
}
