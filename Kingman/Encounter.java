import java.util.*;

public class Encounter{
  private static int encounters;		// Number of encounters witnessed

  public Encounter()
  	{
    	System.out.print("NOT CORRECT NOT CORRECT NOT CORRECT NOT CORRECT");
  	}
  public Encounter(int x, Carter conc)
  	{
    	encounters++;
    		Scanner scan = new Scanner(System.in);
  				String pause2 = "";
    
    	if (x == 1) // Carter fights a knight pining for your affection (sword)
        	{
          		System.out.println("\n" + conc.getName() + ": \"Milord, a knight approaches from a sovereign land!\"\n\nA knight approaches from a soverign land.\n\nEnter a button to continue:  ");
          			pause2 = scan.nextLine();
          		System.out.println("\nKnight: \"Oh valiant KingMan, oh wondrous ruler, oh lover of the night, oh one who knows no bounds.  I, sir Gilarmos, come to you today in search of something we\n all seek at one time or another, I seek love...  Your love, that is!\"\n\n" + conc.getName() + ": \"WHA-\"\n\nSir Gilarmos: \"Now don't play coy KingMan, I know you see it two.  The both of us on a beach, love in the air, mimosas in our hands...  What say you?\"\n");
        			Question e1 = new Question("We should go on a date first, this is so sudden...","I respect the approach, but I have feelings for another...","Nah");
        				int c_e_1 = e1.getChoice();
          					int re1 = e1.random(20);
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
          
          		if (c_e_1 == 1)
                	{
                          System.out.println("\nSir Gilarmos: \"I understand, I was too sudden, but I can do better...  Want to go on a dat-\"\n\n" + conc.getName() + ": \"HE's MINE!!!\"\n\nSir Gilarmos: \"Wha... na... NAY, this ones love belongs to ME!  EN GARDE!\"\n\n" + conc.getName() + " runs up to Gilarmos and starts to fight.  " + conc.getName() + " bobs, but Gilarmos weaves.  When Gilarmos zigs, " + conc.getName() + " zags.  The fight is pretty\n intense, so intense that I could not describe any further, as fear tells me the faint of heart could be harmed.  Just know, it was pretty rad.");
                	}
          		else if (c_e_1 == 2)
                	{
                          System.out.println("\nSir Gilarmos: \"You have feelings for another!  Where are they, I'll test the strength of my arm on one so bold as to beat me to the punch!\"\n\n" + conc.getName() + ": \"Tis I his lover, and none more so deserving of such affection.  EN GARDE!\"\n\n" + conc.getName() + " runs up to Gilarmos and starts to fight.  " + conc.getName() + " bobs, but Gilarmos weaves.  When Gilarmos zigs, " + conc.getName() + " zags.  The fight is pretty\n intense, so intense that I could not describe any further, as fear tells me the faint of heart could be harmed.  Just know, it was pretty rad.");
                	}
          		else
                	{
                  		System.out.println("\nSir Gilarmos: \"You DARE deny MY love!?!  How DARE!  I DARE! you to come down and fight me like a man!\"\n\n" + conc.getName() + ": \"Don't worry, my KingMan, as your faithful concubine, I will fight for you to the bitter end!\"\n\n" + conc.getName() + " runs up to Gilarmos and starts to fight.  " + conc.getName() + " bobs, but Gilarmos weaves.  When Gilarmos zigs, " + conc.getName() + " zags.  The fight is pretty\n intense, so intense that I could not describe any further, as fear tells me the faint of heart could be harmed.  Just know, it was pretty rad.");
                	}
          System.out.println("\nEnter a button to continue:  ");
          pause2 = scan.nextLine();
          		if (conc.getBuff() == true)
                {
					if (re1 > 1)
                    {
                      	conc.setSword(true);
                      	conc.setArmor(true);
                      	System.out.println("\nSir Gilarmos is a heap of rubble and meat at this point.  " + conc.getName() + " messed him up, tore him asunder, really grinded his gears.  Striding back\n with the swagger of a male concubine, " + conc.getName() + " took Gilarmos' armor and sword as reward for his victory, and he dons it in front of you.  Sensually.\n\n" + conc.getName() + ": \"My Kingman!  Victory to our people.  Victory to our lands.  Victory to you, my Kingman!\"");
                    }
                  	else
                    {
						conc.setHurt(true);
                      	conc.setSad(true);
                      	System.out.println("\nThat was pretty bad.  " + conc.getName() + "'s' hurt, Gilarmos is laughing, and your pride is diminishing...\n\nSir Gilarmos: \"Hmph... Well well well... Looks like your concubine stood no chance against my affection... You know, I can't\n really love someone who has such WEAK friends, so I'll just let myself out...\n\nSir Gilarmos leaves the building.  " + conc.getName() + " is straight sobbing.\"");
                    }
                }
          		else 
                {
                  if (re1 > 10)
                  {
                    	conc.setSword(true);
                    	conc.setArmor(true);
                    	System.out.println("\nSir Gilarmos is a heap of rubble and meat at this point.  " + conc.getName() + " messed him up, tore him asunder, really grinded his gears.  Striding back\n with the swagger of a male concubine, " + conc.getName() + " took Gilarmos' armor and sword as reward for his victory, and he dons it in front of you.  Sensually.\n\n" + conc.getName() + ": \"My Kingman!  Victory to our people.  Victory to our lands.  Victory to you, my Kingman!\"");
                  }
                  else
                  {
						conc.setHurt(true);
                    	conc.setSad(true);
                    	System.out.println("\nThat was pretty bad.  " + conc.getName() + "'s hurt, Gilarmos is laughing, and your pride is diminishing...\n\nSir Gilarmos: \"Hmph... Well well well... Looks like your concubine stood no chance against my affection... You know, I can't\n really love someone who has such WEAK friends, so I'll just let myself out...\n\nSir Gilarmos leaves the building.  " + conc.getName() + " is straight sobbing.\"");
                  }
                }
          System.out.println("Enter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 2) // Hot dog Man - Carter Competition (win - armour, loss - sad)
        	{
          		System.out.println("A man enters the chambers.  He's covered in studded leather from head to toe with a whip on his waist, and he\n has a mask with a hole.  It kind of looks like this: ");
          		System.out.println("		 _______");
          		System.out.println("		/.  .  .\\");
          		System.out.println("		| o   o |");
          		System.out.println("		|.  3  .|");
          		System.out.println("		\\__.O.__/");
          		System.out.println("\nLeather Face: \"Ahoy ye salty sea dogg, I approach!  I challenge you to a hot dogg eatin contest, and I won't take no fer an answer!\"\n");
          
          		Question e2 = new Question("Of course, " + conc.getName() + " was born for this!","If we have to...","no");
          			int c_e_2 = e2.getChoice();
          
          		if (c_e_2 == 3)
                	{
                  		conc.setSad(true);
                  		System.out.println("\nLeather Face: \"Oh ok\"\n\nHe leaves.  Good job having fun bro.\n");
                  return;
                	}
          		else 
                	{
                  		if (c_e_2 == 1)
                        {
							System.out.println("\nLeather Face: \"Thar's the spirit!  Come on dawrn an fite fer yer right to dogg!\"\n\n" + conc.getName() + ": \"My Kingman, I was born for this!  If anything, I'll show you what I learnt all those years ago!\"\n\n" + conc.getName() + " goes on down to the man in leather.  He pulls out a table, and the leather man pulls out plates and hot doggs.  \n");
                        }
                  		else
                        {
                          	System.out.println("\nLeather Face: \"I mean, not realy.  Do you want to?\"\n\n Yes or No:  ");
                          		String answer = scan.nextLine();
                          		if (answer.toLowerCase().equals("yes"))
                                {
                                  	System.out.println("\nLeather Face: \"Dont feel pressured to do this, are you sure?\"\n\nYes or No:  ");
                                  	String answer2 = scan.nextLine();
                                  	if (answer2.toLowerCase().equals("yes"))
                                		{
                                  			System.out.println("\nLeather Face: \"Arright thern, Prepare fer battle!\"\n\n" + conc.getName() + ": \"My Kingman, let me take this battle for you!  I'll show you what I know, I've trained too hard to lose now!\"\n\n" + conc.getName() + " goes on down to the man in leather.  He pulls out a table, and the leather man pulls out plates and hot doggs.");
                                		}
                          			else if (answer2.toLowerCase().equals("no"))
                                		{
											System.out.println("\nLeather Face: \"Oh ok\"\n\nHe leaves.  Good job having fun bro.\n");
                                      		return;
                                		}
                                  	else
                                    	{
                                      		while (!answer.toLowerCase().equals("yes") || !answer.toLowerCase().equals("no"))
                                            	{
                                              		System.out.println("\nTry again, Yes or No, not that hard:  ");
                                  				answer2 = scan.nextLine();
                          							if (answer2.toLowerCase().equals("yes"))
                                						{
                                  							System.out.println("\nTook you a while to answer there, but anyways, prepare for battle!!\"\n\n" + conc.getName() + ": \"My Kingman, let me take this battle for you!  I'll show you what I know, I've trained too hard to lose now!\"\n\n" + conc.getName() + " goes on down to the man in leather.  He pulls out a table, and the leather man pulls out plates and hot doggs.");
                                						}
                          							else if (answer2.toLowerCase().equals("no"))
                                						{
															System.out.println("\nLeather Face: \"Oh ok\"\n\nHe leaves.  Good job having fun bro.\n");
                                     						return;
                                						}	
                                            	}
                                    	}
                                }
                          		else if (answer.toLowerCase().equals("no"))
                                	{
										System.out.println("\nLeather Face: \"Oh ok\"\n\nHe leaves.  Good job having fun bro.\n");
                                  		return;
                                	}
                          		else
                                	{
                          				while (!answer.toLowerCase().equals("yes") || !answer.toLowerCase().equals("no"))
                                			{
                                  				System.out.println("\nTry again, Yes or No, not that hard:  ");
                                  				answer = scan.nextLine();
                          							if (answer.toLowerCase().equals("yes"))
                                						{
                                  							System.out.println("\nTook you a while to answer there, but anyways, prepare for battle!!\"\n\n" + conc.getName() + ": \"My Kingman, let me take this battle for you!  I'll show you what I know, I've trained too hard to lose now!\"\n\n" + conc.getName() + " goes on down to the man in leather.  He pulls out a table, and the leather man pulls out plates and hot doggs.");
                                						}
                          							else if (answer.toLowerCase().equals("no"))
                                						{
															System.out.println("\nLeather Face: \"Oh ok\"\n\nHe leaves.  Good job having fun bro.\n");
                                     						return;
                                						}
                                			}
                                	}
                        }
                  System.out.println("Enter a button to continue to Hot Dog Contest:  ");
                  	pause2 = scan.nextLine();
                  System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                  
                  int re2 = e2.random(20);
                  	if(conc.getHotDog())
                    {
                      conc.setArmor(true);
                      conc.setSad(false);
                      conc.setFat(true);
                      System.out.println("\n\nMy God.  " + conc.getName() + " just keeps going.  The leather dude stopped hours ago, but " + conc.getName() + " just keeps going.  I'm scared.  I don't know what else to say.  You win...\n\nLeatehr Face: \"...Good jerb pal, I'll just.. uh... Leave my mask for you.  It's yours, I don't want it anymore.  You are a\n true gobbler, and I am but a mere ant...  You win.\"\n\n" + conc.getName() + ": \"Muh Kingman... I won... hah... Come ohn... Welcome thuh next pershon.\"");
                    }
                  	else
                    {
                      if (re2 > 10)
                      {
                        conc.setArmor(true);
                      	conc.setSad(false);
                      	conc.setFat(true);
                        System.out.println("\n\nIt's neck and neck, dog to dog, face to plate.  Leather Face grabs a dog, and " + conc.getName() + " grabs one back.  They slide\n right into the mask, but " + conc.getName() + " eats just as fast.  And then, he falls.  Leahter Face can't take another, and " + conc.getName() + " just has to\n eat one more to win.  He's lethargic, he's tired, he's broken, but he wants this.  He needs this.  He has this.  He reaches\n up slowly, the cholesterol thicker than the blood in his veins, and he gets that dog into his mouth.  " + conc.getName() + " wins, but at what cost?\n\nLeather Face: \"You, are a true competitor... \"");
                      }
                      else
                      {
						conc.setSad(true);
                        conc.setFat(true);
                        System.out.println("\n\nQuite frankly, it was sad to watch.  As sure as God wears sandals, " + conc.getName() + " stood no chance against this adversary, this foe, this\n Devil Dogg.  Time and again, the hot dogs just slid down that mask hole, while all you could do was sit by and watch helplessly\n as " + conc.getName() + " filled up and stopped.");
                      }
                    }
                  	
                  	System.out.println("\nLeather Face simply leaves and goes home, wherever that kind of guy lives, I don't know, figure it out yourself...");
                }
          System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 3) // Potion Merchant (potions and vials)
        	{
          		System.out.println("A generic wizard of ye old shows up in a garb of some far off land.  He has a peculiar hat on of the most intruiging\n fashion.  This is a text game, use your imagination.\n\nDhophiar: \"Hail and well met!  I come from a far off land you would not know the name of, and I bring supplise that may aid you in future endeavor.  For\n these purposes, I offer to you my shop, and if you dare, you may partake purchase of my potions.\"\n");
          		Question e3 = new Question("I like potions, I'll see what you have!","Let me see whats for sale first...","I don't want your dirty, run-down, backwater, from a far away land lookin, peculiar hat, backwards logic nonsense havin, generic wizard basic look in my Kingdom, get out of here");
        			int c_e_3 = e3.getChoice();
          
          		if (c_e_3 == 1 || c_e_3 == 2)
                	{
                    	System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                  		System.out.println("\nDhophiar: \"Spectacular!  Check my wares, is there anything you want to buy?\"\n\nYou see a small wooden cart with various glass bottles and jars neatly arranged on top. The cart itself is adorned with intricate\n carvings and appears to have been well-crafted.  As you step closer, you see the various potions and elixirs on display, each labeled\n with a small tag indicating its name and purpose. Some are brightly colored and fizzing with energy, while others appear murky and thick.\n\nHere are the potions that most stand out to you:  \n\n 1:  Strength Potion - Makes you stronger, obvious, why even ask\n 2:  Speed Potion - Might be crack cocaine, who knows\n 3:  Health Potion - Heals you, don't know what else to say\n 4:  A Vial of Acid - A vial of acid");
                  		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                  		System.out.println("\nDhophiar: \"Listen, I need to sell in other markets, networking and that bizz, so you can only buy one potion.  Some Ethan guy has been stealing my\n costumers, so I need to get to other markets fast.\"\n\nInput number of the potion you wish to buy, (5 if you do not want to buy one):  ");
                  			int buyedPotion = scan.nextInt();
                  				boolean purchasedPotion = false;
                  				while (!purchasedPotion)
                                	{
                  						if (buyedPotion == 1)
                            				{
                              					conc.setStrengthPotion(true);
                                          		conc.setWealth(false);
                                          		purchasedPotion = true;
                            				}
                  						else if (buyedPotion == 2)
                            				{
                              					conc.setSpeedPotion(true);
                                          		conc.setWealth(false);
                                          		purchasedPotion = true;
                            				}
                  						else if (buyedPotion == 3)
                            				{
                              					conc.setHealthPotion(true);
                                          		conc.setWealth(false);
                                          		purchasedPotion = true;
                            				}
                  						else if (buyedPotion == 4)
                            				{
                              					conc.setAcid(true);
                                          		conc.setWealth(false);
                                          		purchasedPotion = true;
                            				}
                  						else if (buyedPotion == 5)
                            				{
                              					System.out.println("\nDhophiar: \"It's all good, sorry none of my potions intersted you, thanks for your time!\"");
                                          		purchasedPotion = true;
                            				}
                                  		else
                                        	{
                                          		System.out.println("\nTry again, just one out of five numbers, not that hard...\n");
                                          		buyedPotion = scan.nextInt();
                                        	}
                                	}
                  System.out.println("\nDhophiar leaves the castle, his cart magically gone through some trick of unexplained magic, probably why you did not notice it when he enetered, yeah...");
                	}
          		else
                	{
                  		conc.setCursed(true);
                  		System.out.println("\nDhophiar: \"How dare you insult my potions and clothes, you impudent ignoramus! I have spent countless hours perfecting the recipes for\n each and every one of these elixirs, tinctures, and poultices. Do you have any idea the level of precision and care that goes into\n the creation of a potion? It is not a simple matter of mixing ingredients together, oh no! It requires a deep understanding of\n the properties of each ingredient, the right balance of magical energy, and the perfect timing of each step in the brewing process.  And\n yet you stand there and have the audacity to insult my potions, without even the slightest inkling of the knowledge and skill required to create\n them. You are not fit to even handle the vials they come in, let alone understand their true power.  But mark my words, ignorant one, one\n day you will rue the day you dared to cross a potion seller of my caliber. My potions have saved countless lives and granted incredible power\n to those who were worthy of it. And yet you dare to insult them? You are nothing but a mere mortal, while my potions are the embodiment of\n magical mastery.  Look both ways before you cross the street next time, get cursed!\"\n\ntl;dr --> Mess around and find out, you just got cursed by a wizard\n");
                		}
          System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 4) // Goblin shows up and offers teeth (teeth)
        	{
          		System.out.println("A small goblin enters enters the room.  Dressed in a loincloth, it looks almost pitiful in how it shuffles, dragging its feet across\n the floor on its way to you, almost stumbling as it limps.  It's face kind of looks untrustworthy.\n\nGoblin Gary: \"do you want my teeth?\"\n");
          			
          Question e4 = new Question("Yes","I don't know what to say...","No");
        	int c_e_4 = e4.getChoice();
          
          	if (c_e_4 == 1)
            	{
              		conc.setGoblinTeeth(true);
              		System.out.println("\nYou gain a bag of goblin teeth.  I don't want to describe how he did it... *Shudder*");
            	}
          	else if (c_e_4 == 2)
            	{
              		System.out.println("\nGoblin Gary: \"say yes\"\n\nType answer (yes or no): ");
              		String answer_e4 = scan.nextLine();
              		if (answer_e4.toLowerCase().equals("yes"))
                    	{
                      		conc.setGoblinTeeth(true);
                      		System.out.println("\nYou gain a bag of goblin teeth.  I don't want to describe how he did it... *Shudder*");
                    	}
              		else if (answer_e4.toLowerCase().equals("no"))	
                    	{
                      		System.out.println("\nGoblin Gary: \"You sure?\"\n\nType answer: ");
              			String doesNotMatter = scan.nextLine();
              		System.out.println("\nGoblin Gary: \"alright, your loss.  good luck.\"");
                    	}
              		else if (answer_e4.toLowerCase().equals("or"))
                    	{
							System.out.println("\nYou think you probably did something smart there, huh?  Well do ya punk? Do ya?  Typing \"or\" to my question.  You little fool, you\n cretin, you animal... No one cares for that humor, no one cares for what you did there, and no one wants that.  It's not funny, it\n serves no purpose, and does nothing to add to this game.  You have added nothing, gained nothing, and done nithing but waste my, and yours, but\n especially my, time.  Go on to the next encounter you defiler of story.");
                    	}
              		else
                    	{
                      		System.out.println("Brother, learn to type, yes or no, it was simple.  Go on the next encounter, you don't deserve this one.");
                    	} 
            	}
      		else
            	{
              		System.out.println("\nGoblin Gary: \"You sure?\"\nType answer: ");
              			String doesNotMatter = scan.nextLine();
              		System.out.println("\nGoblin Gary: \"alright, your loss.  good luck.\"");
            	}
          System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 5) // Nerd shows up and asks for stats (Dumb)
        	{
          		System.out.println("This lackey lookin, no strength havin, nerd enters the chambers.  He has glasses on and the face of a nerd, and clothes like\n one too.  He comes up to you and asks if you want to see your game stats.\n");
          			Question e5 = new Question("No, definetly not","Never, stop, leave, get out of here, what are you","Not on my life\n", 2);
          			
        			int c_e_5 = e5.getChoice();
          			
          		if (c_e_5 == 1 || c_e_5 == 2 || c_e_5 == 3)
                	{
                  		conc.setCool(true);
                 		conc.setBrain(true);
                  		conc.setWealth(true);
                  		conc.setSad(false);
                  		conc.setDumb(false);
                  		conc.setFat(false);
                  		System.out.println("\nCarter's about to beat up the nerd, but you stop him.  This ones yours.  You beat him up, you stomp him, you throw him around.  The\n nerd has the gall, nay, the audacity, to show his face in these parts, and that alone is enough to make someone sick.  Good job, you\n made the right choice.  Take a bunch of stat bonuses for your concubine");
                	}
          		else 
                	{
                  		conc.setCool(false);
                 		conc.setBrain(false);
                  		conc.setWealth(false);
                  		conc.setSad(true);
                  		conc.setDumb(true);
                  		conc.setFat(true);
                  		System.out.println("\nYou don't learn, do you Carter.  How many times will I have to teach you this lesson, man?  Carter Mitchell Betts, the one\n who just choose to look at their stats again.  You made the wrong choice.  I'm giving your Carter a bunch of stat losses in case you\n gained any already, do better next time.");
                	}
          		System.out.println("\nEnter a button to start next encounter:  ");
          	pause2 = scan.nextLine();
          	System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");	
        	}
    	else if (x == 6) // Buff dude asks for lifting buddy (buff, wealth)
        	{
          		System.out.println("This absolutely swole, chunky, meatloaf of a man enters while pumping iron.  Not even the effeminate swank of his\n riding clothes could hide the enormous power of that body — he seemed to fill those glistening boots until he strained the top lacing\n and you could see a great pack of muscle shifting when his shoulder moved under his thin coat. It was a body capable of enormous\n leverage — a cruel body\n\nTom Buchanan: \"Hey, bro, could you spot me?  I need a spot for this sick 135 bench I'm about to get.\"\n");
          Question e6 = new Question("Of course bro, I got ya","I'll spot, but I will criticize your form throughout the entire experience","If you need a spotter, you simply don't believe in yourself enough");
          	int c_e_6 = e6.getChoice();
          		int re6 = e6.random(20);
          
          if (c_e_6 == 1)
          	{
            	System.out.println("\nTom Buchanan: \"Nice, thanks bro.  Hey bro, you mind if I borrow your conc bro for a little zonk before my pr, if you know what I'm saying?  Thanks.\"\n\nHe zonks with " + conc.getName() + " for a minute, then gets ready to pr.  He gets up to the bar, " + conc.getName() + " already down there so he is spotting, and starts.");
         		System.out.println("\nEnter a button to see how Hank does:  ");
          	pause2 = scan.nextLine();
            System.out.println("\nHe's not making it.  Tom is actively failing, and he needs help.  " + conc.getName() + " goes in for the save, and grabs hold of the bar, straining to lift it.");
          if (conc.getBuff())
                	{
                  		conc.setWealth(true);
                  		System.out.println("\nIt's not even a challenge for " + conc.getName() + ".  He's been curling 135 since he was pre-natal, and he eats nails for breakfast, with a side of\n hard fact and logic.  Actually, " + conc.getName() + " just power cleans the bar, throws it overhead, and it lands elegantly back on the bar hold\n with a cartoonish slow fall, as if it were a mere featehr to " + conc.getName() + "'s strongth.  Tom is in awe, and leaves quickly, hoping to not\n offend such a powerful man such as " + conc.getName() + ", his infinite power being the only force capable of instilling fear in such a bro.  Before\n leaving, Tom hands " + conc.getName() + " a wad of cash as thank you, and it smells of fear.");
                	}
                else if (re6 > 12)
                	{
                  		conc.setBuff(true);
                  		conc.setFriend(true);
						System.out.println("\n\n" + conc.getName() + " does it.  His hold is true, his muscles glistening, his spider monkey forearms rippling with the effort.  The bar inches up\n and just reaches the holds, saving Tom's life, and making " + conc.getName() + " look powerful.  It's a good moment, and a laugh is shared as\n Tom sees he can still improve before taking on the 135 challenge again.  He thanks you, and leaves to continue his journey.");
                	}
                else
                	{
                  		conc.setSad(true);
                  		conc.setFat(true);
                  		System.out.println("\n" + conc.getName() + "'s close, but he just can't do it.  What were we even thinking, 135 is too much for any human, much less a concubine and a cocky\n bro lifter.  We were so preoccupied with wether we could lift 135, we didn't stop to think if we should, and now Tom is dead.  Dead\n as dirt.  Dead as lead.  More than dead.  He's a failure, and his hubris was his demise.  Now, all thats left to remember him is\n his sweatband, and gallon jug of water and tren. ");
                	}
          }
          else if (c_e_6 == 2)
          	{
            	if (re6 > 8)
                {
					System.out.println("\nTom Buchanan: \"Oh, ok.  Actually, that's great, I've been in need of a little form correction lately, and it'll only help me later on when I'm\n lifting, as it's important to remember proper form bro, even when hitting massive juicy pr's bro.\"");
                	System.out.println("\nEnter a button to see how Hank does:  ");
          	pause2 = scan.nextLine();
            System.out.println("\nHe's not making it.  Tom is actively failing, and he needs help.  Carter goes in for the save, and grabs hold of the bar, straining to lift it.");
                if (conc.getBuff())
                	{
                  		conc.setWealth(true);
                  		System.out.println("\nIt's not even a challenge for " + conc.getName() + ".  He's been curling 135 since he was pre-natal, and he eats nails for breakfast, with a side of\n hard fact and logic.  Actually, " + conc.getName() + " just power cleans the bar, throws it overhead, and it lands elegantly back on the bar hold\n with a cartoonish slow fall, as if it were a mere featehr to " + conc.getName() + "'s strongth.  Tom is in awe,a dn leaves quickly, hoping to not\n offend such a powerful man such as " + conc.getName() + ", his infinite power being the only force capable of instilling fear in such a bro.  Before\n leaving, Tom hands " + conc.getName() + " a wad of cash as thank you, and it smells of fear.");
                	}
                else if (re6 > 13)
                	{
                  		conc.setBuff(true);
                  		conc.setFriend(true);
						System.out.println("\n" + conc.getName() + " does it.  His hold is true, his muscles glistening, his spider monkey forearms rippling with the effort.  The bar inches up\n and just reaches the holds, saving Tom's life, and making " + conc.getName() + " look powerful.  It's a good moment, and a laugh is shared as\n Tom sees he can still improve before taking on the 135 challenge again.  He thanks you, and leaves to continue his journey.");
                	}
                else
                	{
                  		conc.setSad(true);
                  		conc.setFat(true);
                  		System.out.println("\n" + conc.getName() + "'s close, but he just can't do it.  What were we even thinking, 135 is too much for any human, much less a concubine and a cocky\n bro lifter.  We were so preoccupied with wether we could lift 135, we didn't stop to think if we should, and now Tom is dead.  Dead\n as dirt.  Dead as lead.  More than dead.  He's a failure, and his hubris was his demise.  Now, all thats left to remember him is\n his sweatband, and gallon jug of water and tren. ");
                	}
                }
            	else 
                {
                  conc.setSad(true);
					System.out.println("\nTom Buchanan: \"Uh, yeah no, bro, I don't need you criticizing my form over here, I'm fine.  I'll just hit the bench without a spotter.  See you later bro.\"");
                }
          	}
          else
          	{
				System.out.println("\nTom Buchanan: \"I can understand that kind of reasoning bro, But it's not just about the physical safety, it's also a philosophical thing, man. You\n see, lifting weights is a metaphor for life. It's about pushing yourself to your limits, challenging yourself to be better, and\n never giving up. And just like in life, we all need a little help sometimes. Having a spotter is like having a trusted friend\n by your side, someone who believes in you and your goals. They're there to support you when you need it, to give you that extra\n boost of confidence, and to ensure that you can go all out without fear of injury. But more than that, having a spotter is about\n trust.  A trust you just broke, bro.  I'll see you later bro, when you've matured and grown not just as a lifter, but as an individual.\"");
          	}
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 7) // Merchant offers books, weapons, or armor (brain, sword, armour, super sword, super armour)
        	{
      System.out.println("A merchant, Ethan Vaughn, enters the room.  He sort of looks like this:  \n\nEnter button to see picture of Ethan Vaughn:  ");
          pause2 = scan.nextLine();
          
          System.out.println("       __");
          System.out.println("      /  \\");
          System.out.println("      \\__/ ");
          System.out.println("    ___|___");
          System.out.println("       |     ");
          System.out.println("       /\\");
          System.out.println("      /  \\");
          
          System.out.println("\nEnter button to see Ethan with hat on:  ");
          	pause2 = scan.nextLine();
          
          System.out.println("       /\\  <-- cool hat");
          System.out.println("     _/__\\_");
          System.out.println("      \\__/ ");
          System.out.println("    ___|___");
          System.out.println("       |     ");
          System.out.println("       /\\");
          System.out.println("      /  \\");
          
          System.out.println("\nPlease just use your imagination, I'm running out of ideas here man.\n\nEnter button to continue:  "); 
          	pause2 = scan.nextLine();
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
          System.out.println("As Ethan approaches, you notice he is rolling a cart alongside him.  The cart is adorned with rows of gleaming swords and suits of\n armor, each with unique designs and patterns.  Dusty tomes and ancient stories are piled high on little shelves, promising\n secrets and knowledge waiting to be discovered.  The merchant greets you with a wide smile and a twinkle in his eye.\n\nEthan Vaughn: \"\"What can I offer you today? A sword to defend yourself, armor to keep you safe, or a book to unlock new ideas?  Some other\n merchant, Dhophiar, has been stealing my routes, so I can only offer one item, and then I'll have to go.  Sorry for the inconvenience.");
          	System.out.println("\nEnter button to continue:  ");
          		pause2 = scan.nextLine();
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          	if (conc.getWealth())
            	{
              		System.out.println("\n\nEthan Vaughn: \"By the way, I can notice a jingling in the pocket when its near.  I smell the coin in your pocket.  Quite frankly, your loaded.  With\n this in mind, I can offer you a choice from my special collection, my super sword and my super armour.  Take a look now:\"");
            	}
          System.out.println("\nHere are the items that most stand out to you:  \n\n 1:  Books - For your brain, makes you smarter, maybe...\n 2:  Sword - For stabbing\n 3:  Armour - For blocking stabbing without having to think about blocking\n 4:  Insurance - For those afraid to lose");
          	if (conc.getWealth())
            	{
              		System.out.println(" 5:  Super Sword - For stabbing harder than your average stabbing device\n 6:  Super Armour - Blocks harder than normal, also spelled in the British style");
            	}
          System.out.println("\nEnter a number to choose which item you want to buy (enter 7 to not buy anything, but it will make Ethan sad.  He may not show it, but just know that he feels it if you do not buy anything):  ");
          	int buyed = scan.nextInt();
          		boolean purchaseMade = false;
          
                  	while (!purchaseMade)
                    	{
                    	if (buyed == 5 && conc.getWealth())
                            {
                              	conc.setArmor(true);
                          		conc.setWealth(false);
                          		purchaseMade = true;
                            }
                  		else if (buyed == 6 && conc.getWealth())
                            {
                              	conc.setInsurance(true);
                          		conc.setWealth(false);
                          		purchaseMade = true;
                            }
                  		if (buyed == 1)
                            {
                              	conc.setBrain(true);
                          		conc.setWealth(false);
                          		purchaseMade = true;
                            }
                  		else if (buyed == 2)
                            {
                              	conc.setSword(true);
                          		conc.setWealth(false);
                          		purchaseMade = true;
                            }
                  		else if (buyed == 3)
                            {
                              	conc.setArmor(true);
                          		conc.setWealth(false);
                          		purchaseMade = true;
                            }
                  		else if (buyed == 4)
                            {
                              	conc.setInsurance(true);
                          		conc.setWealth(false);
                          		purchaseMade = true;
                            }
                  		else if (buyed == 7)
                            {
                              	System.out.println("\nEthan Vaughn: \"It's all good, sorry none of my stuff intersted you, thanks for your time!\"");
                          		purchaseMade = true;
                            }
                        else
                            {
                                System.out.println("\nTry again, just one of the numbers, not that hard...\n\nEnter number of purchase:  ");
                          		buyed = scan.nextInt();
                  			}
                    	}
          System.out.println("\nEthan leaves the castle, and you prepare for whatever is to come next...");
          
          System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 8) // Rock paper scissors match (brain, sad)
        	{
          System.out.println("A mistress of the martial arts enters the room.  You can tell because she is wearing a Wudang Taoist Robe.  Approaching you, she carries\n an aura of emmenence and power.  It's pretty stifling.\n\nJean Sue: \"HELLO!  I come today to challenge you to a rock paper scissors match!  As explaioned in the Roalin code of combat, we\n will now fight, first to three points.  ROCK, PAPER, SCISSORS, SHOO-\"");
          	Question e8 = new Question();	
          		int rps = 1;
          
          int herA = e8.random(3);		// 1 --> Rock | 2 --> Paper | 3 --> Scissors
          	int hpHER = 3;
          		int hpYOU = 3;
        while (hpHER > 0 && hpYOU > 0)
          {
          herA = e8.random(3);
          	System.out.println("\nChoose one:\n\n 1: Rock\n 2: Paper\n 3: Scissors");
          		rps = scan.nextInt();
          		while (rps < 1 || rps > 3)
                	{
                  		System.out.println("\nType in a 1, a 2, or a 3 please...\n");
                  			rps = scan.nextInt();
                	}
          if (herA == 1)
          	{
            	if (rps == 1)		// Rock tie
                	{
                  		System.out.println("\n     TIE\n\nJean Sue: \"Ah, a fellow sophisticate of the rock gambit, but who will stick to it the longest...\"");
                	}
            	else if (rps == 2)		//Your Paper beats her Rock
                	{
                  		hpHER -= 1;
                  System.out.println("\n     WIN\n\nJean Sue: \"How'd he know I was going for the rock gambit?  I may have to change up my moves...\"");
                	}
            	else				// Her Rock beats your Scissors
                	{
                  		hpYOU -= 1;
                  System.out.println("\n     LOSS\n\nJean Sue: \"My rock wins!  I will pummel you...\"");
                	}
          	}
          else if (herA == 2)
          	{
            	if (rps == 1)		// Her Paper beats your Rock
                	{
                  		hpYOU -= 1;
                  System.out.println("\n     LOSS\n\nJean Sue: \"My paper covers your rock, thats a point for me!\"");
                	}
            	else if (rps == 2)		// Paper tie
                	{
                  		System.out.println("\n     TIE\n\nJean Sue: \"Two open palms, two papers set against each other, two forces equal in strength...\"");
                	}
            	else				// Your Scissors beat her Paper
                	{
                  		hpHER -=1;
                  System.out.println("\n     WIN\n\nJean Sue: \"HUH!?! (He's cutting through me like butter...)\"");
                	}
          	}
          else
          	{
            	if (rps == 1)		// Your Rock beats her Scissors
                	{
                  		hpHER -= 1;
                  System.out.println("\n     WIN\n\nJean Sue: \"GAH!  (How did he know I was going to go scissors?  His reflexes, nay, his mind is working faster than mine!)\"");
                	}
            	else if (rps == 2)		// Her Scissors beats your Paper
                	{
                  		hpYOU -=1;
                  		System.out.println("\n     LOSS\n\nJean Sue: \"You choose paper to my scissors, an easy mistake, but it might be your last...\"");
                	}
            	else				// Scissors tie
                	{
                  		System.out.println("\n     TIE\n\nJean Sue: \"Two scissors, two blades, but who will cut first?\"");
                	}
          	}
          }
          if (hpHER == 0)
          	{
            	conc.setBrain(true);
            	conc.setCool(true);
            	conc.setSad(false);
            	System.out.println("\n     YOU WON THE MATCH\n\nJean Sue: \"WHA- HO- NA-... ok.  Good job!  It seems I still have a lot to learn, so I guess I'll go meditate for forty years on a nearby mountain...\"\n\nJean leaves heartbroken, but determied to become better.  You know in your heart she will never improve, and that any resistance\n to your skill is futile.  You share a laugh with " + conc.getName() + " and prepare for what is to come next.");
            	System.out.println();
          	}
          else
          	{
            	conc.setDumb(true);
            	conc.setCool(false);
            	conc.setSad(true);
            	System.out.println("\n     YOU LOST THE MATCH\n\nJean Sue: \"Guess you can't win them all, huh... I'll just leave and, uh, sharpen my skills elsewhere... See ya sometime...  Later, maybe...  Probably\n not actually, your pretty bad at rock paper scissors...\"\n\nThat hurts.  That hurts a lot.  I don't even know if rock paper scissors is sacriligious for monks, but that one just wrecked your life up.  Just,\n uh, prepare your self for the next adventure or something...  ");
          	}
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 9) // Doctor comes by and offers free *strongness* medicine - Tren (buff up, brain down)
        	{
          		System.out.println("A very certified medical professional enters the chambers.  He carries with him a doctorate in excercise science, and\n he has the largest muscles you have ever seen, like, truely.  He fills out his doctorly lab coat like it was another\n layer of skin, while his stethoscope forms a kind of collar on his neck, the muscles and veins pushign it far past\n how wide it should bend.");
          		System.out.println("\nDoc McStuffins Sr.: \"Aloha, my bro.  Do you wanna get BIG and STRONG, or do you wana stay SMALL and PUNY for the rest of your life?\"\n");
          
          		Question e9 = new Question("Since the day I was born, I've craved muscle","I don't really know, I've never really wanted to be larger or smaller than I am now","I'm fwine bwein a SMALL and PUNY wittle man mistwa Dwoctwa.  I wike bwein a wittle bwabwy");
          			int c_e_9 = e9.getChoice();
          
          		if (c_e_9 == 1)
                	{
                  		conc.setBuff(true);
                  		conc.setPumpBlessing(true);
                  		System.out.println("\nDoc McStuffins Sr.: \"PERFECT.  Time to get SWOLE.  Time to get BIG and STRONG.  You ready?  You ready to make you daily donation of SWEAT, BLOOD,\n and TEARS to the temple of IRON for that sweet holy belssing of PUMP!  HUH!?!?\"\n\n" + conc.getName() + " leaps down the stairs.  He's ecstatic, he's excited, he's ready.  Him and Doc start pumping, they start sweatin,\n they start movin their bodies to the rythm of the metal as their muscles grow and contract to the force.  It's beautiful,\n nay, its something even better.  It's an adjective for something slightly more than something beautiful.  Like pretty, but better.\n\nDoc McStuffins Sr.:\"That was a good pump, thanks bro!\"");
                	}
          		else if (c_e_9 == 2)
                	{
                  		conc.setTren(true);
                  		System.out.println("\nDoc McStuffins Sr.:\"I, too, was once SMALL and AFRAID of change as you are now young BROTHER.  But you know what helped?  You know what got me\n into the right MIND to WORKOUT and LIFT?!?!  IT WAS TREN.  ALL OF IT WAS TREN.  TREN ALL ALONG.  TREN bologna sandwhich!  TREN\n smoothie!  TREN wife!  TREN kids!  TREN EVERYTHING BROTHER!!!  TTTRRREEEEEEEEENNNNNNNNNNN!!!  TTTRRREEEEENNNNNNN!!!\"\n\nHe is on the ground actively convulsing.  There is spittle leaving his mouth as he crawls towards the door.  He doesn't make it all\n the way, he stops to microdose some tren and eat a tren Heidelburger.  He leaves.  Something happened here, but I\n don't know what else to say.  You gain tren.");
                	}
          		else
                	{
						conc.setBaby(true);
                  		System.out.println("\nDoc leaves, he doesn't do well with babies.");
                	}
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 10) // Dog shows up (kindness, sad)
        	{
          		System.out.println("A dog enters the chambers, one of the best boys you've ever laid eyes on.  His tail wags, his ears froop, his nose even boops, he\n has it all.  This DAWG, this roaddawg, this day one, this ride or die, comes up to nuzzle you\n");
          
          		Question e10 = new Question("Give him a belly rub","Boop his nose","Scratch behind the ears");
          			int c_e_10 = e10.getChoice();
          
          		if (c_e_10 == 1)
                	{
                  		conc.setKindness(true);
                  		conc.setSad(false);
						System.out.println("\nThis dog is already on his back, and he knows what needs to be done.  You give him a belly rub and you feel it for\n the first time in years.  Not just calmness, not just serenity, but a feeling almost foreign to you at this point.  You\n feel happy.  You know woith certainty, this is a good boy.");
                	}
          		else if (c_e_10 == 2)
                	{
                        conc.setKindness(true);
                  		conc.setSad(false);
						System.out.println("\nThat nose is too cute to not just boop.  You go in for the boop, finger approaching, heart tightening, nerves firing.  Will\n he like it?  Will he respond negatively?  You remember hearing once that dogs don't like their noses being touched.  Your about\n to pull away, but he goes in.  The good boy knows what you wants, and he gets that nose booped perfectly.  Something wells up in\n you, something you haven't felt for years.  It's happiness.  You feel joy.");
                	}
          		else
                	{
                        conc.setKindness(true);
                  		conc.setSad(false);
						System.out.println("\nThis good boy already knows.  He lowers his head and his ears froop a little off to the sides, and you scratch him behind the\n ears.  He's wagging his tail, he's laying down now, he's such a good boy.  When you stop, he looks up to you and gives you that\n puppy dog look with his eyes, the one that says \"Hey wait, pet me some more!\" and you can't help but keep petting.  Something wells\n up in you, something you haven't experienced in years.  You feel happy.");
                	}
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 11) // Poor man shows up and asks for money (wealth, kindness)
        	{
          		System.out.println("A poor man of the streets enters wearing some brown Gucci rags.  Quite fashionable an hour ago, but now merely scraps\n compared to the current fashion trend, blue Gucci rags\n\nAndrew Carnegie: \"Good sir, good Kingman, oh holy of all holies!  Please, I beseech of you, I am but a poor oil baron\n of the high class, and all my friends are wearing more fashionable cothes than me!  I know, I know, why not pay my workers\n more, but sir, they do not deserve the wealth I have accrued through my shrewed investments into child labor and mining!  If\n they needed the money so bad, they would just work harder, so it's not my problem...\"\n");
          		
          Question e11 = new Question("Pay the man what he needs to not be embarrased around his friends","I don't know man, I also need this cash to buy some blue rags, or I may look not fashionable either...","Pay the kids");
          	int c_e_11 = e11.getChoice();
          
          System.out.println("\nEnter a button to continue:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
          
          	if (c_e_11 == 1)
            	{
              		conc.setWealth(false);
              		conc.setKindness(true);
              		System.out.println("Andrew Carnegie: \"Aye thanks bro, I needed this, like, real bad.  Them kids been toilin in the mines too long for me to not have this sick fashion, you\n get me?  Yeah, you get me.  By the by, I'll name a sector of the most dangerous part of the mines in your honor, man, thanks.\"\n\nHe leaves the building, and your thinking about gettign some rags for yourself.  Don't want to look liek your not with the times\n in todays day and age, but alas, your wallets feeling lighter after paying that man just now...");
            	}
          else if (c_e_11 == 2)
            	{
              		System.out.print("\nAndrew Carnegie: \"Hey man, that's all good, do what makes YOU happy, while all us HARD WORKING people suffer under your regime.  You know what, I work TOO HARD to take this!\"\n\nHe runs up and fights Carter, who, unsurprisingly, ");
            			int re11 = e11.random(20);
            		if (conc.getBuff())
                    {
                      System.out.print("destroys the living bejeezes out of that Carnegie fella.  Absolutely demolishes.  Like, I'm\n looking at this right now, and it looks almost like a one-sided MMA fight.  " + conc.getName() + " just keeps pulling haymaker\n after haymaker on this poor guy.  It's over and you win, good job.\n");
                    }
            		else
                    {
            			if (re11 > 10)
                    	{
                          	conc.setBuff(true);
                          	conc.setWealth(true);
                      		System.out.print("beats up Andrew Carnegie.  The poor man doesn't really stand a chance, his\n rags are totally last years fashion, an absolute blunder when you take into account the fact that, as KingMan, you've been secretly\n using your KingMan FBI to pull the strings behind the scenes and guide the public towardss certain fashion trends.  You already invented\n blue rags, and you can just invent another, and another.  Carnegie has no chance agaisnt such power, and crumples to " + conc.getName() + ".\n");
                    	}
            			else
                    	{
                          	conc.setWealth(false);
                          	conc.setHurt(true);
							System.out.print("loses the fight to Andrew Carnegie.  Why didn't we see this comning?  Andrew Carnegie\n has the power of time and oil on his side, there was never really a chance to win this fight.  " + conc.getName() + " crumples to the ground as\n Carnegie takes a victorious lap.\n\nAndrew Carnegie: \"You know what, I'm allright, I don't need the money from some lowly WEAK cowards too afraid to support local business in their\n area.  Au revoir, Bezos!\"\n");
                    	}
                    }
          		}
          else
            	{
            		conc.setKindness(true);
            		conc.setWealth(false);
            		conc.setHurt(false);
              		System.out.println("Those kids have worked hard enough\n\nAndrew Carnegie: \"WHA- N- STOP!!!  Those KIDS you talk about are the lifeblood essence of this entire society.  PAYING THEM, as you so casually are doing, will\n offset the entire balance of the universe, everyone knows this.  Kids mine, we profit, thjey internalize their anger and grow into\n strong, hardworking individuals, devoid of most soul and feeling, but better workers nonetheless.  Paying them could offset everything,\n it might even give them HOPE you monster\"\n\nYou have Carnegie taken to the royal dungeons for disobedience.  On this day, the children will smile once more...");
            	}
          System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 12) // Ask girl for her number (cool, sad)
        	{
          		System.out.println("This super cool, rad, and comely woman enters the room.\n\nKailley: \"Wassup nerdsters, I brought this GateDash order for... a " + conc.getName() + " guy?\"\n\nYou have never laid eyes on a more beautiful creature in all your years on this planet.  If I were to compare her to a summer's\n night, it would not begin to explain her beauty, for she makes the sunset look bland in comparison, and her eyes shine brighter than the\n stars.  What do you do?\n");
          		Question e12 = new Question("Make " + conc.getName() + " ask her out for you in the most romantic way he can","Respect her bounderies as a random worker trying to make a living and simply pay her","Humuna humana humana humuna humuna Humuna humana humana humuna humuna Humuna humana humana humuna humuna Humuna humana humana humuna humuna Humuna humana humana humuna humuna Humuna humana humana humuna humuna humuna humuna Humuna humana humana humuna humuna humuna humuna Humuna humana humana humuna humuna Humuna humana humana humuna humuna Humuna humana humana humuna humuna Humuna humana");
          			int c_e_12 = e12.getChoice();
          
          	if (c_e_12 == 1)
            {
              conc.setSad(true);
              conc.setBrain(true);
              conc.setHurt(true);
              System.out.println(conc.getName() + " goes down to her and starts laying the moves.\n\n" + conc.getName() + ": \"Oh fairest maiden of yore, oh mistress of\n love yet unrequited, oh lady of love and life, your approach is like the sun arriving over the darkest of my nights...  My KingMan,\n the one above, the hailer of all chicanery, the one known as the 'Sentinel of the Night' and the greatest of all KingMan, he asks\n for yourt hand in marriage... Do you reply?\"\n\nKailley: \"...\"\n\n" + conc.getName() + ": \"AH, I have not yet greased your palm of his love, well, let me tell you of how much he adores you...  Your eyes are so pretty that-\"\n\nKailley: \"My eyes aren't that pretty...\"");
              System.out.println("\nEnter a button to continue:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
              System.out.println(conc.getName() + ": \"And she says her eyes hold no significance, but they will forever hold my gaze.  With every glance you take the stars look away, for\n your eyes could blind even the heavens.\"\n\nKailley: \"Are you saying my eyes would scare away the stars?\"\n\n" + conc.getName() + ": \"NO- uh- If your eyes were to carry Medusa's curse, I would still stare, so that my body could gaze at perfection, for eternity.\"\n\nShe smiles to you.  Ah, and when she grinned at me, I'd finally felt the spring come to wash away the eternal winters of this Earth\n we walk, for no sun nor star could ever dream to shine as brilliantly as she.  And she leaves the room like a moon leaving the sky for\n it's... Hold up she's leaving\n\n" + conc.getName() + ": \"Milady, MILADY, wait, please, I'll do anything!  ANYTHINGGG!\"\n\nAnd just like that, the spark of your love eternal burnt it's final flare into the pitch black darkness.");
            }
          	else if(c_e_12 == 2)
            {
              conc.setSad(true);
              conc.setCool(true);
              conc.setWealth(false);
              conc.setKindness(true);
              System.out.println("\nYou pay her the base fee for the delivery and tip well, 20% as she came by faster than expected...  And as she leaves, you can't help\n but think of what could have been, of what hole is left behind as you see her close that door so gently...  \n\nI have met the ocean at my feat.  I have kissed the sun's rays at the close of day.  I have had misfortune and fortune dress my path.  I\n have seeked and found, lost and destowed.  But never have I yearned to quench a thirst that only your absence can deny.  Find my\n heart within the realms of your existence, because within my thoughts you are so painfully out of reach.  Goodbye...");
            }
          	else
            {
              conc.setBrain(false);
              conc.setDumb(true);
              System.out.println("\nAwooga");
            }
          
          
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 13) // Wizard shows up and offers to heal Carter (heal)
        	{
          		conc.setHurt(false);
          		System.out.println("A wizard of some magical forest shows up and heals " + conc.getName() + ", he also gives you a free healing potion just in case you\n need it, that's it, end of encounter.");
          conc.setHealthPotion(true);
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 14) // Nothing happens in this encounter, got skipped for time
        	{
          		
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 15) // Poet shows up and keeps asking for something (brain, wealth)
        	{
          		System.out.println("A bard looking fella enters the chambers and starts to speak.\n\nWilliam: \"Heart pounding with joy, Meeting the king of new shores, Excitement abounds.\"\n\nBrother just said a haiku, this is looking like it could become something...\n");
          		Question e15 = new Question("Respond back with a haiku","Respond back with slam poetry","Respond back with a simple sentence sructure, no art at all");
          			int c_e_15 = e15.getChoice();
          
          		if (c_e_15 == 1)
                {
                  conc.setBrain(true);
                  conc.setDumb(false);
                  conc.setCool(true);
					System.out.println("\n\tOh, great King, your haiku's fine,\n\t A master of words, a poet divine,\n\t Your words paint a picture, vivid and clear,\n\t And fill my heart with joy and cheer. \n\n\tYour haiku spoke of a meeting so grand,\n\t With my humble presence, you took a stand,\n\t You spoke of my verses with praise so high,\n\t That it lifted me up to the sky. \n\n\tOh, how I cherish your kind words,\n\t They are music to my ears, like the songs of birds,\n\t You inspire me to write with greater skill,\n\t And give my heart and soul to every quill. \n\n\tAs a bard, I seek to inspire and delight,\n\t To bring light to darkness, and day to night,\n\t Your haiku fills me with inspiration anew,\n\t And I vow to craft a poem, just for you.");
                	System.out.println("Sufficiently poemed out, you thank the bard for his art and wish him luck in his upcoming travels.");
                }
          		else if (c_e_15 == 2)
                {
                  conc.setBrain(true);
                  conc.setDumb(false);
                  conc.setCool(true);
                  System.out.println("\n\tOh, snap, King, you just threw down,\n\t Your slam poetry skills, they astound,\n\t You spoke of our meeting with such hype,\n\t Got me feeling like I'm on cloud nine. \n\n\tYour rhymes were tight, your flow was sick,\n\t Your words hit hard, like a drumstick,\n\t You brought the fire, you brought the heat,\n\t You left me in awe, with every beat. \n\n\tYou gave me props, you gave me praise,\n\t You elevated my name, in so many ways,\n\t You made me feel like a legend, a star,\n\t Got me believing I can go so far. \n\n\tAs a bard, I aim to bring the heat,\n\t To keep the rhymes fresh, and never repeat,\n\t Your slam poetry got me inspired,\n\t Got me feeling like my soul's been wired. \n\n\tSo here's to you, oh great King,\n\t Your words of praise, they make my heart sing,\n\t I'll keep the slam poetry vibe alive,\n\t And continue to make words come alive.");
                	System.out.println("Poet Todd thanks you for the opportunity to show off his skill, and leaves");
                }
          		else
                {
                  conc.setSad(true);
                  conc.setBrain(false);
                  System.out.println("\nPoet Todd: \"Well you know just how to suck the joy out of something don't you.\"\n\nTodd leaves");
                }
          System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 16) // You play catch with Carter (throwing)
        	{
          		System.out.println(conc.getName() + ": \"You know my Kingman, I never got to play catch with my Father growing up.  There were a lot of other psychgological things that\n messed me up, but this was the main one, truthfullly.  Would you play catch with me?\"\n");
          Question e16 = new Question("Yes, I'll play ball","Catch the ball from you guy, maybe throw it around a little with him, get him to catch your ball (s)","I'm allright");
          	int c_e_16 = e16.getChoice();
          if (c_e_16 == 1 || c_e_16 == 2)
          {
            conc.setThrow(true);
            conc.setSad(false);
            System.out.println("\n" + conc.getName() + ": \"Hey man, thanks for this\"\n\nYou play ball.  Yeah, you catch some ball and throw it back.  You guys are just two boys playin ball.  Two guys having a great\n time.  Two confident males just playing a game of catch with each other and having a great time while doing it.  Somewhere\n four hours later " + conc.getName() + " hits his catching limit and is too tirewd to go on.  Nice job bro, that was a rad game of \"catch\"");
          }
          else
          {
            System.out.println(conc.getName() + ": \"Oh, ok- *SNIFFLE- I didn't even want to anyway, catch is for nerds...\"");
          }
          
          		System.out.println("\nEnter a button to start next encounter:  ");
          pause2 = scan.nextLine();
          System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        	}
    	else if (x == 17)
        	{
          Question e17 = new Question();
				System.out.println(conc.getName() + ": \"My Kingman, someone approaches from outside!  WAIT, IT'S QUE-\"\n\nThe individual enters the chambers.  It's the QueenMan!  But how?  How could she even be here, she died!\n\nQueenMan: \"I didn't die, I faked my death...  and I'm back for the throne.  I've seen everything you've done, as I was testing you, and I\n wanted to make sure if you could properly rule once I actually die one day, but seeing today and what has happened, I can\'t\n accept this.  You are not fit to be KingMan, and for that reason, you must die.\"");
				System.out.println("\n");
				System.out.println("Enter button to continue: ");
				pause2 = scan.nextLine();
  System.out.println("     ______                                                                        ______                                       ___      __                                                                              ");
  System.out.println("    |  ___ \\                 ____      __                                         |  ___ \\                  ___      __        |    \\   |  |                                                                        ");
  System.out.println("    | |   \\ \\     _     _    |    \\   |  |                                        | |   \\ \\     _     _    |    \\   |          |  |\\ \\  |  |         __     _                                                                       ");
  System.out.println("    | |    | |   | |   | |   |  |\\ \\  |  |           __                           | |    | |   | |   | |   |  |\\ \\  |  |       |  | \\ \\ |  |        /   \\  / /                                                                  ");
  System.out.println("    | |___/ /    | |   | |   |  | \\ \\ |  |          |  \\                          | |___/ /    | |   | |   |  | \\ \\ |  |       |  |  \\ \\   |       / / \\ \\/ /      /\\    /     /\\  /  /\\/  nnnnnnnn...                                     ");
  System.out.println("    |______/     | |___| |   |  |  \\ \\   |          |   |  |  |   /\\  /           |______/     | |___| |   |  |  \\ \\   |       |  |   \\ \\  |      / /   \\  /      /  \\  /     /  \\/                                                             ");
  System.out.println("                 |_______|   |  |   \\ \\  |          |__/   |__|  /  \\/                         |_______|   |  |   \\ \\  |       |__|    \\___|     /_/     \\/      /    \\/                                                                ");
  System.out.println("                             |__|    \\___|                                                                 |__|    \\___|                                                                                             ");
  
  System.out.println("\nThat's right, I never saw a body, so how could I ever trust that she died... But wait!  What's that?  I have to die?  OH NO!!!\n\n" + conc.getName() + ": \"Don't worry my KingMan, I'll defeat her and save you, just you watch!\"\n\n" + conc.getName() + " Goes down to fight the QueenMan for you.");
        System.out.println("\n\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");            

  System.out.println("\nAllright, good job chamnp, good going pal, nice work!  You've made it to the endgame!  All the decisions you have made\n up to this point have impacted your concubine in various ways, with each decision forming items you have gained, or\n stats buffs / debuffs " + conc.getName() + " has gained.  These different aspects will now come into play with this final fight\n against QueenMan, so I will print out you current inventory for you to see everything you have, item wise (the stats are invisible!), and\n then, you can begin the fight and make choices!  Yaaayyyy!");
  System.out.println("\nEnter button to see inventory: ");
  pause2 = scan.nextLine();
  
  System.out.println("\n\tWeapons\t\t\t\t\tArmour\t\t\t\t\tItems");
  
  String[][] inventory = new String[3][6];
          for (int r = 0; r < 3; r++)
          {
			for (int c = 0; c < 6; c++)
            {
				inventory[r][c] = "";
            }
          }
       if (conc.getSuperSword())
       {
			inventory[0][0] = "Super Sword - Big power";
       }
       else if (conc.getSword())
       {
			inventory[0][0] = "Sword - Some Power" ;
       }
       else
       {
         	inventory[0][0] = "Fists - For punching";
       }
        
       if (conc.getSuperArmour())
       {
         inventory[1][0] = "Super Armour - British spelling";
       }
       else if (conc.getArmor())
       {
         inventory[1][0] = "Armor - Some defense            ";
       }
       else
       {
         inventory[1][0] = "None - Your naked.  Like fully   ";
       }
          						
          if (conc.getGoblinTeeth())		
       {
         	inventory[2][0] = "Goblin Teeth - ???";
       }
          if (conc.getTren())		
       {
         	inventory[2][1] = "Tren - Buff boost";
       }
          if (conc.getHealthPotion())		
       {
         	inventory[2][2] = "Health Potion - For healing";
       }
          if (conc.getSpeedPotion())		
       {
         	inventory[2][3] = "Speed Potion - Cocaine";
       }
          if (conc.getStrengthPotion())		
       {
         	inventory[2][4] = "Strength Potion - Stronk";
       }
          if (conc.getAcid())		
       {
         	inventory[2][5] = "Acid - Burns";
       }
       System.out.println("\n\t" + inventory[0][0] + "\t\t\t" + inventory[1][0] + "\t\t" + inventory[2][0]);
       System.out.println("\n\t" + inventory[0][1] + "\t\t\t" + inventory[1][1] + "\t\t\t\t\t\t\t" + inventory[2][1]);
       System.out.println("\n\t" + inventory[0][1] + "\t\t\t" + inventory[1][1] + "\t\t\t\t\t\t\t" + inventory[2][2]);
       System.out.println("\n\t" + inventory[0][1] + "\t\t\t" + inventory[1][1] + "\t\t\t\t\t\t\t" + inventory[2][3]);
       System.out.println("\n\t" + inventory[0][1] + "\t\t\t" + inventory[1][1] + "\t\t\t\t\t\t\t" + inventory[2][4]);
       System.out.println("\n\t" + inventory[0][1] + "\t\t\t" + inventory[1][1] + "\t\t\t\t\t\t\t" + inventory[2][5]);
        
       System.out.println("Once ready to start the fight, just enter a button: ");
          pause2 = scan.nextLine();
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
          
          int QHP = 25;
          	int QSpeed = 6;
          	int QSTR = 8;
          	int QA = 6;
          	boolean QR = false;
          	int QD = 1;
          int QCount = 0;
          int CCount = 0;
          
          int CHP = 20;
            	int CSpeed = 2;
          		int CSTR = 2;
          		int CA = 0;
          		boolean CR = false;
          		int CD = 0;
          
            if (conc.getBuff())
            {
              CHP += 3;
              CSTR += 1;
              CD += 1;
            }
          if (conc.getFat())
            {
              CHP += 3;
              CSpeed -= 1;
            }
          if (conc.getPumpBlessing())
          {
            CHP += 3;
            CSTR += 1;
            CA += 2;
          }
          if (conc.getBrain())
          {
			CA += 3;
          }
          if (conc.getKindness())
          {
            CA += 1;
          }
          if (conc.getDumb())
          {
            CA -= 2;
            CSpeed -= 1;
            CSTR += 1;
          }
          if (conc.getCool())
          {
			CSpeed += 1;
            CHP += 1;
            CA += 1;
          }
          if (conc.getBaby())
          {
            CHP -= 4;
            CSpeed -= 2;
            CA -= 1;
          }
          if (conc.getSad())
          {
            CHP -= 2;
            CSpeed -= 1;
            if (CSTR > 2)
            {
				CSTR -= 1;
            }
          }
          if (conc.getFriend())
          {
            CA += 1;
          }
          if (conc.getHotDog())
          {
            CHP += 10;
            CA += 3;
            CSpeed += 3;
            CSTR += 3;
          }
          if (conc.getSuperSword())
          {
			CSTR += 7;
            QD += 2;
          }
          else if (conc.getSword())
          {
			CSTR += 4;
            QD += 1;
          }
          
          if (conc.getCursed())
          {
        	  QA += 2;
        	  QD += 1;
        	  QSTR += 2;
          }
          
          if (conc.getSuperArmour())
          {
			CD += 5;
            QSTR += 3;
          }
          else if (conc.getArmor())
          {
            CD += 3;
            QSTR += 1;
          }
          int cho;
          boolean trueVictory = false;
       		boolean usedHealth = false;
          	boolean usedStrength = false;
          	boolean usedSpeed = false;
          	boolean TEETH = false;
         	boolean TREN = false;
          	boolean ACID = false;
          
          while (QHP > 0 && CHP > 0)
       {
          System.out.println("\n\n" + conc.getName() + " has " + CHP + " health left\nQueenman has " + QHP + " health left\n\nwhat does " + conc.getName() + " do?\n\n1: " + inventory[0][0]);
          
          if (!inventory[2][0].equals(""))
          {
			System.out.println("2: " + inventory[2][0]);
          }
          if (!inventory[2][1].equals(""))
          {
			System.out.println("3: " + inventory[2][1]);
          }
          if (!inventory[2][2].equals(""))
          {
			System.out.println("4: " + inventory[2][2]);
          }
          if (!inventory[2][3].equals(""))
          {
			System.out.println("5: " + inventory[2][3]);
          }
          if (!inventory[2][4].equals(""))
          {
			System.out.println("6: " + inventory[2][4]);
          }
          if (!inventory[2][5].equals(""))
          {
			System.out.println("7: " + inventory[2][5]);
          }
         
         cho = scan.nextInt();
         	if (cho == 1)
            {
              int rc1 = e17.random(20);
            	if (rc1 > (8 - CA + QSpeed))
                {
                  System.out.println("\n" + conc.getName() + " manage's to hit Queenman and deal " + (CSTR - QD) + " damage to her");
                  QHP -= (CSTR - QD);
                }
				else
                {
					System.out.println("\nQueenMan manages to dodge the swipe and evade damage\n");
                }
              if (QHP > 0){
              System.out.print("\nQueenman goes in to stab with her blade, and she");
              int rq1 = e17.random(20);
              if (rq1 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
              }
            }
         	else if (cho == 2 && !inventory[2][0].equals(""))		// Goblin Teeth
         	{
              if (TEETH)
              {
                System.out.println("\nSomehow the goblin teeth are back in your pocket after throwing them.  They must have grown back.  Weird...");
              }
              System.out.print("\n" + conc.getName() + " throws the goblin teeth at Queenman and ");
				int rc2 = e17.random(100);
              TEETH = true;
              if (conc.getThrow())
              {
				rc2 += 25;
              }
              if (rc2 > 91)
              {
				System.out.print("hits her with them\n\nQueenman: \"Oh no!  How did you know goblin teeth are my only weakness in this entire game dude!  NNOOOOOOOO!!!\n\nShe melts, you win!\"");
                QHP -= QHP;
                trueVictory = true;
              }
              else
              {
                System.out.print("misses.  I guess you should have trained his throwing arm more...\n\nQueenMan: \"Are those goblin teeth?  Why do you have goblin teeth?  How do you even acquire that kind of thing?\"");
                if (QHP > 0){
                System.out.print("\n\nQueenman goes in to stab with her blade, and she");
              int rq1 = e17.random(20);
              if (rq1 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
                }
              }
         	}
         else if (cho == 3 && !inventory[2][1].equals(""))			// Tren
         	{	
				if (TREN)
                {
                  System.out.println("\nYou always have more tren.  You'll never run out of tren.  TREN FOR LIFE BABBBYYYYYYY!!!");
                }
				System.out.println("\n" + conc.getName() + " starts shooting up tren into his system.  It fills his veins and he feel stronger (stat bonuses)");
              		TREN = true;
           			CSTR += 3;
              		CD += 1;
           			CA += 1;
                    CSpeed += 2;
           System.out.print("\nQueenman goes in to stab with her blade, and she");
              int rq1 = e17.random(20);
              if (rq1 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
         	}
         else if (cho == 4 && !inventory[2][2].equals(""))			// Health Potion
         	{
           if (usedHealth){
           System.out.println("\nYour flask for healing is empty, you seem to recall ALREADY DRINKING IT...");
           }
           else{
           int rq1 = e17.random(3);
				System.out.println(conc.getName() + " drinks from the healing poition and gains " + (10 - rq1 + CA) + " points of health");
           CHP += (10 - rq1 + CA);
             usedHealth = true;
           System.out.print("\nQueenman goes in to stab with her blade, and she");
              int rq2 = e17.random(20);
              if (rq2 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
           }
         	}
         else if (cho == 5 && !inventory[2][3].equals(""))			// Speed Potion
         	{
           if (usedSpeed){
             System.out.println("\nYou already snorted all your booger sugar, all your black rock, all your hard rock, all your snow coke, all your blow, all your crack, all\n your sneeze, all your speedball, all your whiterock (why is this and blackrock both slang, I don't know), all your angel dust.  You\n snorted it all bro...");
           }
           else{
             System.out.println("\n" + conc.getName() + " does a line of cocai- uh, I mean, drinks the \"speed\" potion and feels faster\n");
           				usedSpeed = true;	
             		CSpeed += 7;
           			CA += 2;
           System.out.print("\nQueenman goes in to stab with her blade, and she");
              int rq2 = e17.random(20);
              if (rq2 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
           }
         	}
         else if (cho == 6 && !inventory[2][4].equals(""))			// Strength Potion
         	{
           		if (usedStrength)
                {
                  System.out.println("\nBottle empty, no drink no more.  Me sad");
                }
           		else
                {
				System.out.println(conc.getName() + " drinks the strength potion and feels stronger (wow, big surprise)\n");
           			usedStrength = true;
           			CSTR += 5;
           			CA += 1;
           		System.out.print("\nQueenman goes in to stab with her blade, and she");
              int rq2 = e17.random(20);
              if (rq2 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
                }
         	}
         else if (cho == 7 && !inventory[2][5].equals(""))			// Acid
         	{
           if (ACID)
           {
             System.out.println("You already used the acid, can't you remember Lucy in the Sky with Diamonds...");
           }
           else{
				if (conc.getDumb())
                {
					int rq2 = e17.random(20);
                  if (rq2 < 11)
                  {
                    System.out.println("\nThere is a dumbness stat.  Some choice you made earlier gave " + conc.getName() + " dumbness.  " + conc.getName() + " drinks the acid\n" + conc.getName() + " takes " + (11 - rq2) + " damage from gurgling acid");
                    CHP -= (11 - rq2);
                    System.out.print("\nQueenMan is simply taken aback at how dumb that was, like truly idiotic");
                    ACID = true;
                  }
                  else
                  {
                    System.out.print("\n" + conc.getName() + " throws the acid at QueenMan and ");
                    ACID = true;
                    int rq3 = e17.random(20);
                    if (rq3 > (8 - CA + QSpeed))
                    {
                      int rq4 = e17.random(3);
						System.out.print("hits, managing to deal " + (1 + rq4) + " corrosive damage, as well as weaken QueenMans defense (armor melt)");
                      QHP -= (1 + rq4);
                      QD -= 2;
                      if (QHP > 0){
                      System.out.print("\nQueenman goes in to stab with her blade, and she");
              int rq12 = e17.random(20);
              if (rq12 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
                      }
                    }
                    else
                    {
                      System.out.print("misses");
                      System.out.println("\nQueenman goes in to stab with her blade, and she");
              int rq9 = e17.random(20);
              if (rq9 > (8 - QA + CSpeed))
              {
				System.out.print(" manages to slice through and deal " + (QSTR - CD) + " damage to " + conc.getName());
                CHP -= (QSTR - CD);
              }
              else
              {
                System.out.print(" misses");
              }
                    }
                  }
                }
          		else
          		{
          			if (ACID)
          			{
          				System.out.println("You already used the acid, can't you remember Lucy in the Sky with Diamonds...");
          			}
          			else
          			{
             		System.out.print("\n" + conc.getName() + " throws the acid at QueenMan and ");
                    int rq6 = e17.random(20);
                    if (rq6 > (8 - CA + QSpeed))
                    {
                      int rq5 = e17.random(3);
                      ACID = true;
						System.out.print("hits, managing to deal " + (1 + rq5) + " corrosive damage, as well as weaken QueenMans defense (armor melt)");
                      QHP -= (1 + rq5);
                      QD -= 2;
                    }
                  else 
                  {
                   System.out.print("misses");
                  }
          		}
          		
           }
           }
         	}
         else
         	{
				System.out.println("\nPlease select a proper number on the next go around\n");
         	}
            
         if (QHP < 1 && conc.getCursed() && QCount != 1)
         {
           QCount += 1;
           QHP = 1;
           QSpeed += 1;
           QSTR += 1;
           QA += 1;
           
           System.out.println("\nQueenMan falls to the ground as " + conc.getName() + " raises his arms victoriously.  The battle is won and you prepare to run over\n when... HUH?!?... QueenMan is getting back up again?!?  As she gets up, the words of Dhophiar the potion merchant ring in your head, and\n you remember how he cursed you for insulting him and his potions all that time ago.  Queenman has risen for one more chance.");
         }
         if (CHP < 1 && conc.getInsurance() && CCount != 1)
         {
			CCount += 1;
           CHP = 1;
           System.out.println("Insurance.  Insurance, insurance, insurance.  If you ever want something done you have to do it yourself.  With the insurance aiding\n his step, " + conc.getName() + " gets up for one more fight.");
         }
        
       }
          System.out.println("\nEnter button to see final lines: ");
          pause2 = scan.nextLine();
          pause2 = scan.nextLine();
          
          if (QHP < 1)
          {
            System.out.println("\n" + conc.getName() + " did it.  He really did it.  QueenMan's lifeless corpse slides off into a random chasm that just appeared.  As she falls, you\n can't help but remember the love you felt for her all those years ago, the memories you shared, and the lives you built, together.  Now, all\n you see is " + conc.getName() + " as he runs over to you, tired from the fight, and a little bruised.  You think a litle, and you realize\n life with " + conc.getName() + "wouldn't be so bad after all.  Yeah, life could be pretty cool now that your free again.  For a\n moment there, you thought you might have to deal with QueenMan's inlaws again (the horror), but now you laugh jauntily with " + conc.getName() + " as\n you ride into the sunset, a trail of happiness in your wake as the life ahead looks bright, and boy, it's just beginning. \nBut that's a story for another time...\n\n\t\t\tFin");
          conc.setWin(true);
          }
          else
          {
            System.out.println("\n" + conc.getName() + " falls, and the blood pours from open wounds as QueenMan takes her rusty blade out of his belly.  As his body hits\n the ground, his widening eyes meet yours for one final solitary glance as the spirit leaves and the eyes dull out, looking far past\n you, no linger focused.  " + conc.getName() + " is dead, and QueenMan kicks him aay as she approaches you.  Without resistance, you merely\n accept your fate, knowing that death would bring you back to the only one you loved, the one no longer on this Earth.  Her blade\n enters your chest, and you die...\n\n\t\t\tFin");
          }
     }
  }
  
  public static int getNumEncounters()
  	{
		return encounters;
  	}
  
}