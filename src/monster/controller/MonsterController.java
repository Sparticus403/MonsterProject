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
	}
}
