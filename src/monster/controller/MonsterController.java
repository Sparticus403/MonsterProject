package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster monster;
	
	public MonsterController()
	{
		monster = new MarshmallowMonster("Fredrick", 3.0, 2, false, 6, 1);
	}
	

	public void start()
	{
		System.out.println("here is my monster: " + monster);
		System.out.println("My monster has this many eyes: " + monster.getEyeCount());
		if(monster.getEyeCount() > 3)
		{
			System.out.println("Thats a lot of eyes!! - Scary");
		}
		System.out.println("My monster has this many antennas: " + monster.getAntennaCount());
		System.out.println("My monster has this many noses: " + monster.getNoseCount());
		System.out.println("My monster has " + monster.)
	}
}
