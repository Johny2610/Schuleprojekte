import java.io.*;

public class Tastatur
{
  public static char leseZeichen ()
  {
    try
    {
      return leseText ().charAt (0);
    }
    catch (Exception e)
    {
      return ' ';
    }
  }

  public static int leseZahl ()
  {
    try
    {
      return Integer.parseInt (leseText ());
    }
    catch (Exception e)
    {
      return 0;
    }
  }

  public static double leseKommazahl ()
  {
    try
    {
      return Double.parseDouble (leseText ().replace (',', '.'));
    }
    catch (Exception e)
    {
      return 0;
    }
  }
  public static String leseText ()
  {
    try
    {
      BufferedReader reader =
        new BufferedReader (new InputStreamReader (System.in));
        return reader.readLine ();
    }
    catch (Exception e)
    {
      return "";
    }
  }
}
