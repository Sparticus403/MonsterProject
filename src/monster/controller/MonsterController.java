package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster monster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		monster = new MarshmallowMonster("Fredrick", 3.0, 2, false, 6, 1);
		keyboardInput = new Scanner(System.in);
	}
	

	public void start()
	{
		System.out.println("here is my monster: " + monster);
		System.out.println("My monster has this many eyes: " + monster.getEyeCount());
//		if(monster.getEyeCount() > 3)
//		{
//			System.out.println("Thats a lot of eyes!! - Scary");
//		}
		System.out.println("My monster has this many antennas: " + monster.getAntennaCount());
		System.out.println("My monster has this many noses: " + monster.getNoseCount());
		System.out.println("My monster has " + monster.getArmCount() + " arms.");
		System.out.println("");
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			monster.setName(newName);
		}
		else
		{
			System.out.println("Fine, don't change my name!");
		}
		System.out.println(monster);
		
		System.out.println("What about my eyes? Do you want to change the amount?");
		String answerEyes = keyboardInput.nextLine();
		
		if(answerEyes.equalsIgnoreCase("yes"))
		{
			System.out.println("How many eyes do you want?");
			int moreEyes = keyboardInput.nextInt();
			monster.setEyeCount(moreEyes);
			if(monster.getEyeCount() > 2)
			{
				System.out.println("Many new eyes!");
			}
		}
		else
		{
			System.out.println("You crood! I didn't want them to change anyways!");
		}
		System.out.println(monster.getEyeCount() + " new eyes!");
		
		System.out.println("Change antennas?");
		String answerAnt = keyboardInput.nextLine();
		if(answerAnt.equalsIgnoreCase("yes"))
		{
			System.out.println("How many?");
			double moreAnt = keyboardInput.nextDouble();
			monster.setAntennaCount(moreAnt);
			if(monster.getAntennaCount() > 3.0)
			{
				System.out.println("I likey");
			}
		}
		System.out.println("Oooo " + getAntennaCount() + " Antennas!!!");
		
	}
}
