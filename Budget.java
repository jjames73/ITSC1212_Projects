public class Budget {
    public static void main(String[] args) {
        // ***********
        // Project 1
        // ***********

        //declaring all variables up here
        double hourlyWageCost = 10;
        double rentCost = 625;
        double internetSerCost = 27;
        double groceryBillCost = 250;
        double allowanceCost = 150;
        double savingsCost = 100;
        double hoursPerWeekRounded;
        double hoursOfSavingsRounded;
        double weeklyExpensesCost;
        double savingsCalCost;
        double weeklySavingsExpense;
        // the total expenses = $1,052
        // total expenses and saving $100 = $1,152

        //adding up the expenses
        // I need to find out divide the total expenses by 4(week)
        // Then I need to divide that by the hourlyWage to find my hours per week

        double totalExpenses = rentCost + internetSerCost + groceryBillCost + allowanceCost;
        weeklyExpensesCost = (totalExpenses / 4);
        hoursPerWeekRounded = (Math.ceil(weeklyExpensesCost / hourlyWageCost));
        savingsCalCost = (savingsCost + totalExpenses);
        weeklySavingsExpense = (savingsCalCost / 4);
        hoursOfSavingsRounded = (Math.ceil(weeklySavingsExpense / hourlyWageCost));
        //you get 26 hours if you divide regularly but need it to be 27 hours
        //to make it 27 I had it round up with Math.ceil()
        //same method was used to round up hours with savings included
        //this way you could change the wage and still get the correct budget

        //typecasting double to int
        int rent = (int) rentCost;
        int internetSer = (int) internetSerCost;
        int groceryBill = (int) groceryBillCost;
        int allowance = (int) allowanceCost;
        int totalMonthlyExpenses = (int) totalExpenses;
        int hoursPerWeek = (int) hoursPerWeekRounded;
        int hourlyWage = (int) hourlyWageCost;
        int savings = (int) savingsCost;
        int savingsIncluded = (int) hoursOfSavingsRounded;
        int savingsCalc = (int) savingsCalCost;


        // ****** PRINTING OUT BUDGET PLAN *******
        System.out.println("Budget Planner");

         //A space for neatness
         System.out.println(" ");

        System.out.println("The hourly wage is: $" + hourlyWage);

         //A space for neatness
         System.out.println(" ");

        System.out.println("Monthly Rent: $" + rent);
        System.out.println("Internet Servic: $" + internetSer);
        System.out.println("Grocery Bill: $" + groceryBill);
        System.out.println("Allowance Fund: $" + allowance);
        System.out.println("Total Monthly Expenses: $" + totalMonthlyExpenses);

        //A space for neatness
        System.out.println(" ");
        
        // ******** RESULTS ********
        // the number of hours needed

        //conclusion on how many hours is needed a week with current wage
        System.out.println(hoursPerWeek + " hours per week are needed to cover your monthly expenses with a wage of $" + hourlyWage);

         //A space for neatness
         System.out.println(" ");

        //savings included
        System.out.println("Additionally saving $100 would bring monthly expenses up to $" + savingsCalc);

        //A space for neatness
        System.out.println(" ");

        System.out.println(savingsIncluded + " hours per week is needed to save $" + savings + " a month");






    }
}
