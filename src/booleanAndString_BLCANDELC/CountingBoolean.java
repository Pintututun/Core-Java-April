package booleanAndString_BLCANDELC;

public class CountingBoolean {
public static boolean countBoolean(boolean first,boolean second,boolean third)
{
    if(first==true)
    {
    	if(second==true||third==true)return true;
    	else return false;
    }
    if(second==true)
    {
    	if(first==true||third==true)return true;
    	else return false;
    }
    if(third==true)
    {
    	if(first==true||second==true)return true;
    	else return false;
    }
    else return false;
}
}
