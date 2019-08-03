import java.util.*;

public class CollegeFeeCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to CollegeFeeCalculator!");
        System.out.println("Please enter your name");
        String userName = s.nextLine();

        System.out.println("Please enter the no. of credit hours");
        int creditHours = s.nextInt();
        s.nextLine();
        if (creditHours < 1 || creditHours > 21) {
            return;
        }

        int residencyTuition = 0;
        String residencyString;
        System.out.println("Please select the appropriate residency" + "\n" + "1. In-state" + "\n" + "2. Out-of-state" + "\n" + "3. International");
        int residency = s.nextInt();
        if (residency == 1) {
            residencyString = "In-state";
            if (creditHours <= 8) {
                residencyTuition = 350 * creditHours;
            }
            else {
                residencyTuition = 4996;
            }
        }
        else if (residency == 2) {
            residencyString = "Out-of-state";
            if (creditHours <= 8) {
                residencyTuition = 950 * creditHours;
            }
            else {
                residencyTuition = 14397;
            }
        }
        else {
            residencyString = "International";
            if (creditHours <= 8) {
                residencyTuition = 1020 * creditHours;
            }
            else {
                residencyTuition = 15397;
            }
        }

        int rentingExpense = 0;
        int housingExpense = 0;
        String housingString;
        System.out.println("Please select your housing" + "\n" + "1. ON-Campus" + "\n" + "2. OFF-Campus");
        int housing = s.nextInt();
        s.nextLine();
        if (housing == 1) {
            System.out.println("Please select the residence hall \n1. Earhart \n2. Hillenbrand \n3. Owen \n4. Windsor");
            int residenceHall = s.nextInt();
            if (residenceHall == 1) {
                housingExpense = 4745;
            }
            else if (residenceHall == 2) {
                housingExpense = 4150;
            }
            else if (residenceHall == 3) {
                housingExpense = 5307;
            }
            else {
                housingExpense = 4130;
            }
        }
        else {
            System.out.println("Please input your monthly rent: ");
            int rent = s.nextInt();
            rentingExpense = rent * 5;
        }
        if (housing == 1) {
            housingString = "ON-Campus";
        }
        else {
            housingString = "OFF-Campus";
        }

        int mealPlanExpense = 0;
        String mealPlanString;
        System.out.println("Are you purchasing a meal plan?: \n1. Yes \n2. No ");
        int mealPlan = s.nextInt();
        if (mealPlan == 1 ) {
            mealPlanString = "Yes";
            mealPlanExpense = 1500;
        }
        else {
            mealPlanString = "No";
        }

        int totalHousingExpenses = 0;
        totalHousingExpenses = housingExpense + mealPlanExpense + rentingExpense;
        int totalSemesterFee = 0;
        totalSemesterFee = totalHousingExpenses + residencyTuition;

        System.out.println("\nName: " + userName + "\nCredit Hours: " + creditHours + "\nResidency: " + residencyString + "\nHousing: " + housingString + "\nMeal Plan: " + mealPlanString + "\nHousing Expenses: " + totalHousingExpenses + "\nTuition Fee: " + residencyTuition + "\nTotal Sem. Fee: " + totalSemesterFee);
    }
}
