//SeatBookingProgram

import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner obj = new Scanner (System.in);
    int s = 0;
      System.out.
      print
      ("Hey Welcome!Book Seat of your choice...Total 40 Seats Available");
    int h = 1, seats = 40;
    int arr[] = new int[seats];
    for (int i = 2; i != h; i++)
      {
	if (i != 2)
	  h = obj.nextInt ();
	if (h == 1)
	  {
	    int flag = 1, flag1 = 1;
	      System.out.print ("\nEnter your Full Name: ");
	    String name = obj.next ();
	      System.out.print ("\nSelect Seat no.\nFrom Seat Number: ");
	    int start1 = obj.nextInt ();
	      System.out.print ("\nTo Seat Number: ");
	    int end1 = obj.nextInt ();

	    if (end1 < start1)
	      {
		System.out.print ("\nPlease enter a valid end seat number\n");
	      }
	    else
	      {
		for (int k = 0; k < s; k++)
		  {
		    if (start1 == arr[k])
		      {
			flag = 0;
		      }

		    if (end1 == arr[k])
		      {
			flag1 = 0;
			break;
		      }
		  }


		if (flag == 0 && flag1 == 0)
		  {
		    System.out.
		      print ("\n No seats available in this slot.\n");
		  }
		else if (flag == 1 && flag1 == 0)
		  {
		    System.out.
		      print ("\n No seats available in this slot.\n");
		  }
		else if (flag == 0 && flag1 == 1)
		  {
		    System.out.
		      print ("\n No seats available in this slot.\n");
		  }
		else
		  {
		    for (int k = start1; k <= end1; k++)
		      {
			arr[s] = k;
			s++;
		      }
		    System.out.print ("\nGreat " + name +
				      "! your Booking is done\n");
		  }
	      }
	  }
	else
	  {
	    break;
	  }
	System.out.print ("Available seats: ");

	for (int k = 1; k <= seats; k++)
	  {
	    int count = 0;
	    for (int d = 0; d < s; d++)
	      {
		if (k == arr[d])
		  {
		    count++;
		  }
	      }
	    if (count == 0)
	      System.out.print (k + " ");
	  }
	System.out.
	  print ("\nType 1 if you want to book again otherwise press 0\n");
      }
  }
}
