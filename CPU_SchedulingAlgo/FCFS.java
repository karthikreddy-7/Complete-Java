package CPU_SchedulingAlgo;

import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        System.out.println("This Program executes First Come First Serve CPU Scheduling Algorithm");
        System.out.println("Please Enter the Number of Processes: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] process = new String[n];
        int[] arrival = new int[n];
        int[] burst = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Process Id : ");
            process[i] = sc.next();
            System.out.println("Enter the arrival time of " + process[i]);
            arrival[i] = sc.nextInt();
            System.out.println("Enter the Burst time of " + process[i]);
            burst[i] = sc.nextInt();
        }
        int[] completion = new int[n];
        int[] turnaround = new int[n];
        int[] waiting = new int[n];
        // Finding completiontime[i] = CurrentTime + burst time[i]
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            if (currentTime < arrival[i]) {
                currentTime = arrival[i];
            }
            completion[i] = currentTime + burst[i];
            turnaround[i] = completion[i] - arrival[i];
            waiting[i] = turnaround[i] - burst[i];
            currentTime = completion[i];
        }
        double avgTurnaround = 0;
        double avgwaiting = 0;
        for (int i = 0; i < n; i++) {
            avgTurnaround += turnaround[i];
            avgwaiting += waiting[i];
        }
        avgTurnaround /= n;
        avgwaiting /= n;
        // printing the table
        System.out.println(
                "Processes |  Arrival Time  |  Burst Time  |  Completion Time | Turn Around Time | Waiting Time");
        for (int i = 0; i < n; i++) {
            System.out.print(
                    process[i] + "       |       " + arrival[i] + "           |     " + burst[i] + "           |     "
                            + completion[i]
                            + "           |    " + turnaround[i] + "     |     " + waiting[i]);
            System.out.println();
        }
        System.out.println("Average Turn Around Time is : " + avgTurnaround);
        System.out.println("Average Waiting Time is : " + avgwaiting);
        sc.close();
    }

}
