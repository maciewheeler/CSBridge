import javax.swing.*;

public class FAFSAGUI {

    public static void main(String[] args) {

        //FAFSA calculator

        int cont;

        do {

            //Welcome dialog
            JOptionPane.showMessageDialog(null, "Welcome to the FAFSA!", "Welcome", JOptionPane.INFORMATION_MESSAGE);

            //isAcceptedStudent dialog
            int acceptedProgram = JOptionPane.showConfirmDialog(null, "Have you been accepted into a degree or certifiate program?", "Program Acceptance", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            //isSSregistered dialog
            int ssRegistered = JOptionPane.showConfirmDialog(null, "Are you registered for the selective service?", "Selective Service", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            //hasSSN dialog
            int ssn = JOptionPane.showConfirmDialog(null, "Do you have a social security number?", "Social Security Number", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            //hasValidResidency dialog
            JOptionPane.showConfirmDialog(null, "Do you have valid residency status?", "Residency Status", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            //age dialog
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?", "Age", JOptionPane.QUESTION_MESSAGE));

            //invalid age given
            if (age < 0) {
                JOptionPane.showMessageDialog(null, "Age cannot be a negative number.", "Error: Age", JOptionPane.ERROR_MESSAGE);
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?", "Age", JOptionPane.QUESTION_MESSAGE));
            }

            //creditHours dialog
            int creditHours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credit hours do you plan on taking?", "Credit Hours", JOptionPane.QUESTION_MESSAGE));

            //invalid credit hours given
            if (creditHours < 1 || creditHours > 24) {
                JOptionPane.showMessageDialog(null, "Credit hours must be between 1 and 24, inclusive.", "Error: Credit Hours", JOptionPane.ERROR_MESSAGE);
                creditHours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credit hours do you plan on taking?", "Credit Hours", JOptionPane.QUESTION_MESSAGE));
            }

            //studentIncome dialog
            int studentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your total yearly income?", "Student Income", JOptionPane.QUESTION_MESSAGE));

            //invalid student income given
            if (studentIncome < 0) {
                JOptionPane.showMessageDialog(null, "Income cannot be a negative number.", "Error: Student Income", JOptionPane.ERROR_MESSAGE);
                studentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your total yearly income?", "Student Income", JOptionPane.QUESTION_MESSAGE));
            }

            //parentIncome dialog
            int parentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your parent's total yearly income?", "Parent Income", JOptionPane.QUESTION_MESSAGE));

            //invalid parent income given
            if (parentIncome < 0) {
                JOptionPane.showMessageDialog(null, "Income cannot be a negative number.", "Error: Parent Income", JOptionPane.ERROR_MESSAGE);
                parentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your parent's total yearly income?", "Parent Income", JOptionPane.QUESTION_MESSAGE));
            }

            //isIndependent dialog
            int dependent = JOptionPane.showConfirmDialog(null, "Are you a dependent?", "Dependency", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            //classStanding dialog
            String classStanding;
            Object[] selectionValues = {"Freshman", "Sophomore", "Junior", "Senior", "Graduate"};

            //ask for class standing
            int classSelection = JOptionPane.showOptionDialog(null, "What is your current class standing?", "Class Standing", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, selectionValues, selectionValues[0]);

            //change class selection to undergraduate or graduate standing
            if (classSelection <= 3) {
                classStanding = "Undergraduate";
            } else {
                classStanding = "Graduate";
            }

            //eligibility checks passed
            if (age <= 25 && age >= 18 && ssRegistered == 0 && ssn == 0 && acceptedProgram == 0) {

                //Expected Family Contribution
                int efc;

                if (dependent == 0) {
                    efc = studentIncome + parentIncome;
                } else {
                    efc = studentIncome;
                }

                //loans
                int loan = 0;

                if (creditHours < 9) {
                    loan = loan;
                } else if (dependent == 0) {
                    if (classStanding.equals("Undergraduate")) {
                        loan = 5000;
                    } else {
                        loan = 10000;
                    }
                } else if (dependent == 1) {
                    if (classStanding.equals("Undergraduate")) {
                        loan = 10000;
                    } else {
                        loan = 20000;
                    }
                }

                //grants
                int grant;

                if (efc > 50000) {
                    grant = 0;
                } else if (classStanding.equals("Graduate")) {
                    grant = 0;
                } else if (creditHours < 9) {
                    grant = 2500;
                } else {
                    grant = 5775;
                }

                //work study
                int workStudy;

                if (efc > 50000) {
                    workStudy = 0;
                } else if (efc > 40000) {
                    workStudy = 500;
                } else if (efc > 30000) {
                    workStudy = 1000;
                } else {
                    workStudy = 1500;
                }

                //total awards
                int totalAwards = loan + grant + workStudy;

                //display awards
                if (totalAwards == 0) {
                    JOptionPane.showMessageDialog(null, "Sorry, you do not qualify for Financial Aid.", "Ineligible", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Loans: $" + loan + "\n" + "Grants: $" + grant + "\n" + "Work Study: $" + workStudy + "\n" + "\n" + "Total: $" + totalAwards, "FAFSA Results", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            //eligibility checks not passed
            else {
                int loan;
                int grant;
                int workStudy;
                int totalAwards;

                //total awards
                loan = 0;
                grant = 0;
                workStudy = 0;
                totalAwards = loan + grant + workStudy;

                //display awards
                JOptionPane.showMessageDialog(null, "Sorry, you do not qualify for Financial Aid.", "Ineligible", JOptionPane.INFORMATION_MESSAGE);
            }

            cont = JOptionPane.showConfirmDialog(null, "Would you like to complete another Application?", "Continue", JOptionPane.YES_NO_OPTION);

        } while (cont == JOptionPane.YES_OPTION);

    }

}
