package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster monster;
	
	public MonsterController()
	{
		monster = new MarshmallowMonster("Fredrick",
											3,
											2,
											false,
											6,
											1);
	}
	/* name is fredrick
	 * arm = 6
	 * antenna = 3
	 * eyes = 2
	 * no bellybutton
	 * nose = 0 */

	public void start()
	{
		System.out.println("here is my monster: " + monster);
	}
}
