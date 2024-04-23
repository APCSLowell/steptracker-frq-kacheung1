import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private ArrayList <Intget> myDailySteps;
 private int active;

 public StepTracker(int steps)
 { 
  myDailySteps= new ArrayList <Integer>();
  active = steps;
 }

 public int activeDays()
 {
  int days=0;
  for (int s:myDailySteps)
   if (s>= active)
    days++;
  return days;
 }

 public double averageSteps()
 {
  if(myDailySteps.size()==0)
   return 0;
  double steps =0;
  for (int s:myDailySteps)
   steps+=s;
  return steps/myDailySteps.size();
 }
} 
