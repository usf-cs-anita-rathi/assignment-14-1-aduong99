class HandShakes
{
	public int howManyHandShakes(int num)
	{
		return handShake(num);
	}
	public static int handShake(int num) 
	{ 
		--num;
		if (num!=0)
			return num + handShake(num);
		else
			return 0;
	}
}