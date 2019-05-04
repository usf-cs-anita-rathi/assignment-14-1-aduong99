public class HaystackDemo 
{
  public static void main(String[] args) 
  {
    System.out.println("\n Is String found = "+contains("Programming","grammy"));
  }
     
   public static boolean contains(String hayStack, String needle) 
   {
    if ((hayStack == null) || (needle == null) || hayStack.isEmpty()) 
    {
      return false;
    }
    else if (hayStack.startsWith(needle)) 
    {
      return true;
    }
    else 
    {
      return contains(hayStack.substring(1), needle);
    }
  }
}

